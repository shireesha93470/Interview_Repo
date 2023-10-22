import React, { useState } from "react";

function TodoApp() {
  const [task, setTask] = useState("");
  const [tasks, setTasks] = useState([]);

  const handleAddTask = () => {
    if (task.trim() === "") {
      alert("Please enter something");
    } else {
      setTasks([...tasks, task]);
      setTask("");
    }
  };

  const handleDeleteTask = (index) => {
    const newTasks = [];
    for (let i = 0; i < tasks.length; i++) {
      if (i !== index) {
        newTasks.push(tasks[i]);
      }
    }
    setTasks(newTasks);
  };

  return (
    <div>
      <input
        className="input"
        type="text"
        value={task}
        onChange={(e) => setTask(e.target.value)}
      />
      <button className="btn" onClick={handleAddTask}>
        ADD
      </button>
      <div className="display">
        {tasks.map((task, index) => (
          <div key={index}>
            <span className="todo">{task}</span>
            <button className="delete" onClick={() => handleDeleteTask(index)}>
              DELETE
            </button>
          </div>
        ))}
      </div>
    </div>
  );
}

export default TodoApp;

