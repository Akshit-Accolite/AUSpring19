

function employee(name,id){
this.name=name;
this.id=id;
this.idFun=function(){
  console.log("Ths id is "+this.id);
  }
}

//using prototype
employee.prototype.hometown;

function printNameId(){
  console.log(this.x+";"+this.y)
}


//using call
function hr(ename,id) {
  employee.call(this,ename,id);
  this.lastName = 'ghi';
  this.hrActivities="done";
  this.leave_assigned="done";
  this.teamOutings=3;
  this.hometown="delhi";
}

console.log(new hr('temp',12).name);

function manager(ename,id) {
  employee.call(this,ename,id);
  this.lastName = 'mno';
  this.projectCompleted="60%";
  this.teamSize=5;
  this.clientName="abctech";
  this.hometown="Chandigarh";
}

console.log(new manager('jkl',12).name);

function tech(ename,id) {
  employee.call(this,ename,id);
  this.lastName = 'mno';
  this.technologyUsed="java";
  this.projectCompleted="78%";
  this.teamLead="lmn";
  this.hometown="Jammu";
}

//using proto
tech.__proto__.id=34;

console.log(new tech('zxy',90).id);

//using bind

let hr1={
  name:"xyz",
  id:10,
  salary :90000 
};

let manager1={
  name:"abc",
  id:235,
  salary : 80000
};

let tech1={
  name:"zxy",
  id:908,
  salary : 60000
};

function printNameId(){
  console.log(this.name+','+this.id);
}

function bonus(){
  this.salary+=20000
  console.log(this.salary);
}

  let bonus_fun_manager=bonus.bind(manager1);
  bonus_fun_manager();
  
  let bonus_fun_hr=bonus.bind(hr1);
  bonus_fun_hr();
  
  let bonus_fun_tech=bonus.bind(tech1);
  bonus_fun_tech();
  
  let hr_fun=printNameId.bind(hr1);
  hr_fun();
  
  let manager_fun=printNameId.bind(manager1);
  
  manager_fun();

  let tech_fun=printNameId.bind(tech1);
  
  tech_fun();


