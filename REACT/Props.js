// import React from 'react';

// // Define a functional component that accepts 'props' as an argument
// function Greeting(props) {
//   return (
//     <div>
//       <h1>Hello, {props.name}!</h1>
//       <p>{props.message}</p>
//     </div>
//   );
// }

// function App() {
//   return (
//     <div>
//       {/* Use the Greeting component with props */}
//       <Greeting name="John" message="Welcome to React!" />
//       <Greeting name="Alice" message="Have a great day!" />
//     </div>
//   );
// }

// export default App;
import React from 'react';
function Greeting(props){
    
    return(
        <div>
             <h1>Hello,{props.name}!</h1>
            <p>{props.message}</p>
        </div>
        );
}
function App(){
    return (
        <div>
            <Greeting name="siri" message="welcome to charala!"/>
        </div>
    )
}
