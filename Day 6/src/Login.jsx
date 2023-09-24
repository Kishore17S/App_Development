import React, { useState } from 'react';
// import Link from 'react-router-dom/cjs/react-router-dom.min';
import './Login.css';
import Fitnesslogo from './Fitnesslogo.png';
import { useDispatch } from 'react-redux';
import { useNavigate } from 'react-router-dom';
import { signup } from './features/user';



function Login() {
  const [name, setname] = useState("");
  const [email, setemail] = useState("");
  const [password, setpassword] = useState("");
    const [activeTab, setActiveTab] = useState('login');
  
    const handleTabClick = (tab) => {
      setActiveTab(tab);
    };

let dispatch=useDispatch();
let navigate=useNavigate();


const handleSignup =(e) =>{
  e.preventDefault();
  if(email.trim() && name.trim() && password.trim())
  {
    dispatch(signup({name:name, email: email, password: password}));
    navigate('/admin');
  }
}
const handleLogin =(e) =>{
  e.preventDefault();
  if(email.trim() && password.trim())
  {
    dispatch(signup({name:name, email: email, password: password}));
    navigate('/admin');
  }
}
const details ={name, email,password};
  return (
    
    <div>
    <main id="mainpage">
    <div className="MainPage">
    <img  className="logo_login" src={Fitnesslogo} alt="Fitnesslogo"/>
        <h1 className="login_header">FIT ZONE</h1>
        <div className="kishore_tabs_container">
          <button
            className={activeTab === 'login' ? 'kishore_btn active' : 'kishore_btn'}
            id="kishore_flex-item-1"
            onClick={() => handleTabClick('login')}
          >
            Login
          </button>
          <button
            className={activeTab === 'signup' ? 'kishore_btn active' : 'kishore_btn'}
            id="kishore_flex-item-2"
            onClick={() => handleTabClick('signup')}
          >
            Sign up
          </button>
        </div>
        <div className="kishore_page_tabs">
          <div className={activeTab === 'login' ? 'tab active' : 'tab'} id="login_div">
            <form>
              <label htmlFor="email" className="kishore_label">EmailID : </label><br />
              <input type="email" onChange={(e)=>setemail(e.target.value)}  className="kishore_inputs" required /><br />
              <label htmlFor="password" className="kishore_label">Password : </label><br />
              <input type="password" onChange={(e)=>setpassword(e.target.value)}  className="kishore_inputs" required /><br />
    
              <button onClick={handleLogin} className="kishore_tabs_btn">Log in</button>
            </form>
          </div>
          <div className={activeTab === 'signup' ? 'tab active' : 'tab'} id="signup_div">
            <form onSubmit={handleSignup}>
              <label htmlFor="name" className="kishore_label">Name:</label><br />
              <input type="text"  onChange={(e)=>setname(e.target.value)}className="kishore_inputs" required /><br />
              <label htmlFor="email" className="kishore_label">EmailID:</label><br />
              <input type="email" onChange={(e)=>setemail(e.target.value)} className="kishore_inputs" required /><br />
              <label htmlFor="password" className="kishore_label">Password:</label><br />
              <input type="password" onChange={(e)=>setpassword(e.target.value)} className="kishore_inputs" required /><br />
              <button className="kishore_tabs_btn" type='submit'>Sign up</button>
            </form>
          </div>
        </div>
        </div>
      </main>
      </div>
      
  )
}

export default Login
