import logo from './logo.svg';
import './App.css';
import Contact  from './Contact'; 
import Location from './Location';
import About from './About'
import { Link, Route,Routes } from 'react-router-dom';
import Timer from './Timer';
import { Usedemo } from './Usestate';
import { Set } from './Set';

function App() {
  return (
    <div >
    
      {/* <ul>
        <li>
        <Link to="/">About</Link>
        </li>
        <li>
        <Link to="/Contact">Contact</Link> 
        </li>
        <li>
        <Link to="/Location">Place</Link> 
        </li>
      </ul>
    
     <Routes>
      <Route path='/' element={<About/>}/>
      <Route path='/contact' element={<Contact/>}/>
      <Route path='/Location' element={<Location/>}/>
     </Routes>
     <Timer></Timer> */}
     <Usedemo></Usedemo>
     {/* <Set></Set> */}
    </div>

  );
}

export default App;
