import React from "react";
export class Set extends React.Component
{
    constructor()
    {
        super();
        this.state={
            count:0
        }
    }
    render()
    {
        return(
            <>
               <h1>Increment operator</h1>
               <h4>count={this.state.count}</h4>
               <button onClick={()=>this.setState({count:this.state.count+1})}>Increment</button>
            </>
        )
    }
}