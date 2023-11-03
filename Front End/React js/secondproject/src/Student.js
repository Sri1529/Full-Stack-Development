import React from "react";
export const Student=(props)=>
    {
          console.log(props);
          return(
            <div>
                <p>First Name:{props.firstName}</p>
                <p>Last Name:{props.lastname}</p>
                <p>E-mail:{props.email}</p>
            </div>
          )
    }