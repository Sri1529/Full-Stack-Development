import React from "react";

function Message(prop)
{
    
        if(prop.isloggein)
        {
           return(
            <h1>Welcome Back</h1>
           )
        }
        else{
            return(
                <h1>Please Login First</h1>
            )
        }
       
    
}
function Login(prop)
{
    return(
        <button onClick={prop.clickinfo}>Login</button>
    )
}
function Logout(prop)
{
    return(
        <button onClick={prop.clickinfo}>Logout</button>
    )
}



class Loginprac extends React.Component
{
   constructor(prop)
   {
    super(prop)
    {
        this.handlelogin=this.handlelogin.bind(this);
        this.handlelogout=this.handlelogout.bind(this);
        this.state={
            isloggein:false
        }
    }

   }
   handlelogin()
   {
    this.setState({isloggein:true});
   }
   handlelogout()
   {
    this.setState({isloggein:false});
   }
   render()
   {
    return(
        <div>
         <h1>Login page check</h1>
        
         <Message isloggein={this.state.isloggein}></Message>
         
         {
           (this.state.isloggein)?
          (<Logout clickinfo={this.handlelogout} ></Logout>):
          (<Login clickinfo={this.handlelogin}></Login>)
         }
        </div>
        
       
    )
   }
}export default Loginprac;