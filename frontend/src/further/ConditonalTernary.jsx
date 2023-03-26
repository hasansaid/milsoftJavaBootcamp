import React from "react";

const ConditonalTernary = () => {
  const value = 3;
  return value > 5 ? (
    <>
      <h1>ise</h1>
    </>
  ) : (
    <>
      <h1>değilse</h1>
    </>
  );
};

export default ConditonalTernary;
