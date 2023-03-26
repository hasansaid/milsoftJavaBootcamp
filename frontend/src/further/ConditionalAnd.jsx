import React from "react";
import CasePositive from "./CasePositive";

const ConditionalAnd = () => {
  const value = 8;
  return (
    <>
      <h1>Ve</h1>
      {value > 5 && (
        <>
          <h3>Doğruysa burayı göster..</h3>
          <CasePositive />
        </>
      )}
    </>
  );
};

export default ConditionalAnd;
