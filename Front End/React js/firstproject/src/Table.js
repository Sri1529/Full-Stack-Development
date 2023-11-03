
import React,{Component} from 'react'
import ReactTable from "react-table-6"

import "react-table-6/react-table.css"; // Import the CSS for React Table


class Table extends React.Component
{
    render()
    {
        const data=[{name:'sri',age:22},{name:'Noble',age:22},{name:'Sakthi',age:22},{name:'Hari',age:22},
        {name:'Katz',age:22}, {name:'Stark',age:22}]

        const columns=[{Header:"Employee Name",accessor:'name'},{Header:"Employee Age",accessor:'age'}]

        return(
            <div>
                <ReactTable
                    data={data}
                    columns={columns}
                    defaultPageSize={2}
                    pageSizeOptions={[2,4,6]}

                />
            </div>
        )
    }
}export default Table