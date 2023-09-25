// Login.js
import React, { useState } from 'react';
import { Link, useNavigate } from "react-router-dom";
import store from './store';
import {setName} from './homereduser';
// import Fitnesslogo from './Fitnesslogo.png'; 
import './login.css'; 
import homereduser from './homereduser';
import logo2 from '../1.png'
// import SideNavBar from '../Dashboard/SideNavBar';


const Login = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const nav = useNavigate();

  const reTurn = () => {
    nav("/")
  }

  const handleLogin = () => {
  nav("/")
    console.log('Logging in with email:', email, 'and password:', password);
  };

  return (
    <div>
    <div className='ground'>
       <div className="container">  
       <img
          className="logo2"
          src={logo2} 
          alt=""
          srcset=""
          onClick={reTurn}              
        />
      <h2 className='mm'>Login</h2>     
      <form>
        <input className='mail'
          type="email"
          placeholder="Email"
          // value={email}
          onChange={(e) => {
            store.dispatch(setName(e.target.value))
          }}
        />
        <input
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <button type="button" onClick={handleLogin}>   
        Login 
          {/* <Link to="/dash" className='but' >Login</Link> */}
        </button>
        <h5>Don't have an account?<Link to="/signup">Sign up</Link></h5>
        
      </form>
    </div>
    </div>
    </div>
  );
};

export default Login;
