import React from "react";

const ChildComponent = ({ left, right }) => {
  return (
    <div>
      <h1>Ana - Baba Bileşeni</h1>
      Sol : {left} <br />
      Sag : {right} <br />
    </div>
  );
};

export default ChildComponent;
