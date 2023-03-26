import React from "react";

const Maplist = () => {
  const names = ["HTML", "CSS", "JavaScript", "JSON", "AJAX"];
  return (
    <div>
      <h3>Eşlem Dizelge</h3>
      {names.map((name) => (
        <li>{name}</li>
      ))}
    </div>
  );
};

export default Maplist;
