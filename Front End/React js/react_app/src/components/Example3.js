import React,{useState} from "react";
function Example3()
{
    const [Name,Setname]=useState(
        {
            test:"Nil",
            questions:"0",
            Students:"0",
            
        }
    )


   return(
    <div>
         <h1>Test={Name.test}</h1>
         
         <h1>Questions={Name.questions}</h1>
        
         <h1>Students={Name.Students}</h1>
         <button onClick={()=>Setname({...Name,Students:"30",test:"Prpgramming Quiz",questions:"30"})}>Update</button>
    </div>
   )
}export default Example3