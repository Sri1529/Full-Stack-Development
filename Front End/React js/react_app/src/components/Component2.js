import Component3 from "./Component3"
function Component2({user})
{

    return(
        <div>
          <h1>Component 2</h1>
          <Component3 user={user}></Component3>
        </div>
    )
}export default Component2