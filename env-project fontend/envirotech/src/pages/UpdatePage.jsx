import React from 'react'
import Navbar from '../components/Navbar'
import UpdateForm from '../components/UpdateForm'


function UpdatePage() {
  return (
    <section className='w-screen h-screen bg-teal-500'>
      <Navbar />
      <h1 className='text-center font-mono font-bold'>Update an existing country</h1>
      <UpdateForm />
    </section>
  )
}

export default UpdatePage