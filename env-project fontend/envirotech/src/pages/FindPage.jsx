import React from 'react'
import Navbar from '../components/Navbar'
import FindForm from '../components/FindForm'

function FindPage() {

  const country = JSON.parse(localStorage.getItem('country'))

  return (
    <section className='w-screen h-screen bg-teal-500'>
      <Navbar />
      <h1 className='mt-16 text-center font-mono font-bold'>Find a country in the database</h1>
      <FindForm />

      {
        country ?
        <div className='flex space-x-12 justify-center pt-24'>
          <h2 className='font-mono'>Name: {country.name}</h2>
          <p className='font-mono'>Average Temperature: {country.averageTemperature}</p>
          <p className='font-mono'>Average Natural Disasters: {country.averageNaturalDisaster}</p>
          <p className='font-mono'>Average Wildfires: {country.averageWildfire}</p>
          <p className='font-mono'>Average Greenhouse Gas Emissions: {country.averageGreenhouseGas}</p>
        </div>
        :
        <>

        </>

      }
    </section>
  )
}

export default FindPage