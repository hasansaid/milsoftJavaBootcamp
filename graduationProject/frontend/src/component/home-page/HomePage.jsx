import React from "react";
import "../home-page/styles.css";

import screen2kenar from "../../assets/hiclipart.com.png";

const HomePage = () => {
  return (
    <div>
      <body>
        <div>
          <div className="header-blue">
            <nav className="navbar navbar-dark navbar-expand-md navigation-clean-search">
              <div className="container">
                <a className="navbar-brand" href="/home">
                  SERTKAYA MOBİL
                </a>
                <button
                  className="navbar-toggler"
                  data-toggle="collapse"
                  data-target="#navcol-1"
                >
                  <span className="sr-only">Toggle navigation</span>
                  <span className="navbar-toggler-icon"></span>
                </button>
                <div
                  className="collapse navbar-collapse justify-content-between"
                  id="navcol-1"
                >
                  <ul className="nav navbar-nav">
                    <li className="nav-item" role="presentation">
                      <a className="nav-link active" href="/home">
                        Anasayfa
                      </a>
                    </li>
                    <li className="nav-item" role="presentation">
                      <a className="nav-link active" href="/products">
                        Ürünler
                      </a>
                    </li>
                    <li className="nav-item" role="presentation">
                      <a className="nav-link active" href="/products/basket">
                        Sepet
                      </a>
                    </li>
                  </ul>
                  <div className="d-flex">
                    <span className="navbar-text">
                      <a href="#" className="login">
                        Giriş Yap
                      </a>
                    </span>
                    <a
                      className="btn btn-light action-button"
                      role="button"
                      href="#"
                    >
                      Kayıt Ol
                    </a>
                  </div>
                </div>
              </div>
            </nav>
            <div className="container hero">
              <div className="row">
                <div className="col-12 col-lg-6 col-xl-5 offset-xl-1">
                  <h1>En uygun fiyata iPhone'lar burada!!</h1>
                  <p>Daha fazlası için ürünlere git...</p>
                  <a href="/products">
                    <button
                      className="btn btn-light btn-lg action-button"
                      type="button"
                    >
                      Daha fazla
                    </button>
                  </a>
                </div>
                <div className="col-md-5 col-lg-5 offset-lg-1 offset-xl-0 d-none d-lg-block phone-holder">
                  <div className="iphone-mockup">
                    <img src={screen2kenar} className="device" />
                    <div className="screen"></div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </body>
    </div>
  );
};

export default HomePage;
