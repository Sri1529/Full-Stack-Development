import { useState } from "react";
import Component2 from "./Component2";

function Component1()
{
    const [user,setuser]=useState("Jessee Hall");
    return(
        <>
       <h1>{`Hello ${user}!`}</h1>
       <Component2 user={user}></Component2>
       </>
    )
    
       
    
}export default Component1