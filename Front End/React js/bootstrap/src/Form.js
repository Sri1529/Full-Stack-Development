import React from "react";
import { Insert } from "./Insert";
import { Show1 } from "./Show1";

export class Form extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state=
        {
            formData:{}
        }
    }
    submitData=(newData)=>
    {
        this.setState({formData:newData})
    }
    render()
    {
        return(
            
            <div className="container-fluid">
                <h1>Form example</h1>
                <div className="row">
                    <div className="col-12">
                        <Insert submit={this.submitData}></Insert>

                    </div>
                    <div className="col-12">
                       <Show1 data={this.state.formData}></Show1>
                    </div>

                </div>
            </div>
        )
    }
}