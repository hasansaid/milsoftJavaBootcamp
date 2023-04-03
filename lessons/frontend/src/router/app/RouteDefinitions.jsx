import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import RouterOutlet from "./RouterOutlet";
import ComponentIndex from "../module/ComponentIndex";
import ComponentTwo from "../module/ComponentTwo";
import ComponentThree from "../module/ComponentThree";
import ComponentParametric from "../module/ComponentParametric";

const RouteDefinitions = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<RouterOutlet />}>
          <Route index element={<ComponentIndex />}></Route>
          <Route path="/two" element={<ComponentTwo />}></Route>
          <Route path="/three" element={<ComponentThree />}></Route>
          <Route path="/four/:id" element={<ComponentParametric />}></Route>
        </Route>
      </Routes>
    </BrowserRouter>
  );
};

export default RouteDefinitions;
