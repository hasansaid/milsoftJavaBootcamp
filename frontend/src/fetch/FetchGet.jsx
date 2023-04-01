import React, { useEffect } from "react";
import { useState } from "react";

const FetchGet = () => {
  const urlList = "http://localhost:3000/product/301";

  const initialProduct = { id: 301, name: "Cep Telefonu", price: 8547 };
  const [product, setProduct] = useState({});

  useEffect(() => {
    fetch(urlList)
      .then((data) => data.json())
      .then((product) => setProduct(product));
  }, [urlList]);
  return (
    <div>
      <h1>Ürün Detay</h1>
      {product.id} -- -- {product.name}
    </div>
  );
};

export default FetchGet;
