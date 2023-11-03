import { useParams } from "react-router-dom"
import { useEffect,useState } from "react";
export function Post()
{
    const{id}=useParams();
    const [error,seterror]=useState("");
    const[isloaded,setisloaded]=useState(false);
    const[user,setuser]=useState([]);
    // const[userid,setuserid]=useState([]);
    // const[body,setbody]=useState([]);

    useEffect(()=>{
        fetch("http://jsonplaceholder.typicode.com/posts/"+id )
        .then(res => res.json())
        .then(
          (data)=>{
            console.log(data);
            setuser(data);
            setisloaded(true);
            // setuserid(data.userid);
            // setbody(data.body);
    
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
            <h1>{user.userid}</h1>
            <div>ID:{user.id}</div>
            <div>Title:{user.title}</div>
            <div>Body:{user.body}</div>


        </center>
        </>
    )
}