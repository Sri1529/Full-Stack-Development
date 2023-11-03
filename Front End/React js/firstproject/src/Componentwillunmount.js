import React from "react";
class Component extends React.Component
{
    constructor(props)
    {
        super(props)
        {
            this.state=
            {
                show:true
            }
        }
    }
    delHeader=()=>
    {
        this.setState({show:false})
    }
    render()
    {  let myheader;
        if(this.state.show)
        {
            myheader=<Child></Child>
        }
        return(
            <div>
                 {myheader}
                 <button type="button" onClick={this.delHeader}>Delete Header</button>
            </div>

        )
    }
}

class Child extends React.Component
{
    componentWillUnmount()
    {
        alert("This will get excuted after all the executions where dont in the component class")
    }
    render()
    {
        return(
            <h1>Hello World</h1>
        )
    }
}export {Component,Child}