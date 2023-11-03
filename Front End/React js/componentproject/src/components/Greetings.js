import React from "react";
import '../App.css';
class Greetings extends React.Component
{
    state={
        name:"Sri Hari",
        id:420,
        contact:9999
    }
    render()
    {
        return(
            <div className="Greet">
                <h1>Name:{this.state.name}</h1>
                <h1>ID:{this.state.id}</h1>
                <h1>Contact:{this.state.contact}</h1>

            </div>
        )
    }
}export default Greetings;