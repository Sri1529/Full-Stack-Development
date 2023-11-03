import React from "react";
import { connect } from "react-redux";
class Display extends React.Component
{
    render()
    {
        return(
            <>
            <h2>{this.props.message}</h2>
            <button onClick={this.props.buttchg}>Subscribe</button>
            </>
        )
    }
}
const mapStateprops=state=>
{
    return{
        message:state.mess
    }
}

const mapDispatchtoprops=dispatch=>
{
    return{
           buttchg:()=>dispatch({type:"Messagechange"})
    }
}

export default connect(
    mapStateprops,mapDispatchtoprops
)(Display)