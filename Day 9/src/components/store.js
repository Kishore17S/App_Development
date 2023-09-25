import {configureStore} from "@reduxjs/toolkit";
import homereduser from "./homereduser";

export default  configureStore({
    reducer:{name:homereduser}
}) ;