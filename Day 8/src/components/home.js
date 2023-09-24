import React from 'react';
import './home.css'; 
import store from './store';
import { Link } from 'react-router-dom';
import logo1 from '../1.png'



const Home = () => {
  const name = store.getState().name.name;
  console.log(name)

  return (
    <div className='aa'>
      <div className="dashboard">
        <nav className="navbar">
        <img
                className="logo1"
                src={logo1} 
                alt=""
                srcset=""
              />
          <h1 style={{marginLeft:"-180px"}}>FIT ZONE</h1>
          <ul>
            <Link style={{textDecoration:'none'}} to="/login"><li className='daash'>Dashboard</li></Link>
            <li>Home</li>
            <li>Session</li>
            <li>Progress</li>
            <li>Contact</li>
            {/* <li className='redu'>{name}</li> */}
          </ul>
        </nav> 
      </div>
    </div>
    
  );
};

export default Home;
