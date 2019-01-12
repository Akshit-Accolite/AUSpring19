import React, { Component } from 'react';
import './AddEmployee.css';


class AddEmployeeComponent extends Component{
    state ={
        shown : false,
    }
    constructor(props){
        super(props);
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
        var name=document.getElementById('name').value.length;
        //var l1=parseInt(name.length);
        var age=document.getElementById('age').value;
        var age1=parseInt(age);
        console.log(age, age1, name);
        if(age1>18 && name<20 && name>0){
            
            var arr =[];
            arr.push(document.getElementById('name').value);
            arr.push(document.getElementById('lname').value);
            arr.push(document.getElementById('age').value);
            arr.push(document.getElementById('des').value);
            arr.push(document.getElementById('location').value);
            arr.push(document.getElementById('dept').value);
            this.props.funAdd(arr);
        }
        else{
            document.getElementById('error').innerHTML="The length of name should be between 1 and 20 and the age should be greater than 18";
        }  
    }
    render(props){
        return (
            <div>
                 <button onClick={ this.onClickAdd }>Add Employee</button>
            { this.state.shown && (
            <div>
            <form>
              Name <input type="text" id="name" /> <br></br>
              Last Name<input type="text" id="lname" /><br></br>
              Age <input type="number" id="age" /><br></br>
              Designation <input type="text" id="des" /><br></br>
              Location <input type="text" id="location" /><br></br>
              <select id="dept">
                {this.props.dept && this.props.dept.map((dept,i) => {
                    return(
                        <option>{dept.name}</option>
                    );
                })
                }
              </select> 
              <button onClick={this.addData}>Add</button>
              <button onClick={this.onClickCancel}> Cancel</button>
              <span id="error"></span>
            </form>
            </div>
            )}
            </div>
        );
    }

}

export default AddEmployeeComponent;