import React from 'react';
import './home.css'; 
import store from './store';
import { Link, useNavigate } from 'react-router-dom';
import logo1 from '../1.png'



const Home = () => {
  const name = store.getState().name.name;
  console.log(name)
  
  const nav = useNavigate()
  const Join = () => {
    nav("/login")
  }

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
          <h1 style={{marginLeft:"-99px"}}>FIT ZONE</h1>
          <ul>
          <Link style={{textDecoration:'none',color:'white'}} to="/"><li>Home</li></Link>
          <Link style={{textDecoration:'none',color:'white'}} to="/workout"><li>Workout</li></Link>
          <Link style={{textDecoration:'none'}} to="/SideNavBar"><li className='daash'>Dashboard</li></Link>
          <Link style={{textDecoration:'none',color:'white'}} to="/about"><li>About Us</li></Link>
            <Link style={{textDecoration:'none',color:'white'}} to="/contact"><li>Contact</li></Link>
            <Link style={{textDecoration:'none',color:'white'}} to="/login"><li>Login</li></Link>

            {/* <li className='redu'>{name}</li> */}
          </ul>
        </nav> 

        <div className='textbox'>
          <h5 className='jj'>JUST ONE MORE,</h5>
          <h3 className='oo'>ONE MORE SET.</h3>

          <button className='button1' onClick={Join}>Join now</button>


        </div>   

      </div>
    </div>
    
  );
};

export default Home;
