import React from 'react'
import { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import countryService from '../feautures/countryService'

function FindForm() {
  const [formData, setFormData] = useState({
    name: ''
  })
  const { name } = formData
  const navigate = useNavigate()

  const onChange = (e) => {
    setFormData(prevState => ({
      ...prevState,
      [e.target.name]: e.target.value
    }))
  }

  const onSubmit = async (e) => {
    e.preventDefault()
    const countryName = name.substring(0, name.length - 1)
    const countryId =  name.charAt(name.length - 1)

    try {
      const response = await countryService.getCountry(countryId)
      if (countryName != response.name) {
        throw new Error
      } else {
        console.log(response);
        window.location.reload()
      }
    } catch (error) {
      console.error('Error finding country:' + error)
    }
  }


  return (
    <form className='flex flex-wrap flex-col content-center pt-12'
          onSubmit={onSubmit}
    >
      <div className='flex space-x-6'>
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
      <div className='text-xs pt-1 pb-10'>
        (*)Name needs to have the following format: CountryNameCountryId
      </div>
      <div className='flex justify-center'>
        <button className='w-1/3 py-1 border-solid rounded-2xl font-bold bg-green-900
                           hover:bg-red-300'>
          Submit
        </button>
      </div>
    </form>
  )
}

export default FindForm