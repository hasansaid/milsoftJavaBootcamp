import React, { useEffect, useState } from "react";
import pro from "../../../assets/14pro.png";
import { useNavigate, useParams } from "react-router-dom";

const ProductsComponent = () => {
  const { categoryId } = useParams();

  const urlList = `http://localhost:8080/api/product?category_id=${
    categoryId ?? 1
  } `;
  console.log(categoryId);

  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetch(urlList)
      .then((data) => data.json())
      .then((product) => setProducts(product));
  }, [urlList]);

  let navigate = useNavigate();
  const goToProduct = (product) => {
    navigate(`/products/product/${product.productId}`, { state: { product } });
  };
  return (
    <div>
      <div class="row row-cols-1 row-cols-md-4 g-3">
        {products.map((product) => (
          <div class="col">
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
                <button
                  onClick={() => goToProduct(product)}
                  class="btn btn-outline-secondary"
                >
                  Ürüne Git
                </button>
                <button class="btn btn-outline-dark mx-2">Sepete Ekle</button>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default ProductsComponent;
