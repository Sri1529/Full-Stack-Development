import React from "react";
class Constructure2 extends React.Component
{
    constructor(props)
    {
        super(props)
        {
           //this.lname="Hari"; this keyword should be used after the super...
            this.state=
            {
                fname:"Sri"
            }
        }
    }
    render()
    {
        return(
            <div>
                <p>Name:{this.state.fname}</p>
            </div>
        )
    }
}export default Constructure2;