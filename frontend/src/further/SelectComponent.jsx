import React from "react";

export default class SelectComponent extends React.Component {
  constructor(props) {
    super(props);
    this.productChanged = this.productChanged.bind(this);
    this.save = this.save.bind(this);
    this.products = [
      { id: 301, name: "Cep Telefonu", price: 2350.0 },
      { id: 302, name: "Masaüstü Bilgisayar", price: 50000.0 },
      { id: 303, name: "Dizüstü Bilgisayar", price: 10000.0 },
    ];
    const currentProductId = 302;
    this.state = {
      currentProductId: currentProductId,
      currentProduct: this.products.find((p) => p.id === currentProductId),
    };
  }
  productChanged(event) {
    const currentProductId = Number(event.target.value);
    if (currentProductId === 0) {
      return null;
    }
    this.setState({
      currentProductId: currentProductId,
    });
  }

  save(event) {
    if (this.state.currentProductId !== 0) {
      alert(`Saklanıyor ${this.state.currentProduct.name}`);
    } else {
      alert("Saklanıyor boş");
    }
  }
  render() {
    return (
      <>
        <h3>Seçim Sınıf Bileşeni</h3>
        Seçilen : {this.state.currentProductId} <br />
        Seçilen Öz: {this.state.currentProduct.id} <br />
        {this.state.currentProduct.name} <br />
        {this.state.currentProduct.price}
        <form onSubmit={this.save()}>
          Ürün Seç:{" "}
          <select
            value={this.state.currentProductId}
            onChange={this.productChanged}
          >
            <option value={0} key={0}>
              Seçiniz
            </option>
            {this.products.map((product) => (
              <option value={product.id} key={product.id}>
                {product.name}
              </option>
            ))}
          </select>
          <br />
          <input type="submit" value="Sakla" />
        </form>
      </>
    );
  }
}
