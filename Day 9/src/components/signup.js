// SignUp.js
import React, { useState } from 'react';
import './signup.css';
import {useNavigate} from 'react-router-dom';



const SignUp = () => {
  const [firstName, setFirstName] = useState('');
  const [lastName, setLastName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

 const nav = useNavigate();




  const handleSignUp = () => {
    
    console.log('Signing up with the following information:');
    console.log('First Name:', firstName);
    console.log('Last Name:', lastName);
    console.log('Email:', email);
    console.log('Password:', password);

    nav("/login");

 

  };

  return (
    <div className='ground'>
    <div className='container'>
      <h2 className='cl'>Sign Up</h2>
      <form>
        <input
          type="text"
          placeholder="First Name"
          value={firstName}
          onChange={(e) => setFirstName(e.target.value)}
        />
        <input
          type="text"
          placeholder="Last Name"
          value={lastName}
          onChange={(e) => setLastName(e.target.value)}
        />
        <input 
        className='id'
          type="email"
          placeholder="Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />
        <input
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <button type="button" onClick={handleSignUp}>
          Sign Up
        </button>
      </form>
    </div>
    </div>
  );
};

export default SignUp;
