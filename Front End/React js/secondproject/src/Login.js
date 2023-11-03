import React from "react";
class Login extends React.Component
{
    render()
    {
        const ev = event => alert(event.target.id);
        return(
            <div className="App">
                
                UserName:<input  type="text" name="name"></input>
                Password:<input type="password" name="password"></input>
                <button id="Success" onClick={ev}>
                    Click Here
                </button>
            </div>
        )
    }
}
export default Login;