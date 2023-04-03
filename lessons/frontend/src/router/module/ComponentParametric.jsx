import React from "react";
import { useParams } from "react-router-dom";

const ComponentParametric = () => {
  const { id } = useParams();
  return (
    <div>
      <h6>Değiştirgen</h6>
      Özdeşlik {id}
    </div>
  );
};

export default ComponentParametric;
