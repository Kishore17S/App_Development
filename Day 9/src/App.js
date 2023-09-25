import React from 'react';
import './App.css';
import Login from './components/login';
import SignUp from './components/signup';
import { BrowserRouter, Route, Routes} from 'react-router-dom';
import Home from './components/home';
import SideNavBar from './Dashboard/SideNavBar';
import Contact from './components/contact';
import About from './components/About';
import workout from './components/workout';



function App() {
  return ( 
    <BrowserRouter>
      <Routes>
        <Route path='/' Component={Home} />
        <Route path='/signup' Component={SignUp} />
        <Route path='/login' Component={Login} />
        <Route path='/SideNavBar' Component={SideNavBar} />
        <Route path='/contact' Component={Contact} />
        <Route path='/about' Component={About} />
        <Route path='/workout' Component={workout} />
      </Routes>        
    </BrowserRouter>  
    // <SideNavBar/>
    // <About />
    

  );
}

export default App;
