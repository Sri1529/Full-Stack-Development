import React from "react";
import './style.css';
class Feedback1 extends React.Component
{
    render()
    {
        return(
            <div className="Feedback1">
                Feedback Box:<input id="fbox" type="text" placeholder="Enter Your Feedback here.."></input>
            </div>
        )
    }
}export default Feedback1;