import image from "./logo.png"

export function Background()
{
    return(
        <div style={{backgroundImage:`url(${image})`,backgroundRepeat:"no-repeat",backgroundSize:"contain",height:600,width:600,
        alignItems:"center",justifyContent:"center",display:"flex",color:"orange"}}>
            Hello world
        </div>
    )
}