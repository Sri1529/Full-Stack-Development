const Checklist=({CheckBoxes, checkedState, handeleCheckboxChange})=>{
    return (
        <div>
            {CheckBoxes.map((item, index)=>(
                <div key={index}>
                <label>
                    <input
                    type="checkbox"
                    checked={checkedState[index]}
                    onChange={()=> handeleCheckboxChange(index)}
                    />
                    {item}
                </label>
                </div>
            ))}
        </div>
    )
}
export default Checklist;