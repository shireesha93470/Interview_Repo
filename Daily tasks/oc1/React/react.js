import React ,{useState} from 'react';

function counter(){
const[count ,setCount]=useState(0);
    const increment=()=>{
        setCount(count+1);
    }
    const decrement=()=>{
        if(count>0)
       {
        setCount(count-1);
       }

    }
    return(
        <>
            <h1>{count}</h1>
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
        </>
    )
}
export default counter;