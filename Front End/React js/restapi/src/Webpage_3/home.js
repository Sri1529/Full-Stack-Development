import { useEffect,useState } from "react"
import { Link } from "react-router-dom";
export function Home()
{
    const[error,seterror]=useState('');
    const[isloaded,setisloaded]=useState(false)
    const[user,setuser]=useState([]);
    useEffect(()=>
    {
        fetch("https://jsonplaceholder.typicode.com/users")
        .then(res=>res.json())
        .then((data)=>
        {
            setisloaded(true)
            setuser(data)
        },
        (error)=>
        {
            setisloaded(true)
            seterror(error)
        }

        )
    },[])
    if(!isloaded)
    {
        return <h1>Loading...</h1>
    }
    else if(error)
    {
        return <h1>Error:{error.message}</h1>
    }
    return(
        <>
         <ul>
            {
                user.map(usyer=>(
                    <li>
                        <Link to={`user/${usyer.id}`}>{usyer.name}</Link>
                    </li>
                ))
            }
         </ul>
        </>
    )
}