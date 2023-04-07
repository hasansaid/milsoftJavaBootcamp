import React, { useEffect, useState } from "react";
import "./styles.css";
import { useNavigate } from "react-router-dom";

const BasketPage = () => {
  const urlList = "http://localhost:8080/api/cart/get/1";
  const [cart, setCart] = useState(undefined);
  const [sumMoneys, setSumMoneys] = useState(0);

  const [isCartUpdated, setIsCartUpdated] = useState(false);
  function toUpperCaseTR(str) {
    const mapping = {
      i: "İ",
      ı: "I",
      ş: "Ş",
      ğ: "Ğ",
      ü: "Ü",
      ö: "Ö",
      ç: "Ç",
    };

    return str
      .replace(/([iışğüçö])/g, (letter) => mapping[letter] || letter)
      .toUpperCase();
  }
  let sumMoney = 0;
  //  function deneme(){
  //     cart.cartProducts.map((cartProduct) => {
  //       sumMoney += cartProduct.product.salesPrice * cartProduct.salesQuantity;
  //     });
  //   }

  useEffect(() => {
    console.log("USE EFFECT ÇALIŞTI");
    fetch(urlList)
      .then((data) => data.json())
      .then((cart) => {
        setCart(cart);

        console.log(cart);
      });
  }, [isCartUpdated]);

  let navigate = useNavigate();
  const goToProducts = () => {
    navigate("/products");
  };

  const removeToCartProduct = (cartProduct) => {
    let url = `http://localhost:8080/api/cart/remove/1/${cartProduct.product.productId}`;
    fetch(url, {
      method: "DELETE",
    }).then(() => {
      setIsCartUpdated(!isCartUpdated);
    });
  };
  return (
    <div>
      <div className="cart_section">
        <div className="container-fluid">
          <div className="row">
            <div className="col-lg-10 offset-lg-1">
              <div className="cart_container">
                <div className="cart_title fs-4 d-flex align-items-baseline">
                  <p className="fw-bold d-flex">Sepet</p>{" "}
                  <small className="text-muted fs-6 d-flex ms-2">
                    {" "}
                    (Sepetinizdeki ürün sayısı:{" "}
                    {cart && cart.cartProducts.length} -- Sepet sahibi:{" "}
                    {cart && toUpperCaseTR(cart.customerName)} ){" "}
                  </small>
                </div>
                {cart &&
                  cart.cartProducts.map((cartProduct, index) => (
                    <div className="cart_items" key={index}>
                      <ul className="cart_list">
                        <i
                          onClick={() => removeToCartProduct(cartProduct)}
                          style={{ cursor: "pointer" }}
                          className="bi bi-trash-fill mt-2 me-2 fs-5 d-flex justify-content-end"
                        ></i>

                        <li className="cart_item clearfix">
                          <div className="cart_item_image">
                            <img src="https://i.imgur.com/qqBRWD5.jpg" alt="" />
                          </div>
                          <div className="cart_item_info d-flex flex-md-row flex-column justify-content-between">
                            <div className="cart_item_name cart_info_col">
                              <div className="cart_item_title">
                                Marka / Model
                              </div>
                              <div className="cart_item_text">
                                {cartProduct.product.productName}
                              </div>
                            </div>
                            <div className="cart_item_color cart_info_col">
                              <div className="cart_item_title">Renk</div>
                              <div className="cart_item_text">
                                <span
                                  style={{ backgroundColor: "#999999" }}
                                ></span>
                                Silver
                              </div>
                            </div>
                            <div className="cart_item_quantity cart_info_col">
                              <div className="cart_item_title">Miktar</div>
                              <div className="cart_item_text">
                                {cartProduct.salesQuantity}
                              </div>
                            </div>
                            <div className="cart_item_price cart_info_col">
                              <div className="cart_item_title">Fiyat</div>
                              <div className="cart_item_text">
                                {cartProduct.product.salesPrice}
                              </div>
                            </div>
                            <div className="cart_item_total cart_info_col">
                              <div className="cart_item_title">Toplam</div>
                              <div className="cart_item_text">
                                ₺
                                {cartProduct.product.salesPrice *
                                  cartProduct.salesQuantity}
                              </div>
                            </div>
                          </div>
                        </li>
                      </ul>
                    </div>
                  ))}
                <div className="order_total">
                  <div className="order_total_content text-md-right">
                    <div className="order_total_title">Toplam Fiyat:</div>
                    <div className="order_total_amount">
                      ₺{cart && sumMoneys}
                    </div>
                  </div>
                </div>
                <div className="cart_buttons">
                  {" "}
                  <button
                    onClick={goToProducts}
                    type="button"
                    className="button cart_button_clear"
                  >
                    Ürünlere Dön
                  </button>{" "}
                  <button type="button" className="button cart_button_checkout">
                    Sepeti Onayla
                  </button>{" "}
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default BasketPage;
