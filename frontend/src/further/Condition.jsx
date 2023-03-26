import React from "react";

const Condition = () => {
  const value = 3;
  if (value > 5) {
    return (
      <div>
        {" "}
        <h1>İse</h1>
      </div>
    );
  } else {
    return (
      <div>
        <h1>Değilse</h1>
      </div>
    );
  }
};

export default Condition;
