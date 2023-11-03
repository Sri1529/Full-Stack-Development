import React, { useState } from "react";

function Rtimer(){
  const [count,setCount]=useState("")
  
 const inc =()=>
{
    let result="";
for(let i=0;i>5;i++)
{
  result=`I HAVE RENDERED ${count+i+1}TIMES`;

}
setCount(count+5)

}

return (
<div>
<h1 id="p1">{count > 0 ? `I have rendered ${count} times!` : ""}</h1>
<button onClick={inc}>click</button>
</div>
 )
}
export default Rtimer;