import React, { useEffect } from "react";
import { useState } from "react";

const FetchList = () => {
  const urlList = "http://localhost:3000/product";

  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetch(urlList)
      .then((data) => data.json())
      .then((products) => setProducts(products));
  }, [urlList]);
  return (
    <div>
      {products.map((product) => (
        <li key={product.id}>{product.name}</li>
      ))}
    </div>
  );
};

export default FetchList;
