import React from 'react'
import { useState } from 'react'
import countryService from '../feautures/countryService';

function UpadateForm() {
  const [formData, setFormData] = useState({
    name: '',
    averageGreenhouseGas: 0,
    averageTemperature: 0,
    averageWildfire: 0,
    averageNaturalDisaster: 0

  })
  const {name, averageGreenhouseGas, averageTemperature, averageWildfire,averageNaturalDisaster} = formData;


  const onChange = (e) => {
    setFormData(prevState => ({
      ...prevState,
      [e.target.name]: e.target.value
    }))
  }

  const onSubmit = async (e) => {
    e.preventDefault()
    const countryData = {
      name: name.substring(0, name.length - 1),
      averageGreenhouseGas,
      averageTemperature,
      averageWildfire,
      averageNaturalDisaster
    }
    const countryId = name.charAt(name.length - 1)
    console.log('CountryData:', countryData);
    console.log(countryId);

    try {
      const response = await countryService.updateCountry(countryData, countryId)
      console.log(response);
    } catch (error) {
      console.error('Error creating country:', error)
    }
  }

  return (
    <form className='flex flex-wrap flex-col content-center space-y-12 pb-16 pt-8'
          onSubmit={onSubmit}
    >
      <div className='flex flex-col space-y-2'>
        <label htmlFor="" className='font-mono'>Name:</label>
        <input 
          className='px-2 py-0.5 rounded-md'
          type='text'
          id='name'
          name='name'
          value={name}
          onChange={onChange}
        />
      </div>

      <div className='flex flex-col space-y-2'>
        <label htmlFor="" className='font-mono'>Average greenhouse gas emissions:</label>
        <input 
          className='px-2 py-0.5 rounded-md text-center'
          type='number'
          id='averageGreenhouseGas'
          name='averageGreenhouseGas'
          value={averageGreenhouseGas}
          onChange={onChange}
        />
      </div>

      <div className='flex flex-col space-y-2'>
        <label htmlFor="" className='font-mono'>Average temperature:</label>
        <input 
          className='px-2 py-0.5 rounded-md text-center '
          type='number'
          id='averageTemperature'
          name='averageTemperature'
          value={averageTemperature}
          onChange={onChange}
        />
      </div>

      <div className='flex flex-col space-y-2'>
        <label htmlFor="" className='font-mono'>Average wildfires:</label>
        <input 
          className='px-2 py-0.5 rounded-md text-center'
          type='number'
          id='averageWildfire'
          name='averageWildfire'
          value={averageWildfire}
          onChange={onChange}
        />
      </div>

      <div className='flex flex-col space-y-2'>
        <label htmlFor="" className='font-mono'>Average natural disasters:</label>
        <input 
          className='px-2 py-0.5 rounded-md text-center'
          type='number'
          id='averageNaturalDisaster'
          name='averageNaturalDisaster'
          value={averageNaturalDisaster}
          onChange={onChange}
        />
      </div>

      <div className='flex justify-center'>
        <button className='w-2/3 py-1 border-solid rounded-2xl font-bold bg-green-900
                           hover:bg-red-300'>
          Submit
        </button>
      </div>

    </form>
  )
}

export default UpadateForm