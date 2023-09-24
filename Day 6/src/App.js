// import { Route } from 'react-router-dom';
import Admin from './Admin';
import './App.css';
import Login from './Login';
// import Home from './home';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import FooterComponent from './footercomponent';


function App() {
  return (
  <BrowserRouter>
     <Routes>
  <Route path="/" element={<Login />}></Route>
  <Route path="/admin" element={<Admin />}></Route>
  </Routes>
  </BrowserRouter>
  );
}

export default App;
// <div className='footer_app'>
//     <div className='footer_content'><FooterComponent  /></div>
// </div>
