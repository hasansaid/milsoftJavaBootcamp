import React from "react";
import ChildComponent from "./ChildComponent";

const ParentComponent = () => {
  return (
    <div>
      <h1>Anne Baba bileşeni</h1>
      <ChildComponent left="3" right="4" />
    </div>
  );
};

export default ParentComponent;
