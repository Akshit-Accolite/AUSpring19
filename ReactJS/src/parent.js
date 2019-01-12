import React, { Component } from 'react';
import ChildFunction from './child';

export class Parent extends Component {
    state = {
        name: "Akshit"
    };
    constructor() {
        super();
        this.handleClick = this.handleClick.bind(this);

    }

    handleClick() {
        setTimeout(() => {
            this.setState({
                name: "Akshit Arora"
            });
        }, 2000);
    }

    onUpdate = data => {
        console.log("Yeah we got the data from child", data);
    };

    render() {
        return (
            <div>
                <button onClick={this.handleClick}>Change name</button>
                {this.state.name}
                <span>hello</span>


                <ChildFunction name={this.state.name} onUpdate={this.onUpdate} />
            </div>
        );
    }
}

export default Parent;