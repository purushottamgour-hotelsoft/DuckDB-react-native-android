import React from 'react';
import {NativeModules, Button} from 'react-native';

const {CalendarModule} = NativeModules;

const App = () => {
  const onPress = () => {
    const d = CalendarModule.createCalendarEvent('hello', 'bengaluru');
    console.log(d);
  };

  return (
    <Button
      title="Click to invoke your native module!"
      color="#841584"
      onPress={onPress}
    />
  );
};

export default App;
