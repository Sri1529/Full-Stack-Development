
import './App.css';
import Check from './Check';
import Do from './Do';
import Demo from './Demo';

import Snapshot from './Snapshot';

import { Component,Child } from './Componentwillunmount';
import Table from './Table';
import Sample1 from './Sample1';
import Hooks from './Hooks';
import Timer from './Timer';
import Button from './Button';
import Mouse_Event from './Mouse_event';
import Mouse_event from './Mouse_event';
import LoopButton from './for_loop_button';
import Rtimer from './for_loop_button';
import CheckBox from './Check_box';
import Checklist from './Checklist';
import { useState } from 'react';



function App() {
  const Checkboxes = ['JAVA', 'React js','Gift','MongoDB'];
  const [checkedState,setCheckedState]=useState(new Array(Checkboxes.length).fill(false));
  const handeleCheckboxChange =(index)=>
  {
    const updateCheckedState = checkedState.map((item,idx)=>
    idx===index? !item:item);
    setCheckedState(updateCheckedState)  
  };
  const countCheckedCheckboxes =()=>
    {
      return checkedState.filter(Boolean).length;
    }
  return (
    <div className="App">
      
      {/* <Check></Check>
      <Do></Do>
      <Demo></Demo> */}

      {/* <Component></Component> */}
      {/* <Snapshot></Snapshot>
      <Componen></Componen> */}
      {/* <Component></Component> */}
      {/* <Child></Child>
       */}
       {/* <Table></Table> */}


       {/* <Sample1></Sample1> */}

       {/* <Hooks></Hooks>
       <Timer></Timer>
       <Button></Button> */}
{/* 
       <Mouse_event></Mouse_event>
      <Rtimer></Rtimer> */}
      <h1>Select the course you want to learn</h1>
      <Checklist
      CheckBoxes={Checkboxes}
      checkedState={checkedState}
      handeleCheckboxChange={handeleCheckboxChange}></Checklist>
      <p>
        Number of checked Checkboxes:
        <strong>{countCheckedCheckboxes()}</strong>
      </p>
  {/* <CheckBox CheckBoxes={Checkboxes}/> */}
  

  

      

    </div>
  );
}

export default App;
