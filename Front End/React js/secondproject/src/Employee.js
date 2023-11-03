import React from "react";
class Employee extends React.Component
{
    state=
    {
        firstname:"Sri",
        lastname:"Hari",
        email:"srihari001@gmail.com"
    }
    updateEmployee(){
        this.setState({
            firstname:"tonny",
            lastname:"SriSRi",
            email:"adjdij12@gmail.com"

        })
    }
    render()
    {
        return(
            <div className="emp">
              <h1>Employee details</h1><hr></hr>
              <p>{this.state.firstname}</p>
              <p>{this.state.lastname}</p>
              <p>{this.state.email}</p>
              <button onClick={( )=>this.updateEmployee()}>
                Update
            </button>
            </div>
        )
    }
}export default Employee