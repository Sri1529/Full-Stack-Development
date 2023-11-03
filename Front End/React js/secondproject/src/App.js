
import './App.css';
import { Route,Routes,Link } from 'react-router-dom';

import Test from './Test'
import Welcome from './Welcome';
import About1 from './About1';
import Place from './Location';
import Contact from './Contact';
import Additional from './Additional';
import Array from './Array';
import Login from './Login';
import Employee from './Employee';
import Greetings from './Greetings';
import Set_state from './Set_state';
import { Student } from './Student';
import Welcome1 from './Welcome1';
import { Wow } from './Student1';
import Company from './Company';
import LoginForm from './LoginForm';
import Loginprac from './Loginprac';
import List from './List';
import Namelist from './Namelist';
import MenuBlog from './MenuBlog';
import MyComponent from './MyComponent';
import Custom_Ref from './Custom_Ref';
import Location from './Location'
import Display from './Display';

// import Constructor1 from './Constructor1';
// import Constructure2 from './Constructure2';
// import Uncontrolled from './Uncontrolled';
// import Controlled from './Controlled';
// import Multi_input from './Multi_input';
// import Example from './Interpulation';

// const mylist=['peter','sachin','kevin','Ben','Guen'];
// const data=[
//   {id:1,title:'First',content:'Welcome to Imarticus'},
//   {id:2,title:'Seocnd',content:'It is the Best ReactJS Tutorial'},
//   {id:3,title:'Third',content:"Here you can learn all ReactJS Topics"}
// ]
function App() {
// const student=
// {
//   firstname:"sri",
//   lastname:"hari",
//   email:"sri001"
// }
  return (
    <div className="App">
      {/* <Test></Test>
      <Welcome></Welcome>
      <About1></About1>
      <Place></Place>
      <Contact></Contact>
      <Additional></Additional>
      <Array></Array>
      <Login></Login> */}


      {/* <Employee></Employee>
      <Set_state></Set_state>
      <Greetings></Greetings>
      <Welcome1 name="Sri"></Welcome1>
      <Student 
      firstName="Sri"
      lastname="Hari"
      email="srihari001@gmail.com"
      >
      </Student>
      <Student 
      firstName="Tonny"
      lastname="Stark"
      email="Tonnystark@gmail.com"
      >

      </Student> */}
      
      {/* <Wow student={ student }></Wow>
      <Employee></Employee>
      <Company></Company> */}


      {/* <LoginForm></LoginForm>
      <Loginprac></Loginprac> */}

      {/* <Constructor1></Constructor1>
      <Constructure2></Constructure2>
      <Uncontrolled></Uncontrolled>
      <Controlled></Controlled>
      <Multi_input></Multi_input>
      <Example></Example> */}
      {/* <List></List>
      <Namelist mylist={mylist}></Namelist>
      <MenuBlog data={data}></MenuBlog>
      <MyComponent></MyComponent>
      <Custom_Ref></Custom_Ref> */}
{/* 
      <Routes>
        <Route path='/' element={ <About1 /> }></Route>
        <Route path='/contact' element={<Contact></Contact>}></Route>
        <Route path='/location' element={<Location />}></Route>
      </Routes> */}
      <Display></Display>
    </div>
    
  );
}

export default App;
