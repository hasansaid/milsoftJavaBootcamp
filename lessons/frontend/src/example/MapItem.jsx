import React from "react";

const MapItem = ({ product, index }) => {
  return (
    <div key={index}>
      <div>Telefon: {product.id}</div>
      <div>
        İsmi: {product.name} - Ücreti: {product.price}
      </div>
      <br />
    </div>
  );
};

export default MapItem;
