import React, { useEffect, useState } from "react";
import pro from "../../../assets/14pro.png";
import { useNavigate, useParams } from "react-router-dom";

const ProductsComponent = ({ cartStatus }) => {
  const { categoryId } = useParams();
  const [cart, setCart] = useState(undefined);

  const urlList = `http://localhost:8080/api/product?category_id=${
    categoryId ?? 1
  } `;

  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/cart/get/1")
      .then((data) => data.json())
      .then((cart) => {
        setCart(cart);
        console.log(cart);
      });
    fetch(urlList)
      .then((data) => data.json())
      .then((product) => {
        setProducts(product);
        console.log(product);
      });
  }, [urlList]);

  let navigate = useNavigate();
  const goToProduct = (product) => {
    navigate(`/products/product/${product.productId}`, { state: { product } });
  };

  const addToBasket = (product) => {
    if (cart.cartStatus != "COMPLETED") {
      const url = `http://localhost:8080/api/cart/add/1/${product.productId}?quantity=1`;
      fetch(url, { method: "POST" }).then((response) => response.json());
    } else alert("Sepetiniz onaylanmıştır!!");
  };
  return (
    <div>
      <div className="row row-cols-1 row-cols-md-4 g-3">
        {products.map((product) => (
          <div key={product.productId} className="col">
            <div className="card h-100">
              <div className="d-flex justify-content-center">
                <img
                  src={require(`../../../assets/14pro.png`)}
                  className="card-img-top"
                  alt=""
                />
              </div>
              <div className="card-body">
                <h5 className="card-title">{product.productName}</h5>
                <p className="card-text">Ürün Açıklama</p>
                <small className="text-muted">₺{product.salesPrice}</small>
              </div>
              <div className="d-flex justify-content-end mb-3 mx-2">
                <button
                  onClick={() => goToProduct(product)}
                  className="btn btn-outline-secondary"
                >
                  Ürüne Git
                </button>
                <a href="/products/basket" className="default">
                  <button
                    onClick={() => addToBasket(product)}
                    className="btn btn-outline-dark mx-2"
                  >
                    Sepete Ekle
                  </button>
                </a>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default ProductsComponent;
