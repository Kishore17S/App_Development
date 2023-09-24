import React from 'react';
import './App.css';
import Login from './components/login';
import SignUp from './components/signup';
import { BrowserRouter, Route, Routes} from 'react-router-dom';
import Home from './components/home';
import SideNavBar from './Dashboard/SideNavBar';



function App() {
  return ( 
    <BrowserRouter>
      
      <Routes>
        <Route path='/' Component={Home} />
        <Route path='/signup' Component={SignUp} />
        <Route path='/login' Component={Login} />
        <Route path='/SideNavBar' Component={SideNavBar} />

      </Routes>
        
    </BrowserRouter>  
    // <SideNavBar/>
    

  );
}

export default App;
