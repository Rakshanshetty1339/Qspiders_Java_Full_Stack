import React from "react"
import "./App.css"

const App=()=>{
  let names=["Rakshan","Shetty","K"]
  return (
    <ol>
    {names.map((item)=><li>{item}</li>)}
    </ol>
  )

}

export default App

