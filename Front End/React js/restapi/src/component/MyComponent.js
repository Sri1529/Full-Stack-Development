import { useContext } from "react"
import { Mycontext } from "./Mycontext"
export function MyComponent()
{
    const {text,settext}=useContext(Mycontext)

   return(
    <>
    <h1>{text}</h1>
    <button onClick={()=>settext('Hello World')}>Click ME</button>
    </>
   )
}