import React from "react";
class Multi_input extends React.Component
{
    constructor(props)
    {
        super(props)
        {
            this.state={
                personGoing:true,
                numberOfpersons:5
            }
            this.handleinputchange=this.handleinputchange.bind(this);
        }
    }
    handleinputchange(event)
    {
        const target=event.target;
        const value=target.type==='checkbox' ? target.checked:target.value;

        const name=target.name;
        this.setState({[name]:value});

    }
    render()
    {
        return(
            <form>
                <h1>Multiple Input Controlled Form Example</h1>
                <label>
                    Is Person Going
                
                <input name="personGoing" type="checkbox" checked={this.state.personGoing}
                onChange={this.handleInputChange}></input>
                </label>
                <br>
                </br>
                <label>
                  Number of persons:
                  <input name="numberOfpersons" type="number" value={this.state.numberOfpersons}
                  onChange={this.handleInputChange}></input>
                </label>
            </form>
        )
    }
}export default Multi_input;