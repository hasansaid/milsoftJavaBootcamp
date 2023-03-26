import React from "react";

export const MapTable = () => {
  const products = [
    { id: "301", name: "Cep Telefonu", price: 2350.0 },
    { id: "302", name: "Masaüstü Bilgisayar", price: 50000.0 },
    { id: "303", name: "Dizüstü Bilgisayar", price: 10000.0 },
  ];
  return (
    <div>
      <h3>Eşlem Dizelge</h3>
      <table>
        <tbody>
          {products.map((product) => (
            <tr key={product.id}>
              <td>{product.id}</td>
              <td>{product.name}</td>
              <td>{product.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};
