import React, { useEffect, useState } from "react";
import { Link, useParams } from "react-router-dom";

const Products = () => {
  const { id } = useParams();
  const urlList = `http://localhost:8080/api/product?category_id=${id}`;
  console.log(urlList);

  const [products, setProducts] = useState([]);

  useEffect(() => {
    fetch(urlList)
      .then((data) => data.json())
      .then((product) => setProducts(product));
  }, [urlList]);
  return (
    <div className="row row-cols-1 row-cols-md-3 g-4">
      <div className="card" style={{ width: "18rem" }}>
        {products.map((product) => (
          <div key={product.productId}>
            <img src="..." className="card-img-top" alt="..." />
            <div className="card-body">
              <h5 className="card-title">{product.productName}</h5>
              <p className="card-text">Fiyat : {product.salesPrice}</p>
              <a className="btn btn-primary">
                <Link to={"/product/" + product.productId}>Ürüne git </Link>
              </a>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Products;
