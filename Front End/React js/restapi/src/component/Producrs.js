import { useContext } from "react";
import { Mycontext } from "./Mycontext";
export function Products()
{
    const{text,settext}=useContext(Mycontext);
    return(
        <>
        <h1>{text}</h1>
        <button onClick={()=>settext("Products")}>Click</button>
        </>
    )
}