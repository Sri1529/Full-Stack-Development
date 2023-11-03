import {Routes,Route,Link} from "react-router-dom";
import { Post } from "./post";
import { Home } from "../Webpage_3/home";

export function Index()
{
    return(
        <>
        <Routes>
            <Route path="/" element={<Home></Home>}></Route>
            <Route path="/user/:id" element={<Post></Post>}></Route>
        </Routes>
        </>
    )
}