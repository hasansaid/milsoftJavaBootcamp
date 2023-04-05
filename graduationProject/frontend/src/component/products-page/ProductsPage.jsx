import React, { useEffect, useState } from "react";
import "./styles-product.css";
import { Outlet } from "react-router-dom";
import ProductsComponent from "./products/ProductsComponent";
import ProductDetailComponent from "./product-detail/ProductDetailComponent";

const ProductsPage = () => {
  const urlList = "http://localhost:8080/api/category";

  const [categories, setCategories] = useState([]);

  useEffect(() => {
    fetch(urlList)
      .then((data) => data.json())
      .then((categories) => setCategories(categories));
  }, [urlList]);
  return (
    <div>
      <header>
        <nav
          id="sidebarMenu"
          className="collapse d-lg-block sidebar collapse bg-white"
        >
          <div className="position-sticky">
            <div className="logo fs-4 fw-bold ms-3 text-white">
              SERTKAYA MOBİL
            </div>

            <div className="list-group list-group-flush mx-3 mt-4">
              <a
                href="/home"
                className="list-group-item list-group-item-action py-2 ripple bg-transparent text-white border border-0"
                aria-current="true"
              >
                <h6>
                  <i class="bi bi-house"></i> Anasayfa
                </h6>
              </a>
              <a
                href="/products/basket"
                className="list-group-item list-group-item-action py-2 ripple bg-transparent text-white border border-0"
                aria-current="true"
              >
                <h6>
                  <i class="bi bi-bag"></i> Sepet
                </h6>
              </a>
              <a
                href="/products/basket"
                className="list-group-item list-group-item-action py-2 ripple bg-transparent text-white mt-3"
                aria-current="true"
              >
                <h6 className="d-flex align-items-end">
                  Kategoriler<i class="bi bi-caret-down-fill mx-2 d-flex"></i>
                </h6>
              </a>

              {categories.map((category) => (
                <a
                  key={category.categoryId}
                  href={`/products/category/${category.categoryId}`}
                  className=" list-group-item list-group-item-action py-2 ripple bg-transparent text-white border border-0 ms-0"
                >
                  <span className="d-flex align-items-center">
                    <i class="fa-xs bi bi-circle-fill d-flex me-2 font-5"></i>{" "}
                    {category.categoryName}
                  </span>
                </a>
              ))}
            </div>
          </div>
        </nav>
      </header>

      <main style={{ marginTop: "58px" }}>
        <div className="mx-5">
          <Outlet />
          {/* <ProductDetailComponent /> */}
        </div>
      </main>
    </div>
  );
};

export default ProductsPage;
