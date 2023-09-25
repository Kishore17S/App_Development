import { createSlice } from "@reduxjs/toolkit";

const Slice=createSlice({
    name:"name",
    initialState:{name:"Default"},
    reducers:{
        setName(state,action){
            state.name=action.payload;
        }
    }

})
export const {setName}  = Slice.actions;
export default Slice.reducer;