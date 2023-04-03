import React, { useEffect } from "react";

const FetchPost = () => {
  const urlPost = "http://localhost:3000/product";
  useEffect(() => {
    let product; // şimdilik kalsın
    const options = {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(product),
    };
    fetch(urlPost, options)
      .then((data) => data.json())
      .then((result) => console.log(result));
  }, []);

  return <div>FetchPost</div>;
};

export default FetchPost;
