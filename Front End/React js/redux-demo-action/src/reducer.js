const initialState={
    mess:0
}
export const counterReducer=(state=initialState,action)=>
{
    //const newState={...state}
    switch (action.type) {
        case "INCREMENT":
          return { ...state, mess: state.mess + 1 };
        case "DECREMENT":
          return { ...state, mess: state.mess - 1 };
        case "RESET":
            return{...state,mess:state.mess=0}  
        default:
          return state;
      }
}