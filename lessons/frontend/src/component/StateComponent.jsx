import { useState } from "react";
export default function StateComponent() {
  const [quantity, setQuantity] = useState(0);

  const changeQuantity = () => {
    setQuantity(7);
  };
  return (
    <div>
      <h1>Durum Bileşeni</h1>
      Nicelik: {quantity} <br />
      <button onClick={changeQuantity}>Tak</button>
    </div>
  );
}
