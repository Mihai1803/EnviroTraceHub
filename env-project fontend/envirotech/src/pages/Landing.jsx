import React from 'react'
import Navbar from '../components/Navbar'
import background from '../assets/background3.jpg'

function Landing() {

  const sectionStyle = {
    backgroundImage: `url(${background})`,
    backgroundSize: 'cover',
    backgroundPosition: 'center',
  };

  return (
    <section className='w-screen h-screen' style={sectionStyle}>
      <Navbar />
      <div className='flex justify-center content-center py-12'>
        <h1 className='font-mono font-bold text-6xl'>EnviroTech</h1>
      </div>
      <p className='font-mono text-center'>
          Keeping track of environmental changes to promote a sustainable future
      </p>
    </section>
  )
}

export default Landing