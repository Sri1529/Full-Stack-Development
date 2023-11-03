import React from "react";
class Snapshot extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={favouritecolor:"Red"}
    }
    componentDidMount()
    {
        setTimeout(
            ()=>
            {
                this.setState({favouritecolor:"Yellow"})
            },5000
        )
    }
    getSnapshotBeforeUpdate(prevProps,PrevState)
    {
        document.getElementById("div1").innerHTML="Before the Update,the favourite was"+PrevState.favouritecolor
    }
    componentDidUpdate()
    {
        document.getElementById("div2").innerHTML="The updated favourite color is "+this.state.favouritecolor
    }
    render()
    {
        return(
            <div>
                <h1>My Favourite color{this.state.favouritecolor}</h1>
                <div id="div1"></div>
                <div id="div2"></div>
            </div>
        )
    }
}export default Snapshot