import React,{Component} from 'react';
//import '..DisplayComponent/Display.css';

class searchDept extends Component{

    constructor(){
        super();
    }

    displayRes =(props)=>{
        var searchElem=document.getElementById('dept').value;
        var dept=this.props.dept;
        var empName=this.props.emp;
        var res="<table>"

        for(var i=0;i<empName.length;i++){
            if(searchElem==empName[i].department){
                res=res+"<tr><td>"+empName[i].name+"</td><td>"+empName[i].lname+"</td><td>"+empName[i].age+"</td></tr>";
            }
            res=res+"</table";
            document.getElementById('search').innerHTML=res;
        }
    
}

    render(){
        return (
            <div>
                <br/>
            <select id="dept">
            {this.props.dept && this.props.dept.map((s, i) =>{
                return(
                    <option>{s.name}</option>
                );
            })
            }
        </select>
        <button onClick={this.displayRes}>search</button>
        <div id="search"></div>
        </div>
        );
    }


};

export default searchDept;