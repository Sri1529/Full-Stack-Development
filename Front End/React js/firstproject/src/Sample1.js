import React,{useState} from "react";
function Sample1()
{
    const[name,name1]=useState('Vinod')
    return(
        <div>
            <h1>{name}</h1>
            <button onClick={()=>name1('Sri')}>Name1</button>
            <button onClick={()=>name1('Hari')}>Name2</button>
            <button onClick={()=>name1('Loki')}>Name3</button>

        </div>
    )
}export default Sample1