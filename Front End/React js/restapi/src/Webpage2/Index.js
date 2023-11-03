import { Route,Routes,Link } from "react-router-dom"
import { Home } from "./Home1"
import { Post } from "./Post"

export function Index()
{
    return(
        <>
         <Routes>
            <Route path="/" element={<Home></Home>}></Route>
            <Route path="/post/:id" element={<Post></Post>}></Route>
         </Routes>
        </>
    )
}