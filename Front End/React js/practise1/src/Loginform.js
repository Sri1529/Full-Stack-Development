import React from "react";
// message 
function Message(props)
{
    if(props.isloggedin)
    {
        return <h1>Welcome Back</h1>
    }
    else{
        return <h1>Please Login First</h1>
            
        
    }
}
//login button
function Login(props)
{
    return(
        <button onClick={props.clickinfo}>Login</button>
    )
}
// logout button
function Logout(props)
{
    return(
        <button onClick={props.clickinfo}>Logout</button>
    )
}
class Loginform extends React.Component
{
    constructor(props)
    {
        super(props)
        {
            this.handlelogin=this.handlelogin.bind(this);
            this.handlelogout=this.handlelogout.bind(this);
            this.state={
               isloggedin:false
            }
        }
    }
    handlelogin()
    {
        this.setState({isloggedin:true})
    }
    handlelogout()
    {
        this.setState({isloggedin:false})
    }
   render()
   {
    return(
       <div>
         <h1>Login Check</h1>
         <Message isloggedin={this.state.isloggedin}></Message>
         {
            (this.state.isloggedin)?(<Logout clickinfo={this.handlelogout}></Logout>):(<Login clickinfo={this.handlelogin}></Login>)
         }
       </div>
        
    )
   }
}export default Loginform