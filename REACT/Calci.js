import React, { useState } from "react";
import "./calci.css";

function Calci() {
  const [value, setValue] = useState("");

  return (
    <div className="container">
      <div className="calculator">
        <form action="">
          <div className="display">
            <input type="text" value={value} />
          </div>
          <div>
            <input
              type="button"
              value="7"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="8"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="9"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="/"
              className="color"
              onClick={(e) => setValue(value + e.target.value)}
            />
          </div>
          <div>
            <input
              type="button"
              value="4"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="5"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="6"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="*"
              className="color"
              onClick={(e) => setValue(value + e.target.value)}
            />
          </div>
          <div>
            <input
              type="button"
              value="3"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="2"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="1"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="-"
              className="color"
              onClick={(e) => setValue(value + e.target.value)}
            />
          </div>
          <div>
            <input
              type="button"
              value="0"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="."
              className="color"
              onClick={(e) => setValue(value + e.target.value)}
            />
            <input
              type="button"
              value="="
              className="equal color"
              onClick={(e) => setValue(eval(value))}
            />
            <input
              type="button"
              value="+"
              className="color"
              onClick={(e) => setValue(value + e.target.value)}
            />
          </div>
        </form>
      </div>
    </div>
  );
}

export default Calci;


//css

// .container {
//     width: 100%;
//     height: 100vh;
//     display: flex;
//     align-items: center;
//     justify-content: center;
//     margin-top: 100px;
//   }
  
//   .calculator {
//     padding: 30px;
//     border-radius: 10px;
//     background-color: #363a57;
//   }
  
//   form input {
//     width: 60px;
//     height: 60px;
//     font-size: 36px;
//     background-color: rgb(56, 56, 56);
//     margin: 2px;
//     border-radius: 10px;
//     color: white;
//     cursor: pointer;
//   }
//   form .display {
//     display: flex;
//     justify-content: flex-end;
//     margin: 5px 0px 15px 0px;
//   }
  
//   form .display input {
//     text-align: right;
//     flex: 1;
//     font-size: 30px;
//     background-color: rgb(193, 215, 152);
//   }
  
//   form input.equal {
//     width: 60px;
//   }
//   .color {
//     background-color: rgb(168, 166, 166);
//   }
  