import React from "react";
import './style.css';
class Register extends React.Component
{
    render()
    {
        const bt=event=>alert(event.target.id)
        return(
            <div className="Register">
                Name:<input type="text" placeholder="Enter yoyur name"></input>
                Email:<input type="text" placeholder="Enter yoyur Email"></input>
                Password:<input type="text" placeholder="Enter yoyur Password"></input>
                Confirm password:<input type="text" placeholder="Enter yoyur name"></input>
                <button id="Successfuly Registered" onClick={bt}>Register</button>
            </div>
        )
    }
}export default Register;