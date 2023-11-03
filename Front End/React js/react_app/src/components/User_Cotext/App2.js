import { createContext, useContext } from "react";

    const UserContext=createContext("Unknown")
    export function App2(){
        const username="John cenha"
    return(
           <UserContext.Provider value={username}>
            <Layout>Main content</Layout>
           </UserContext.Provider>
    )
}

function Layout ({children}){
    return(
        <div>
            <Header/>
            <main>
                {children}
            </main>
        </div>
    )
}

function Header(){
    return (
        <header>
            <UserInfo/>
        </header>
    )
}
function UserInfo(){
    const username=useContext(UserContext)
    return <span>{username}</span>;
}
