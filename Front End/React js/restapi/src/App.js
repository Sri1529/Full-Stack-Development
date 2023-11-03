import logo from './logo.svg';
import './App.css';
import { Mycontext } from './component/Mycontext';
import { useState,React } from 'react';
import { MyComponent } from './component/MyComponent';
import { Products } from './component/Producrs';
import { Webpages } from './Webpages/Index';
import { Index } from './Webpage_3/index';

import "bootstrap/dist/css/bootstrap.min.css";
import EmployeeForm from './EmployeeForm';
import OffOn from './Online_offline';
import { Onoff } from './Onoff';
import { Action } from './Redux/1action';

function App() {
  const[text,settext]=useState("Imarticus");
  return (
    
    <div className="App">
      {/* <Mycontext.Provider value={{text,settext}}>
        <MyComponent></MyComponent>
        <Products></Products>
      </Mycontext.Provider> */}

      {/* <Webpages></Webpages> */}

      {/* <Index></Index> */}
         
     {/* <div>
      <h1 style={{color:"red"}}>Adding the employee details</h1>
      <div class="col">
      <EmployeeForm></EmployeeForm>
      </div>

     </div> */}

    {/* <Index></Index> */}

    {/* <OffOn></OffOn> */}
    {/* <Onoff></Onoff> */}
    <Action></Action>
    </div>
  );
}

export default App;
