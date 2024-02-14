import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Landing from './pages/Landing'
import CreatePage from './pages/CreatePage'
import FindPage from './pages/FindPage' 
import UpdatePage from './pages/UpdatePage'
import DeletePage from './pages/DeletePage'

import './App.css'


function App() {
  return (
    <>
      <Router>
        <Routes>
          <Route path='/' element={<Landing />} />
          <Route path='/create' element={<CreatePage />} />
          <Route path='/find' element={<FindPage />} />
          <Route path='/update' element={<UpdatePage />} />
          <Route path='/delete' element={<DeletePage />} />
        </Routes>
      </Router>
    </>
  );
}

export default App;
