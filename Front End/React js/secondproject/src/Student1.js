export const Wow=(props)=>
{
    console.log(props);
    return(
        <div>
        <p>First Name:{props.student.firstname}</p>
        <p>Last Name:{props.student.lastname}</p>
        <p>Email:{props.student.email}</p>
    </div>

    )
   
}