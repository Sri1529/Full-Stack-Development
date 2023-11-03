import { useState,useEffect } from "react";

function Timer()
{
    const [count,setCount]=useState(0);
    
    useEffect(() => {
        let count = 0; // Initialize a count variable to keep track of executions.
      
        // Define an interval function to execute the code.
        const intervalId = setInterval(() => {
          if (count < 5) {
            // Execute the code.
            setCount((prevCount) => prevCount + 1);
            count++;
          } else {
            // If the code has executed five times, clear the interval.
            clearInterval(intervalId);
          }
        }, 1000);
      
        // Cleanup function to clear the interval when the component unmounts.
        return () => clearInterval(intervalId);
      }, []);
        
    
    return(
        <div>
              <h1> I have rendered {count} times</h1>
        </div>
    )
}export default Timer