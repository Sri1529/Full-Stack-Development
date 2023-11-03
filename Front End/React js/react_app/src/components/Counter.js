import { useEffect, useState } from "react";

function Counter()
{
    const[count,setcount]=useState(0);
    const[calculations,setCalculation]=useState(0);

    useEffect(()=>
    {
        setCalculation(()=>count*2);
    },[count])

    return(
        <>
        <p>Count:{count}</p>
        <button onClick={()=>setcount((c)=>c+1)}>+</button>
        <p>Calculation:{calculations}</p>
        </>
    )

}export default Counter