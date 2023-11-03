import React from "react";
const Welcome1 =(props)=>
{
    return(
        <div>
            <h1>Welcome {props.name}</h1>
            {/* <h1>Welcome {this.props.name1}</h1> */}
        </div>
    )
};
Welcome1.defaultProps=
{
    name1:"Sri Hari"

}
export default Welcome1;