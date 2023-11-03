import { useEffect, useState } from "react";
import { useParams } from "react-router-dom"

export function User()
{
    const{id}=useParams();
    const [error,seterror]=useState("");
    const[isloaded,setisloaded]=useState(false);
    const[user,setuser]=useState([]);
    const[userAddress,setuserAddress]=useState([]);
    const[userCompany,setuserComapany]=useState([]);

    useEffect(()=>{
        fetch("http://jsonplaceholder.typicode.com/users/"+id )
        .then(res => res.json())
        .then(
          (data)=>{
            console.log(data);
            setuser(data);
            setisloaded(true);
            setuserAddress(data.address);
            setuserComapany(data.company);
    
          },
          (error) => {
            setisloaded(true);
            seterror(error);
          }
        )
      },[])
    
    if(error)
        {
            return <div>Error:{error.message}</div>
        }
        if(!isloaded)
        {
            return <div>Loading...</div>
        }

    return(
        <>
        <center>
            <h1>{user.name}</h1>
            <div>Email:{user.email}</div>
            <div>Phone:{user.phone}</div>
            <div>Website:{user.website}</div>
            <div>Company:{userCompany.name}</div>
            <div>Address:{userAddress.street}{userAddress.suite}{userAddress.city}{userAddress.zipcode}</div>

        </center>

        </>
    )
}