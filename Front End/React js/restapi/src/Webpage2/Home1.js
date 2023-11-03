import { useEffect, useState } from "react"
import { Link } from "react-router-dom";

export function Home()
{
    const[error,seterror]=useState(null)
    const[isloaded,setisloaded]=useState(false);
    const[post,setpost]=useState([]);

    useEffect(()=>
    {
        fetch("https://jsonplaceholder.typicode.com/posts")
        .then(res=>res.json())
        .then(
            (data)=>
            {
                setisloaded(true);
                setpost(data);
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
           {post.map(use=>(
           <li>
            <Link to={`post/${use.id}`}>{use.title}</Link>
           </li> 
           ))}
        </ul>
        </>
    )
    }
}