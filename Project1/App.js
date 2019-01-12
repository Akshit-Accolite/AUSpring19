/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Component } from 'react';
import { Platform, StyleSheet, Text, View, Button, Image } from 'react-native';

const instructions = Platform.select({
  ios: 'Press Cmd+R to reload,\n' + 'Cmd+D or shake for dev menu',
  android:
    'Double tap R on your keyboard to reload,\n' +
    'Shake or press menu button for dev menu',
});

type Props = {};
class Blink extends Component {
  constructor(props){
    super(props);
    this.state={isShowing :true};

    setInterval (()=>(
      this.setState(previousState =>(
        {isShowing:!previousState.isShowing}
      ))
    ),1000);
  }

  render() {
      if(!this.state.isShowing){
        return null;
      }
    return (
      <Text>{this.props.text}</Text>
    );
  }
}

export default class App extends Component<Props> {
  render() {
    return (
      <View>
        <Blink text="Hello World"/>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
    flex: 2
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});
