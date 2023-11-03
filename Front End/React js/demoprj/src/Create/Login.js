import React from "react";
import './style.css';
class Login extends React.Component
{
    
    render()
    {
        const bt= event=>alert(event.target.id);
        return(

            <div className="login">
                UserName:<input type="text" placeholder="Enter your Name"></input>
                
                Password:<input type="Password" placeholder="Enter yout Password"></input>
                <br></br>
              
                <button id="Successfull" onClick={bt}>Login</button>
                <br></br>
                <button id="register">Register</button>
            </div>
        )
    }
}
export default Login;