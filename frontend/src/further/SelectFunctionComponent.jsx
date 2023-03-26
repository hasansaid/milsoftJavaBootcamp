import React, { useEffect, useState } from "react";

const SelectFunctionComponent = () => {
  const products = [
    { id: 301, name: "Cep Telefonu", price: 2350.0 },
    { id: 302, name: "Masaüstü Bilgisayar", price: 50000.0 },
    { id: 303, name: "Dizüstü Bilgisayar", price: 10000.0 },
  ];
  const [product, setProduct] = useState({
    currentProductId: products[0].id,
    currentProduct: products[0],
  });

  const productChanged = (event) => {
    const currentProductId = Number(event.target.value);
    if (currentProductId === 0) {
      return null;
    }
    setProduct({
      currentProductId: currentProductId,
      currentProduct: products.find((p) => p.id === currentProductId),
    });
  };

  const save = () => {
    if (product.currentProductId !== 0) {
      alert(`Saklanıyor ${product.currentProduct.name}`);
    } else {
      alert("Saklanıyor boş");
    }
  };

  useEffect(() => {
    console.log(product);
  }, [product]);

  return (
    <div>
      Ürün Id: {product.currentProduct.id} <br />
      Ürün İsim: {product.currentProduct.name} Ürün Fiyat:{" "}
      {product.currentProduct.price}
      <h3>Seçim Fonksiton Bileşeni</h3>
      <form
        onSubmit={(event) => {
          event.preventDefault();
          save();
        }}
      >
        Ürün Seç:{" "}
        <select onChange={productChanged}>
          <option value={0} key={0}>
            Seçiniz
          </option>
          {products.map((product) => (
            <option value={product.id} key={product.id}>
              {product.name}
            </option>
          ))}
        </select>{" "}
        <br />
        <input type="submit" value="Sakla" />
      </form>
    </div>
  );
};

export default SelectFunctionComponent;
