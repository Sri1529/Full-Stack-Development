import React,{useState} from "react"

function Fc()
{
    const[name,setname]=useState("Hari")
    return(
        <div>
        <h1>Name ={name}</h1>
        <button onClick={()=>setname("Sri")}>Update Name</button>
        </div>
    )
}export default Fc