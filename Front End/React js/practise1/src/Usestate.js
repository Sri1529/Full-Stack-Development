import { useState } from "react";
export function Usedemo()
{
   
    const [count,setcount]=useState(
        {
            count:0,
            bike:"Suziki",
            car:"Benz",
            Mobile:"Samsung"
        }
    );
   const increase =()=>
    {
     setcount({...count,count:count.count+1})   
    }
    const bike =()=>
    {
        setcount({...count,bike:"Yamaha"})
    }
    return(
        <>
        <h1>Increment Operation</h1>
        <h4><b>Count:{count.count}</b></h4>
        <h4><b>Bike:{count.bike}</b></h4>
        <button onClick={increase}>Increment</button>
        <button onClick={bike}>Change Bike</button>
        </>
    )
}