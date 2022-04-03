import React, { useState } from "react";
import "./stylesheets/stylesheets.css";
import "./stylesheets/TableDataStyle.css";

function EmployeeList() {
  const [employee, setEmployee] = useState([]);

  const handleChange = (e) => {
    const updateUsers = [
      ...employee,
      {
        id: employee.length + 1,
        name: e.target[0].value,
        job: e.target[1].value,
      },
    ];
    setEmployee(updateUsers);
  };

  const addEmployee = (e) => {
    e.preventDefault();
    handleChange(e);
    console.log(employee);
  };

  const handleDelete=(empID)=>{
    const newEmployees = [...employee];

    const index = employee.findIndex((employee) => employee.id === empID);

    newEmployees.splice(index, 1);

    setEmployee(newEmployees);
  }

  return (
    <div>
      <div className="firstDiv">
        <p>Add a employee with a name and job in the table</p>
        <table className="data">
          <tbody>
            <tr>
              <th>Name</th>
              <th>Job</th>
              <th>Remove</th>
            </tr>
          </tbody>
        </table>
        {employee.map((emp) => (
          <table className="data" key={emp.id}>
            <tbody>
              <tr>
                <td>{emp.name}</td>
                <td>{emp.job}</td>
                <td>
                  <button type="button" className="btn btn-danger btn-sm" onClick={()=>handleDelete(emp.id)}>
                    Delete
                  </button>
                </td>
              </tr>
            </tbody>
          </table>
        ))}
      </div>

      <div className="myForm">
        <h4>Add New Employee</h4>
        <form onSubmit={addEmployee}>
          <div className="form-group">
            <label htmlFor="name">Name:</label>
            <input
              type="text"
              name="name"
              className="form-control"
              value={employee.name}
              required
            />

            <label htmlFor="name">Job:</label>
            <input
              type="text"
              name="job"
              className="form-control"
              value={employee.job}
              required
            />

            <button type="submit" className="btn btn-primary">
              Submit
            </button>
          </div>
        </form>
      </div>
    </div>
  );
}

export default EmployeeList;
