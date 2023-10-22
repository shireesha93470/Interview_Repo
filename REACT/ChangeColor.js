import React ,{useState} from 'react';
function changeColor()
{
  const [colors,setColors]=useState("");
  const colorchange=()=>{
    setColors("red");
  }
  return(
    <>
    <h1 style={{color:colors}}>siri</h1>
    <button onClick={colorchange}>Changecolor</button>
    
    </>
  )
}

export default changeColor;
