import { useSelector, useDispatch } from "react-redux";

export function HolderComponent() {
  const quantity = useSelector((state) => state.quantity);
  const dispatch = useDispatch();

  const quantityAdd = () => {
    dispatch({
      type: "quantity/add",
      delta: 3,
    });
  };

  return (
    <>
      Nicelik {quantity}
      <button onClick={() => dispatch({ type: "quantity/increment" })}>
        Arttır
      </button>{" "}
      <button onClick={() => dispatch({ type: "quantity/decrement" })}>
        Azalt
      </button>{" "}
      <button onClick={() => dispatch({ type: "quantity/reset" })}>
        Sıfırla
      </button>{" "}
      <button onClick={quantityAdd}>+ 3</button>
    </>
  );
}
