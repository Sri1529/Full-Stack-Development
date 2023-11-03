import { useEffect, useState } from "react"

function Timer()
{
    const [time,settime]=useState(0)
useEffect(()=>
{
    setTimeout(()=>
    {
      settime(time+1)
    },1000)
})
    return(
        <div>
            <p>Time={time}</p>

        </div>
    )
}export default Timer