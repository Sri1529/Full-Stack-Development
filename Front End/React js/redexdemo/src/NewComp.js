import React from "react";
import {connect} from "react-redux"

 class NewComp extends React.Component
{
    styles={
        fontStyle:"italic",
        color:"purple"
    }

    render()
    {
        return(
            <>
            <h3 style={this.styles}>{this.props.message}</h3>
            <button onClick={this.props.ButtonChange}>Subscribe</button>
            </>
        )
    }
}

const mapStateprops = state=>
{
    return{
        message:state.messsage
    }
}

const mapDispatchtoProps=dispatch=>
{
    return{
        ButtonChange:()=>dispatch({type:"Message_Change"})
    }
}

export default connect(
    mapStateprops,
    mapDispatchtoProps
)(NewComp);