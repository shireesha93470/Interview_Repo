import { useState } from "react";
import "./styles.css";

export default function App() {
  const [name, setName] = useState("");
  const [last, setLast] = useState("");
  const [age, setAge] = useState("");
  const [address, setAddress] = useState("");

  function clickMe() {
    let a = document.querySelector(".first").value;
    let b = document.querySelector(".last").value;
    let c = document.querySelector(".age").value;
    let d = document.querySelector(".address").value;
    if (
      a.trim() === "" ||
      b.trim() === "" ||
      c.trim() === "" ||
      d.trim() === ""
    ) {
      alert("Please enter data in all fields.");
    } else {
      setName(a);
      setLast(b);
      setAge(c);
      setAddress(d);
    }
  }

  return (
    <div className="App">
      <div className="container">
        <div className="input-group">
          <label htmlFor="first-name">First Name </label>
          <input type="text" id="first-name" className="first" />
        </div>
        <div className="input-group">
          <label htmlFor="last-name">Last Name </label>
          <input type="text" id="last-name" className="last" />
        </div>
        <div className="input-group">
          <label htmlFor="age">Age </label>
          <input type="text" id="age" className="age" />
        </div>
        <div className="input-group">
          <label htmlFor="address">Address </label>
          <input type="text" id="address" className="address" />
        </div>
        <button onClick={() => clickMe()}>Submit</button>
        <h3>First Name: {name}</h3>
        <h3>Last Name: {last}</h3>
        <h3>Age: {age}</h3>
        <h3>Address: {address}</h3>
      </div>
    </div>
  );
}
