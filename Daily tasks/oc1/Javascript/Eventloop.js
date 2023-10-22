// An event loop in JavaScript is a mechanism that allows asynchronous, 
// non-blocking operations to be performed efficiently. It continually 
// checks for events in the program's execution stack and processes them
//  one by one. This enables JavaScript to handle tasks like user 
//  interactions, network requests, and timers without freezing the 
//  application or blocking the main thread. The event loop ensures 
 
//  that JavaScript remains responsive and can manage multiple tasks concurrently, 
//  making it well-suited for building interactive web applications.

console.log("start");
setTimeout(()=>{
    console.log("processing");
},1000);
console.log("end");