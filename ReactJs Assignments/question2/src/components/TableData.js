import React from "react";
import PrintData from "./PrintData";
import "./TableDataStyle.css";

function TableData() {
  const data = [
    {
      name: "Charlie",
      job: "Janitor",
    },
    {
      name: "Mac",
      job: "Bouncer",
    },
    {
      name: "Dee",
      job: "Aspiring actress",
    },
    {
      name: "Dennis",
      job: "Bartender",
    },
  ];

  const dataList = data.map((data) => (
    <PrintData key={data.name} data={data} />
  ));

  return (
    <div>
      <table className="data">
        <tbody>
          <tr>
            <th>Name</th>
            <th>Job</th>
          </tr>
        </tbody>
      </table>
      {dataList}
    </div>
  );
}

export default TableData;
