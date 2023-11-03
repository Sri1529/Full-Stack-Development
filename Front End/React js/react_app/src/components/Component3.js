import Component4 from "./Component4"
function Component3({user})
{

    return(
        <div>
          <h1>Component 3</h1>
          <Component4 user={user}></Component4>
        </div>
    )
}export default Component3