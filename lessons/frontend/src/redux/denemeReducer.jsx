const initialState = {
  quantity: 10,
};
// diğer componentlerde holder reducer olarak çağırdım..
const denemeReducer = (state = initialState, action) => {
  switch (action.type) {
    case "quantity/increment":
      return {
        quantity: state.quantity + 1,
      };
    case "quantity/add":
      return {
        quantity: state.quantity + Number(action.delta),
      };
    case "quantity/decrement":
      return {
        quantity: state.quantity - 1,
      };
    case "quantity/reset":
      return {
        quantity: 0,
      };
    default:
      return state;
  }
};

export default denemeReducer;
