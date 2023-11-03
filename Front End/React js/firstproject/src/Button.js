
import React from "react";

class Button extends React.Component
{
    constructor(props)
    {
        super(props)
        {
            this.state=
            {
                message:"Default Content"
            }
        }
    }
    render()
    {
        return(
            <div>
            <div className="h1 bg-secondary text-while text-center p-2">
                {this.state.message}
             </div>
             <div className="text-center">
                <button className="btn btn-secondary" onClick={()=>this.setState({message:"Clicked!"})}>Click Me</button>
             </div>
            </div>

        )
    }
}export default Button