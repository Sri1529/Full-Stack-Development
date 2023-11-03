import React,{useState} from "react"
function Example1()

{
    const[count,setcount]=useState(0);
    return (
        <div>
            <h1>Hello World</h1>
        <h2>Imarticus Learning</h2>
        <h1>count={count}</h1>
        {/* <h1>setcount={setcount(count+1)}</h1> */}
        <button onClick={()=>setcount(count+1)}>Single Count</button>
        <button onClick={()=>setcount(count+2)}>Double Count</button>
        </div>
    )
}export default Example1