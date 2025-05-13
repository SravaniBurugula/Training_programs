
import './App.css'
import ExpenseComponent from './components/ExpenseComponent';

interface GreetingsProp{
  name: String;
  city: String;
}

function Greeting({name,city}:GreetingsProp){

  return(
    <>
    <h2>Hello {name} from {city}</h2>
    </>
  )
}

interface ActionButtonProps{
  title: string;
  disabled: boolean;
}

function handleClick(){
  alert('Button Clicked');
}



function ActionButton({title, disabled}:ActionButtonProps){
  return(
    <>
       <button disabled={disabled} onClick={handleClick}>{title}</button>
    </>
  )
}

function App() {
  

  return (
    <>
      <Greeting name="IBMer" city="banglore"/>
      <ExpenseComponent/>
      <ActionButton title="This is a button" disabled={false}/>
    </>
  );
}

export default App
