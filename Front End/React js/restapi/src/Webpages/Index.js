import { Route,Routes,Link } from "react-router-dom";
import { Home } from "./Home";
import { User } from "./User";
export function Webpages()
{
    return(
        <>
        <Routes>
            <Route path="/" element={<Home></Home>}></Route>
            <Route path="/user/:id" element={<User></User>}></Route>
           
        </Routes>
        </>
    )
}