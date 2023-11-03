import { useState } from "react";

function Hooks()
{
    // const [brand,setBrand]=useState("Ford")
    // const[model,setModel]=useState("Mustang")
    // const[year,setYear]=useState("1997")
    // const[color,setColor]=useState("red")
    const [car,Setcar]=useState(
        {
            brand:"Ford",
            model:"Mustang",
            year:"1997",
            color:"red"
        }
    )


    return(
        <div>
            <h1>My {car.brand}</h1>
            <p>It is a {car.color} {car.model} from {car.year}</p>
            <button onClick={()=>Setcar({...car,brand:"Audi"})}>Change Brand</button>
            <button onClick={()=>Setcar({...car,model:"Fortuner"})}>Change Brand</button>
            <button onClick={()=>Setcar({...car,year:"1961"})}>Change Year</button>
            <button onClick={()=>Setcar({...car,color:"Blue"})}>Change Color</button>
        </div>
    )
}export default Hooks;