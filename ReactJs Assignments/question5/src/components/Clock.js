import React, { Component } from "react";
import { GoClock, GoCalendar } from "react-icons/go";
import { Switch } from "antd";
import "antd/dist/antd.css";
import "./stylesheets/clock.css";

export default class Clock extends Component {
  constructor(props) {
    super(props);

    var today = new Date(),
      time =
        today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
    var date =
      today.getDate() + " " + today.getMonth() + " " + today.getFullYear();

    this.state = {
      currentTime: time,
      currentDate: date,
      isToggle: false,
    };
    this.change = this.change.bind(this);

    this.refresh();
  }

  refresh() {
    setInterval(() => {
      var today = new Date(),
        time =
          today.getHours() +
          ":" +
          today.getMinutes() +
          ":" +
          today.getSeconds();
      this.setState({ currentTime: time });
    }, 1000);
  }

  change(checked) {
    checked
      ? this.setState((prevState) => ({
          isToggle: !prevState.isToggle,
        }))
      : this.setState((prevState) => ({
          isToggle: !prevState.isToggle,
        }));
  }

  render() {
    return (
      <div className="mainDiv">
        <div className="heading">
          <h1>
            <GoClock
              size={40}
              style={{ position: "relative", top: "8px", left: "-5px" }}
            />
            Digital Clock
          </h1>
        </div>
        <div className="clockPlace">
          <Switch checked={this.state.isToggle} onChange={this.change}  />
          <GoCalendar size={35} />
          <br />
          <span className="circle">
            <span className="currentTime">{this.state.currentTime}</span>
            <br />
            <span className="currentDate">
              {console.log(this.state.isToggle)}
              {this.state.isToggle ? this.state.currentDate : null}
            </span>
          </span>
          <br />
          <br />
        </div>
      </div>
    );
  }
}
