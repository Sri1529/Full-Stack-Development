import React from "react";
export class Insert extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state=
        {
            name:"",
            city:""

        }
    }
    userFormvalue =(event)=>
    {
        this.setState({[event.target.name]:event.target.value},
            ()=>this.props.submit(this.state))
    }
    render()
    {
        return(
            <div className="div bg-primary text-white p-1">
                <div className="form-group">
                  <label>Name</label> 
                  <input className="form-control"
                  name="name"
                  value={this.state.name}
                  onChange={this.userFormvalue}></input>  
                  <label>City</label>
                <input className="form-control"
                name="city"
                value={this.state.city}
                onChange={this.userFormvalue}>
                  </input>
                </div>

            </div>
        )
    }
}