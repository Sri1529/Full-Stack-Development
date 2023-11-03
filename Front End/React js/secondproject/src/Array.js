function Array()
{
    const items=['pen','pencil','Eraser','Sharpner','Pelikon']
    return(
        <div>
            <ul>
                {items.map((item,i)=>(
                    <li key="{i}">{item}</li>
                ))
                  
                }
            </ul>
        </div>
    )
}
export default Array;