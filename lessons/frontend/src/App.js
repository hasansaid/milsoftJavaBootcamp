import './App.css';
import {Provider} from 'react-redux';
import {HolderComponent} from './redux/HolderComponent';
import store from './redux/coreStore';

function App () {
  return (
    <Provider store={store}>
      <div className="App">
        <header className="App-header">
          <HolderComponent />
        </header>
      </div>
    </Provider>
  );
}

export default App;
