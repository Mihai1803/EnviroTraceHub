import React from 'react'
import Navbar from '../components/Navbar'
import DeleteForm from '../components/DeleteForm'

function DeletePage() {
  return (
    <section  className='w-screen h-screen bg-teal-500'>
      <Navbar />
      <h1 className='mt-16 text-center font-mono font-bold'>Delete a country from the database</h1>
      <DeleteForm />
    </section>
  )
}

export default DeletePage