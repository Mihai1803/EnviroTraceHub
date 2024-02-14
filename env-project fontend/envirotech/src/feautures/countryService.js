import axios from "axios";

const API_URL = 'http://localhost:8080/api/country';


const createCountry = async (countryData) => {
  const config = {
    headers: {
      'Content-Type': 'application/json'
    }
  }

  const response = await axios.post(API_URL, countryData, config);
  return response.data
}


const updateCountry = async (countryData, countryId) => {
  const config = {
    headers: {
      'Content-Type': 'application/json'
    }
  }

  const response = await axios.put(API_URL + '/' + countryId, countryData, config)
  return response.data
}

const getCountry = async (countryId) => {
  const response = await axios.get(API_URL + '/' + countryId)

  if (response.data) {
    localStorage.setItem('country', JSON.stringify(response.data))
  }
  return response.data
}


const deleteCountry = async (countryId) => {
  const response = await axios.delete(API_URL + '/' + countryId)
  return response.data
}



const countryService = {
  createCountry,
  deleteCountry,
  getCountry,
  updateCountry
}

export default countryService