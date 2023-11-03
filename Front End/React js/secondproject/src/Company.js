import React from "react";
class Company extends React.Component
{
    state=
    {
        Name:""
    }
    changeTet(event)
    {
        this.setState({
            Name:event.target.value
        })
    }
    render()
    {
        return(
            <div className="App">
                <h2>Simple Event Example</h2>
                Enter company Name:
                <input type="text" id="companyName" onChange={this.changeTet.bind(this)}></input>
                <h4>You entered:{this.state.Name}</h4>
            </div>
        )
    }
}export default Company;