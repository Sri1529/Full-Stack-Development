import React from "react";
class Constructor1 extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state=
        {
            data:'www.imarticus.org' 
        }
        this.handleEvent = this.handleEvent.bind(this);
    }
    handleEvent() 
    {
        console.log(this.state.data)
    }
    render()
    {
        return(
            <div>
                <h2>React Constructor Example</h2>
                <input type="text" value={this.state.data}></input>
                <button onClick={this.handleEvent}>Please Click</button>
            </div>
        )
    }
}
export default Constructor1;