import React from 'react';

function App() {
  const stringLists = ['siri', 'Sachin', 'Kevin', 'Dhoni', 'Alisa'];

  const updatedLists = stringLists.map((strList, index) => (
    <li key={index}> {strList} </li>
  ));

  return (
    <div>
      <ul>{updatedLists}</ul>
    </div>
  );
}

export default App;
