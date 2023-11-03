import React from "react";
class Example2 extends React.Component
{
    statee=
    {
        Name:"Hari",
        age:"21"
    }
    
    render()
    {
        return(
            <div>
                <h1>Welcome to class Component</h1>
                <h1>Name={this.statee.Name}</h1>
                <button onClick={()=>{this.setState({this:this.statee.Name='sri'})}}>Click Here </button>
                <h1>Age={this.statee.age}</h1>
                <button onClick={()=>{this.setState({this:this.statee.age='27'})}}>Update Age</button>
                <button onClick={()=>{this.setState({this:this.statee.age='47'})}}>Update Age2</button>
            </div>
        )
    }
}export default Example2