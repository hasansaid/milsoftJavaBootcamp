import React from "react";
import pro from "../../../assets/14pro.png";
import { useLocation, useNavigate } from "react-router-dom";

const ProductDetailComponent = () => {
  let navigate = useNavigate();
  let location = useLocation();
  const goToProducts = () => {
    navigate("/products");
  };
  const { product } = location.state;
  return (
    <div className="d-flex justify-content-center">
      <div class="col-md-6">
        <button onClick={goToProducts} class="btn text-muted mb-1">
          Ürünlere Dön
        </button>
        <div class="card h-100">
          <div class="d-flex justify-content-center">
            <img src={pro} class="card-img-top" alt="" />
          </div>
          <div class="card-body">
            <h5 class="card-title">{product.productName}</h5>
            <p class="card-text">Ürün Açıklama</p>
            <small class="text-muted">₺{product.salesPrice}</small>
          </div>
          <div class="d-flex justify-content-end mb-3 mx-2">
            <button class="btn btn-outline-dark mx-2">Sepete Ekle</button>
          </div>
        </div>
      </div>
    </div>
  );
};

export default ProductDetailComponent;
