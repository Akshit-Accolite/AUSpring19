import React, { Component } from 'react';
import "./AddEmployee.css";

class AddEmployee extends Component {
    data={};
    state = {
        shown: false
    };
    onClick = () => {
        this.setState({ shown: true });
    };
    onCancel = () => {
        this.setState({ shown: false });
    };

    handleChange = event => {
       
        console.log(event.target.value);
        this.data[event.target.id] = event.target.value;
        
        };

    adddata = (e) =>{
        console.log("In the add");
        var name=document.getElementById('name').value.length;
        //var l1=parseInt(name.length);
        var age=document.getElementById('age').value;
        var age1=parseInt(age);
        console.log(age, age1, name);
        if(age1>18 && name<20){
            e.preventDefault();
            this.setState({shown:false});
            this.props.funAdd(this.data);
        }
        else{
            document.getElementById('error').innerHTML="error";
        }
    }
   
    render() {
        return (
            <div>
                <button onClick={this.onClick}>Add Employee</button>
                {this.state.shown && (
                    <div>
                        <form>
                            <table>
                                <tr>
                                    <td>First Name<input type="text" id="name" onChange={this.handleChange} required/><br /></td></tr>
                                <tr>
                                    <td>Last Name<input type="text" id="lname" onChange={this.handleChange} required/><br /></td></tr>
                                <tr>
                                    <td>Age<input type="number" id="age"  onChange={this.handleChange} required/><br /></td></tr>
                                <tr>
                                    <td>Location<input type="text" id="location" onChange={this.handleChange} /><br /></td></tr>
                                    <select id="dept">
                                        {this.props.dept && this.props.dept.map((s, i) =>{
                                            return(
                                                <option>{s.name}</option>
                                            );
                                        })
                                        }
                                    </select>
                                <button onClick={this.adddata}>Add</button>
                                <button onClick={this.onCancel}> Cancel</button>
                                <span id="error"></span>
                            </table>
                        </form>
                    </div>
                )}
                
               
            </div>
            
        );
    }
}

export default AddEmployee;