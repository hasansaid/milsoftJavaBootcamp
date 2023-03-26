export default function FunctionComponent() {
  const myValue = 123;

  const getMyValue = () => {
    return 12345;
  };

  const getMyResult = (parameter) => {
    return parameter * parameter;
  };

  return (
    <div>
      <h1>İşlev Bileşeni</h1>
      Degerim : {myValue}
      <br />
      İşlevim : {getMyValue()}
      <br />
      Degistirgenim : {getMyResult(12)}
    </div>
  );
}
