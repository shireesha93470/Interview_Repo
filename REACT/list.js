import React from "react";
import ReactDOM from "react-dom";

function List() {
  const numbers = [1, 2, 3, 4, 5];
  const updatedNumbers = numbers.map((number) => {
    return (
      <li key={number}>{number}</li>
    );
  });

  ReactDOM.render(
    <ul>{updatedNumbers}</ul>,
    document.getElementById("root")
  );
}

export default List; 
