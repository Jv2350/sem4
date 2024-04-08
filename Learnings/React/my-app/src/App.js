import './App.css';
// import Func from './Func';
import { Video, /*Audio*/ } from './components/Video'

function App() {
  // let name = "jayesh"
  console.log("hello world");
  return (
    <div className="App" >
      <div className='App-header'>
        {/* Hello World */}
        {/* <Func /> */}
        <Video title="React js tutorial" bgColor="green"/>
        <Video title="Node js tutorial" bgColor="red"/>
        {/* <Audio /> */}
        {/* {name} */}
      </div>
    </div >
  );
}

export default App;
