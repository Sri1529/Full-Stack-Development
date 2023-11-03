import { useEffect,useRef } from "react";
export function Use_reference()
{
    const divele=useRef();

    useEffect(()=>
    {
        console.log("The position of div is",divele.current.offsetHeight)
    },[])
    return(
        <div ref={divele}> 
          <h1>Use Reference Module</h1>
        </div>
    )
}