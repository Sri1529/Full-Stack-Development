import React,{useEffect,useState} from "react";
function Timer()
{
    const[count,setcount]=useState(0);
    useEffect(()=>
    {
        setTimeout(()=>{
            setcount(count+1)
        },1000)
    })
    
    return(
        <div>
                   <h1>Use Effect Example</h1>
                   <h2>I have rendered {count} times</h2>
        </div>
    )
}
export default Timer