import { useParams } from "react-router-dom"
import { useEffect,useState } from "react";
export function Post()
{
    const{id}=useParams();
    const[error,seterror]=useState("");
    const[isloaded,setisloaded]=useState(false);
    const[user,setuser]=useState([]);
    const[addrerss,setaddress]=useState([]);
    const[company,setcompany]=useState([]);
    useEffect(()=>
    {
        fetch("http://jsonplaceholder.typicode.com/users/"+id )
        .then(res=>res.json())
        .then(
            (data)=>
            {
                console.log(data)
                setisloaded(true)
                setuser(data)
                setaddress(data.addrerss)
                setcompany(data.company)
            },
            (error)=>
            {
                seterror(error)
                setisloaded(true)
            }
        )
    },[])
    if(error)
    {
        return <div>Error:{error.message}</div>
    }
    else if(!isloaded)
    {
        return <div>Loading...</div>
    }
    return(
        <>
        <center>
            <div>Name:{user.name}</div>
            <div>Email:{user.email}</div>
            <div>Phone:{user.phone}</div>
            <div>Website:{user.website}</div>
        </center>
        </>
    )
}