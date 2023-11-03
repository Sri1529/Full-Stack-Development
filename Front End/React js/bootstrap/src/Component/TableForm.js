import { useState } from "react"
import { Table } from "react-bootstrap"
import { AlertDismissable } from "./AlertDismissable"
export function TableForm()
{
    const [name,setname]=useState("React")
    return(
        <>
        <table class="table table-striped table-bordered table-condensed table-hover">
            <thead>
            <tr>
                    {name}
                </tr>
            <tr>
                
                <th>#</th>
                <th>FirstName</th>
                <th>SecondName</th>
                <th>UserName</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>Mark </td>
                    <td>Antony</td>
                    <td>@mark</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Jacob </td>
                    <td>Thoroton</td>
                    <td>@jack</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td colSpan="2">Larry the bird</td>
                    <td>@twitted</td>
                </tr>
            </tbody>
        </table>
        <AlertDismissable></AlertDismissable>
        </>
    )
}