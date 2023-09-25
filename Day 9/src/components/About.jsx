import React from 'react'
// import aboutimage from './images/about.png';
import aboutimage from './about.png';
import './About.css';
import { Link } from 'react-router-dom';

function About() {
  return (
    <div className='kkkk_background'>
    <Link style={{textDecoration:'none',color:'red'}} to="/" className='ii_back'>Back</Link>

    <diV className='about_new'>
    <div id='about'>
    <div className='new_about-image'>
    <h1 className='new_about'>ABOUT</h1>
    <img src={aboutimage} alt=''/>
    </div>
    <div className='new_about-text'>
         <h1>LEARN ABOUT US</h1>
         <p>Welcome to our FIT ZONE family, where fitness meets community! We are more than just a gym; we are a place where individuals of all fitness levels come together to pursue their health and wellness goals.
         At FIT ZONE, we are committed to providing you with a safe and supportive environment to help you achieve your fitness aspirations. Whether your goal is to lose weight, build muscle, improve flexibility, or simply lead a healthier lifestyle, we are here to help you succeed.</p>
         <button>READ MORE</button>
         
      </div>
      </div>
      </diV>
    </div>
    )
}

export default About
