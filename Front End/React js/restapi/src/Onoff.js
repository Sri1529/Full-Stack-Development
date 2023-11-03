import { useEffect, useState } from "react"

export function Onoff()
{
    const [netstatus,setnetstatus]=useState(navigator.onLine)
    useEffect(()=>
    {
     
        const handlechange=()=>
        {
            setnetstatus(navigator.onLine)
        }
        window.addEventListener("online",handlechange)
        window.addEventListener("offline",handlechange)
    },[netstatus])

   
    return(
        <>
        <h1>Network Check</h1>
        {
            netstatus?(<h1>You are online</h1>):(<h1>You are offline</h1>)
        }
        
        </>
    )
}