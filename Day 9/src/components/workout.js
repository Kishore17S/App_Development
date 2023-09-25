import React from 'react'
import './workout.css';
import fimage1 from './1.svg';
import fimage2 from './2.svg';
// import fimage3 from './3.svg';
// import fimage4 from './4.svg';
// import workoutbox from './workoutbox';
function workout() {
  return (
    <div>
    <div id='features'>
    <h1 style={{color:'white',marginTop:"-100px",textAlign:"center",display:"inline-block"}}>WORKOUTS</h1>
    <li>
    <div className="image1_container">
    <img className="image1_workout" src={fimage1} alt='1'></img>
    <div className="image1_workout1" >WeightLifting</div>
    </div></li>
    <li>
    <div className="image1_container">
    <img className="image1_workout" src={fimage2} alt='2'></img>
    <div className="image1_workout1" >Specific Muscle</div>
    </div></li>

    {/*<div className='new_a-container'>
       } <workoutbox image={fimage1} tittle="WeightLifting" />
        <workoutbox image={fimage2} tittle="Specific Muscle" />
        <workoutbox image={fimage3} tittle="Flex Your Muscle" />
        <workoutbox image={fimage4} tittle="Cardio Exercise" />
      </div>*/}
      </div>
    </div>
  )
}

export default workout