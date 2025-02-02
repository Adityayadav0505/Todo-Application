import {useState} from 'react'
import { useNavigate } from 'react-router-dom'
import { useAuth } from './security/AuthContext'

function LoginComponent(){

    const [username, setUsername]= useState('user')

    const [password, setPassword]= useState('')

    const [showerrorMessage, setShowerrorMessage]= useState(false)

    const navigate = useNavigate()

    const authContext = useAuth()

    function handleUsernameChange(event){
        setUsername(event.target.value)
    }

    function handlePasswordChange(event){
        setPassword(event.target.value)
    }

    async function handleSubmit(){
        if(await authContext.login(username, password)){
            navigate(`/welcome/${username}`)
        }
        else{
            setShowerrorMessage(true)
        }
    }

    return(
        <div className="Login">
            <h1>Time to Login!</h1>
            {showerrorMessage && <div className="errorMessage">Authenticated Failed. Please check your credentials.</div>}
            <div className="LoginForm">
                <div>
                    <label>User Name : </label>
                    <input type="test" name="username" value={username} onChange={handleUsernameChange}/>
                </div>
                <div>
                    <label>Password : </label>
                    <input type="Password" name="Password" value={password} onChange={handlePasswordChange}/>
                </div>
                <div>
                    <button type="button" name="login" onClick={handleSubmit}>Login</button>
                </div>
            </div>
        </div>
    )
}

export default LoginComponent