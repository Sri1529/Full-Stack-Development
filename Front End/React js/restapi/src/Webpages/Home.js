import { useState,useEffect } from "react"
import { Link } from "react-router-dom";
export function Home()
{
    const [error,seterror]=useState(null);
    const[isloaded,setisloaded]=useState(false);
    const[user,setuser]=useState([]);

    useEffect(()=>
    {
        fetch("https://jsonplaceholder.typicode.com/users")
        .then(res=>res.json())
        .then(
            (data)=>
            {
                setisloaded(true);
                setuser(data);
            },
            (error)=>
            {
                setisloaded(true);
                seterror(error);
            }
        )
    },[])
    if(error)
    {
        return<div>Error:{error.message}</div>
    }
    else if(!isloaded)
    {
        return <div>Loading...</div>
    }
    else{

        return(
            <>
            <ul>
                {user.map(user =>(
                    // <li key ={user.id}>{user.name}</li>
                    <li>
                        <Link to={`user/${user.id}`}>{user.name}</Link>
                    </li>
                ))}
            </ul>
            </>
        )

    }
    
}