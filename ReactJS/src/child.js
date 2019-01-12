import React, { Component } from 'react';


const ChildFunction = props => {
    let localFun = () => {
        props.onUpdate("hello");
    };
    return (
        <div>
            <button onClick={localFun}>
                Send data back</button>
        </div>
    );
};

export default ChildFunction;