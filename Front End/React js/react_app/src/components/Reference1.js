import { useRef,useEffect, useState } from "react"
export function Reference1()
{
    const [counter,setcount] = useState(0);
    const handleIncreaseCounter=()=>
    {
        //counter.current=counter.current+1;
        setcount(counter+1)

    }
    useEffect(()=>
    {
        console.log("counter changed to:",counter)
    },[counter])
    return(
        <div>
         <h1>Learn about useRef!</h1>
         <h2>Value:{counter}</h2>
         <button onClick={handleIncreaseCounter}>Increase Counter</button>
        </div>
    )
}
