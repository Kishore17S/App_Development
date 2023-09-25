import React from 'react';
import './contact.css';
import { Link } from 'react-router-dom';
function Contact() {
  return (
      <div className='kkk_background'>
      <Link style={{textDecoration:'none',color:'white'}} to="/"><button type='submit' className='back_contact'>Back</button></Link>
      <div id='contact'>
       <h1 className='us_contact'>CONTACT US</h1>
       <form>
       <input type='text' placeholder='Full Name' requied/>
       <input type='email' placeholder='Type Your E-mail' required/>
       <textarea placeholder='Write here.....' name='message'></textarea>
       <input type='submit' value='Send' />
       </form>
      </div>
    </div>
  )
}

export default Contact;
