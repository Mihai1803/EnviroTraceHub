import React from 'react'
import { Link } from 'react-router-dom'

function Navbar() {
  return (
    <nav>
    <ul className='flex space-x-12 py-14 justify-center content-center'>
      <li>
        <Link to="/">Home</Link>
      </li>
      <li>
        <Link to="/find">Find</Link>
      </li>
      <li>
        <Link to="/create">Create</Link>
      </li>
      <li>
        <Link to="/update">Update</Link>
      </li>
      <li>
        <Link to="/delete">Delete</Link>
      </li>
    </ul>
  </nav>
  )
}

export default Navbar