const initialState={
    mess:"Click Here to subscribe"
}

const Store=(state=initialState,action)=>
{
    const newState={...state}
    if(action.type==="Messagechange")
    newState.mess="Subscribed..."
return newState
}
export default Store;