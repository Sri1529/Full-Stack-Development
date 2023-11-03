import Component5 from "./Component5"
function Component4({user})
{

    return(
        <div>
          <h1>Component 4</h1>
          <Component5 user={user}></Component5>
        </div>
    )
}export default Component4