import React from "react";
import { Route, Routes } from "react-router";
import HomePage from "../home-page/HomePage";
import CategoriesComponent from "../categories-page/CategoriesComponent";
import BasketPage from "../basket-page/BasketPage";
import ProductsComponent from "../categories-page/products/ProductsComponent";
import ProductDetailComponent from "../categories-page/product-detail/ProductDetailComponent";

const RoutesComponent = () => {
  return (
    <div>
      <Routes>
        <Route index element={<HomePage />}></Route>
        <Route path="/home" element={<HomePage />}></Route>
        <Route path="/products" element={<CategoriesComponent />}>
          <Route index element={<ProductsComponent />}></Route>
          <Route
            path="category/:categoryId"
            element={<ProductsComponent />}
          ></Route>
          <Route
            path="product/:productId"
            element={<ProductDetailComponent />}
          />
          <Route path="basket" element={<BasketPage />}></Route>
        </Route>
      </Routes>
    </div>
  );
};

export default RoutesComponent;
