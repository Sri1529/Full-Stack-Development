import React from "react";
class Property extends React.Component
{
    render()
    {
        return(
            <div>
        <h1>Welcome to Imarticus Learning {this.props.name}</h1>
        <h2>Location:{this.props.Location}</h2>

            </div>
        )
    }
}
Property.defaultProps={
    name:"Sri Hari",
    Location:"Coimbatore"
}
export default Property;