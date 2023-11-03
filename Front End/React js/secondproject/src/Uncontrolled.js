import React from "react";
class Uncontrolled extends React.Component
{
    constructor(props)
    {
        super(props)
        {
            this.updateSubmit=this.updateSubmit.bind(this)
            this.input=React.createRef();
        }
    }
    updateSubmit(event)
    {
        alert("You have entered the username and company name successfully..")
        event.preventDefault();
    }
    render()
    {
        return(
            <form onSubmit={this.updateSubmit}>
                <h1>Uncontrolled Form Example</h1>
                <label>Name:
                    <input type="text" ref={this.input}></input>
                </label>
                <label>
                    Company name:<input type="text" ref={this.input}></input>
                </label>
                <input type="submit" value="Submit"></input>
            </form>
        )
    }
}export default Uncontrolled 