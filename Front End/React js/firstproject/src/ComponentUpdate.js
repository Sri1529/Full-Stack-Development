import React from "react";
class Component extends React.Component
{
    constructor(props)
    {
        super(props)
        {
            this.state={
                favouritecolor:"Red"
            }
        }
    }
    shouldComponentUpdate()
    {
        return false
    }
    changecolor=()=>
    {
        this.setState({favouritecolor:"Blue"})
    }
    render()
    {
        return(
            <div>
                <h1>My Favourite color{this.state.favouritecolor}</h1>
                <button onClick={this.changecolor}>Color change</button>
            </div>
        )
    }
}export default Component