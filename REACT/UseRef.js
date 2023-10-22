import React, { useRef } from 'react';

function ExampleComponent() {
  // Create a ref object
  const textRef = useRef(null);

  // Function to change the text
  const changeText = () => {
    textRef.current.textContent = 'Text has been changed!';
  };

  return (
    <div>
      <h1>useRef Example</h1>
      <p ref={textRef}>This is some text.</p>
      <button onClick={changeText}>Change Text</button>
    </div>
  );
}

export default ExampleComponent;


