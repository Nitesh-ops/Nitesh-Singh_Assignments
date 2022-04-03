import React from 'react'
import { NavLink } from 'react-router-dom'

export const NavBar = () => {
  return (
    <nav className="primary-nav"> 
      <NavLink to="/">
        HOME
      </NavLink>
      <NavLink to="/projects">
        PROJECTS
      </NavLink>
      <NavLink to="/services">
        SERVICES
      </NavLink>
      <NavLink to="/contacts">
        CONTACT
      </NavLink>
    </nav>
  )
}
