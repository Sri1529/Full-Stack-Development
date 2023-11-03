import React from "react";
class MyComponent extends React.Component
{
   constructor(props)
   {
    super(props)
    {
        this.callref=React.createRef();
        this.addrefinput=this.addrefinput.bind(this);
    }
   }
   addrefinput()
   {
    this.callref.current.focus();
   }
   render()
   {
    return(
        <div>
            <h2>Adding ref to DOM Element</h2>
            <input type="text" ref={this.callref}></input>
            <input type="button" value="Add Text" onClick={this.addrefinput}></input>
        </div>
    )
   }
}export default MyComponent