import React, { useState } from 'react';
// import Link from 'react-router-dom/cjs/react-router-dom.min';
import './Login.css';


function Login() {

    const [activeTab, setActiveTab] = useState('login');
  
    const handleTabClick = (tab) => {
      setActiveTab(tab);
    };


  return (
    
    <main id="mainpage">
    <div className="MainPage">
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
              <input type="email" id="email" className="kishore_inputs" required /><br />
              <label htmlFor="password" className="kishore_label">Password : </label><br />
              <input type="password" id="password" className="kishore_inputs" required /><br />
    
              <button className="kishore_tabs_btn">Log in</button>
            </form>
          </div>
          <div className={activeTab === 'signup' ? 'tab active' : 'tab'} id="signup_div">
            <form>
              <label htmlFor="name" className="kishore_label">Name:</label><br />
              <input type="text" id="name" className="kishore_inputs" required /><br />
              <label htmlFor="email" className="kishore_label">EmailID:</label><br />
              <input type="email" id="email" className="kishore_inputs" required /><br />
              <label htmlFor="password" className="kishore_label">Password:</label><br />
              <input type="password" id="password" className="kishore_inputs" required /><br />
              <button className="kishore_tabs_btn">Sign up</button>
            </form>
          </div>
        </div>
        </div>
      </main>

  )
}

export default Login
