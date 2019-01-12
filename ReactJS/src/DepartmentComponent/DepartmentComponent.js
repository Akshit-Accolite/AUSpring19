import React, { Component } from 'react';


class DepartmentComponent extends Component{
    state ={
        shown : false,
    }
    constructor(){
        super();
    }
    onClickAdd = () =>{
        this.setState({
            shown : true
        });
    }
    onClickCancel = () => {
        this.setState({
            shown : false
        });
    }
    addData = (e,props) =>{
        e.preventDefault();
        var arr =[];
        arr.push(document.getElementById('dept').value);
        arr.push(document.getElementById('desc').value);
        this.props.funAdd2(arr); 
    }
    render(){
        return (
            <div>
                <button onClick={ this.onClickAdd }>Add Department</button>
            { this.state.shown && (
            <div>
            <form>
                <table>
                    <tr><td>Department</td><td><input type="text" id="dept" /></td></tr> 
                    <tr><td>Description</td><td><input type="text" id="desc" /></td></tr>  
                    <tr><td><button onClick={this.addData}>Add</button></td>
                    <td><button onClick={this.onClickCancel}> Cancel</button></td></tr></table>
            </form>
            </div>
            )}
            </div>
        );
    }

}

export default DepartmentComponent;