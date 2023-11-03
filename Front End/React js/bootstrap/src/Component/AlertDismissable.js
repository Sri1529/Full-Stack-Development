import React from "react";
import { Alert,Button } from "react-bootstrap";
export class AlertDismissable extends React.Component
{
    constructor(props,context)
    {
        super(props,context);
        this.state={
            show:true

        }
        this.handledismiss=this.handledismiss.bind(this);
        this.handleshow=this.handleshow.bind(this);

    }
    handledismiss()
    {
        this.setState({show:false})
    }
    handleshow()
    {
        this.setState({show:true})
    }

    render()
    {
        if(this.state.show)
        {
            return(
                <>
                    <Alert bsStyle="danger" onDismiss={this.handledismiss}>
                        <h4>Oops you got an error</h4>
                        <p>
                            Change this and try again.This is a n alert box in js.
                        </p>
                        <p>
                               <button >Take this action</button>
                               <span>or</span>
                               <button class="btn btn-danger" onClick={this.handledismiss}>Hide AlertDismissable</button>
                        </p>
                    </Alert>
                </>
            )
        }
        return(
            <>
            <button class="btn btn-primary"onClick={this.handleshow}>Show Alert</button>
            </>
        )
    }
    
    
}