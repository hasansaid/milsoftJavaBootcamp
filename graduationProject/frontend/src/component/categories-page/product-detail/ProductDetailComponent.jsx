import React, { useEffect, useState } from "react";
import pro from "../../../assets/14pro.png";
import { useLocation, useNavigate } from "react-router-dom";

const ProductDetailComponent = () => {
  let navigate = useNavigate();
  let location = useLocation();
  const [cart, setCart] = useState(undefined);

  useEffect(() => {
    fetch("http://localhost:8080/api/cart/get/1")
      .then((data) => data.json())
      .then((cart) => {
        setCart(cart);
        console.log(cart);
      });
  });

  const goToProducts = () => {
    navigate("/products");
  };
  const { product } = location.state;

  const addToBasket = (product) => {
    if (cart.cartStatus != "COMPLETED") {
      const url = `http://localhost:8080/api/cart/add/1/${product.productId}?quantity=1`;
      fetch(url, { method: "POST" }).then((response) => response.json());
      navigate("/products/basket");
    } else alert("Sepetiniz onaylanmıştır!!");
  };
  return (
    <div className="d-flex justify-content-center">
      <div class="col-md-4">
        <button onClick={goToProducts} class="btn text-muted mb-1">
          Ürünlere Dön
        </button>
        <div class="card h-80">
          <div class="d-flex justify-content-center">
            <img
              src={require(`../../../assets/${product.image}`)}
              class="card-img-top w-80"
              alt=""
            />
          </div>
          <div class="card-body">
            <h5 class="card-title">{product.productName}</h5>
            <p class="card-text">Ürün Açıklama</p>
            <small class="text-muted">₺{product.salesPrice}</small>
          </div>
          <div class="d-flex justify-content-end mb-3 mx-2">
            <a href="/products/basket">
              <button
                onClick={() => addToBasket(product)}
                class="btn btn-outline-dark mx-2"
              >
                Sepete Ekle
              </button>
            </a>
          </div>
        </div>
      </div>
    </div>
  );
};

export default ProductDetailComponent;
