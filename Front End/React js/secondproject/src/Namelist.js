import React from "react";

function Namelist(props)
{
    const mylist=props.mylist;
    const items=mylist.map((mylist)=>
    {
        return <li>{mylist}</li>
    })
    return(
        <div>
            <h2>Rendering lists using props</h2>
            <ul>{items}</ul>
        </div>
    )
}export default Namelist