import React from "react";
import { connect } from "react-redux";
import {createStore} from 'redux'

class Increment extends React.Component
{
    render()
    {
        return(
            <>
            <h1>Increment and Decrement</h1>
            <h1>State={this.props.message}</h1>
            <button onClick={this.props.increbutt}>Increment</button>
            <button onClick={this.props.decrebutt}>Decrement</button>
            <button onClick={this.props.reset}>Reset</button>
            </>
        )
    }

    
}
const messagetoprops=(state)=>
{
    console.log('State:', state);
   return{
    message:state.mess
   }
}

const buttontoprops=dispatrch=>
{
    return{
        increbutt: () => dispatrch({ type: 'INCREMENT' }),
        decrebutt: () => dispatrch({ type: 'DECREMENT' }),
        reset:()=>dispatrch({type:'RESET'})
    }
}

// const butt1toprops=dispatch=>
// {
//     return{
//         decrebutt:()=>dispatch({type:'DECREMENT'})
//     }
// }

// const resetbutt=dispatch=>
// {
//     return{
       
//     }
// }

export default connect(
    messagetoprops,
    buttontoprops,
   // butt1toprops,
   // resetbutt
    
)(Increment)