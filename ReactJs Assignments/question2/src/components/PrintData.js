import React from "react";
import "./TableDataStyle.css";

export default function PrintData(props) {
  return (
    <div>
      <table className="data">
        <tbody>
          <tr>
            <td>{props.data.name}</td>
            <td>{props.data.job}</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}
