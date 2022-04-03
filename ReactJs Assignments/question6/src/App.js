import logo from "./logo.svg";
import "./App.css";
import { Routes, Route } from "react-router-dom";
import { NavBar } from "./components/NavBar";
import { Projects } from "./components/Projects";
import { Home } from "./components/Home";
import { Services } from "./components/Services";
import { Contacts } from "./components/Contact";
import { NoMatch } from "./components/NoMatch";

function App() {
  return (
    <>
      <NavBar />
      <Routes>
        <Route path="/" element={<Home />}></Route>
        <Route path="/projects" element={<Projects />}></Route>
        <Route path="/services" element={<Services />}></Route>
        <Route path="/contacts" element={<Contacts />}></Route>
        <Route path="*" element={<NoMatch />}></Route>
      </Routes>
    </>
  );
}

export default App;
