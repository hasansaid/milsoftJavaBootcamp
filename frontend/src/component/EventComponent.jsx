import React from "react";

const EventComponent = () => {
  const handle = () => {
    alert("Kotarılıyor...");
  };

  const deal = (input) => {
    alert("Uğraşılıyor..." + input);
  };

  const manage = (event) => {
    alert("İşletiliyor..." + event.target.id + " " + event.target.tagName);
  };

  return (
    <div>
      <h1>Biçim Bileşeni</h1>
      <form>
        <button onClick={() => alert("İçleniyor...")}>Çizgi içi</button> <br />
        <button onClick={handle}>Ok</button> <br />
        <button onClick={() => deal("girdi")}>Değiştirgen</button> <br />
        <button id="manager" onClick={(event) => manage(event)}>
          Olay
        </button>{" "}
        <br />
      </form>
    </div>
  );
};

export default EventComponent;
