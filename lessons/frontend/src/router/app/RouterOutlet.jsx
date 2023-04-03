import React, { useState } from "react";
import { Link, Outlet, useNavigate } from "react-router-dom";

const RouterOutlet = () => {
  let navigate = useNavigate();

  const goToThree = () => {
    navigate("/three");
  };
  return (
    <div>
      <Link to="/">Bileşen 1</Link> <Link to="/two">Bileşen 2</Link>{" "}
      <Link to="/three">Bileşen 3</Link> <Link to="/four/601">Bileşen 4</Link>{" "}
      <br />
      <button onClick={goToThree}>GİT</button>
      <Outlet />
    </div>
  );
};

export default RouterOutlet;
