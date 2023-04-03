import React, { useState } from "react";

const ObjectComponent = () => {
  const initialProduct = { id: 301, name: "Cep Telefonu", price: 2350.0 };
  const [product, setProduct] = useState(initialProduct);

  const nameChanged = (event) => {
    setProduct({
      id: product.id,
      name: event.target.value,
      price: product.price,
    });
  };

  const priceChanged = (event) => {
    setProduct({
      ...product,
      price: event.target.value,
    });
  };

  const save = (event) => {
    event.preventDefault();
    alert(`Saklanıyor ${product.id} ${product.name} ${product.price}`);
  };

  return (
    <div>
      <h1>Nesne Bileşeni</h1>
      <br />
      {product.id} - {product.name} - {product.price} <br />
      <form onSubmit={save}>
        Özdeşlik : {product.id} <br />
        Ad : <input
          type="text"
          onChange={nameChanged}
          value={product.name}
        />{" "}
        <br />
        Eder :{" "}
        <input type="text" value={product.price} onChange={priceChanged} />{" "}
        <br />
        <input type="submit" value="Sakla" />
      </form>
    </div>
  );
};

export default ObjectComponent;
