import { legacy_createStore as createStore } from "redux";

import holderReducer from "./denemeReducer";

const store = createStore(holderReducer);
export default store;
