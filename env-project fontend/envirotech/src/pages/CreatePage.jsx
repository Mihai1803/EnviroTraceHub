import React from 'react'
import Navbar from '../components/Navbar'
import CreateForm from '../components/CreateForm'

function CreatePage() {
  return (
    <section className='w-screen h-screen bg-teal-500'>
      <Navbar />
      <h1 className='text-center font-bold font-mono'>Add a new country to the database</h1>
      <CreateForm />
    </section>
  )
}

export default CreatePage