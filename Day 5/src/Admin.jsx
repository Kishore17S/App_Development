import React from 'react'
import './Admin.css';
import Fitnesslogo from './Fitnesslogo.png';
import { useSelector } from 'react-redux';

function Admin() {
  const user=useSelector(state=> state.user.value)
  // <div className='admin_dash'></div>
  return (
    <div>
    <div className='admin_header'>
        <img  className="logo_admin" src={Fitnesslogo} alt="Fitnesslogo"/>
        <div className='admin_start'>
          <div className='admin_dashboard'>DashBoard</div>
        </div>
        <input text="search" placeholder='Search' className='admin_search'></input>
        <button className='search'>SEARCH</button>
        
       
        <div className='home_admin' >HOME</div>
        <div className='profile_admin'>PROFILE</div>
        <div className='logout_admin'>LOGOUT</div>
    </div>
    <div>
    <div className='admin_display'>Hiii {user.name}  </div>
    <div className='admin_displays'>Your dashboard is here</div>
    </div>
    <div className='footer_app'>
      <div className='privacy_content'>Privacy Policy</div>
      <div className='term_content'>Terms & Conditions</div>
      <div className='help_content'>Help</div>
    </div>
    </div>
  )
}

export default Admin;
