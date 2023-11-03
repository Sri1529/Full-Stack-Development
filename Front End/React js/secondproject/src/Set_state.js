import React from "react";
class Set_state extends React.Component
{
    state=
    {
        count:0
    }
    handclick=()=>
    {
        this.setState({count:this.state.count+1})
    }
    render()
    {
        return(
            <div>
             <h2>count:{this.state.count}</h2>
             <button onClick={this.handclick}>clickhere</button>
            </div>
        )
    }
}export default Set_state;