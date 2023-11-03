export function App1()
{
    const userName="John Smith";
    return(
        <Layout userName={userName}>
            Main Content
        </Layout>
    );
}

function Layout({children,userName})
{
    return(
        <div>
            <Header userName={userName}/>
            <main>
                {children}
            </main>
        </div>
    )
}

function Header({userName})
{
    return (
        <header>
            <UserInfo userName={userName}/>
        </header>
    )
}

function UserInfo({userName})
{
    return<span>{userName}</span>
}