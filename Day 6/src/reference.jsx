// import React from 'react';
import React, { useState } from 'react';
// import React from 'react'

function reference() {
  
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [showvalues, setShowValues] = useState(false);

    const handleEmailChange = (event) =>{
        setEmail(event.target.value);
    };
    
    const handlePasswordChange = (event) =>{
        setPassword(event.target.value);
    };
    
    const handlePrintValues = (event) =>{
        setShowValues(true);
    };
    return(
        
            <div>
                <div>LOGIN PAGE</div>   
                <div>
                    <label>Email Id : </label>
                    <input type="text" placeholder="email" name="email" value={email} onChange={handleEmailChange}></input>
                </div>
                <div>
                    <label>Password : </label>
                    <input type="text" placeholder="password" name="password" value={password} onChange={handlePasswordChange}></input>  
                </div>
                <div>
                    <button type="submit" onClick={handlePrintValues}>Login</button>
                </div>
                {showvalues && (
                <div><p>Hiiii... {email}</p>
                <p>Your password is {password}</p>
                </div>
            )}
            </div>
        
    );
  
}

export default reference




