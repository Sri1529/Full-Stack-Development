import React from "react";
export class Button extends React.Component
{
     constructor(props)
     {
        super(props)
        this.state=
        {
            count:1
        }
     }
     render()
     {
        return(
            <div>
                <h1> Count:{this.state.count}</h1>
                <button>Click Here to add Count</button>
                
            </div>
        )
     }
}