import React from "react";
import Namelist from "./Namelist";

const mylist=['peter','sachin','kevin','Ben','Guen'];
const listitems=mylist.map((mylist)=>{
    return <li>{mylist}</li>
})

class List extends React.Component
{
    render()
    {
        return(
            <div>
                
                <ul>{listitems}</ul>
            </div>
        )
    }
}export default List;


