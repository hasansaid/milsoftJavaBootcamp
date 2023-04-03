import React from "react";
import MapItem from "./MapItem";

const MapContainer = () => {
  const products = [
    { id: "301", name: "Cep Telefonu", price: 2350.0 },
    { id: "302", name: "Masaüstü Bilgisayar", price: 50000.0 },
    { id: "303", name: "Dizüstü Bilgisayar", price: 10000.0 },
  ];
  return (
    <div>
      {products.map((product) => (
        <div>
          <MapItem index={product.id} product={product}></MapItem>
        </div>
      ))}
    </div>
  );
};

export default MapContainer;
