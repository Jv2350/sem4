import React,{useState} from "react";
import './Login.css'

function Login() {
  const [isSignIn, setIsSignIn] = useState(true);

  const handleSwitchForm = () => {
    setIsSignIn((prevIsSignIn) => !prevIsSignIn);
  };

  return (
    <div
      className={`wrapper ${isSignIn ? "animated-signin" : "animated-signup"}`}
    >
      <div className={`form-container ${isSignIn ? "sign-in" : "sign-up"}`}>
        <form action="#">
          <h2>{isSignIn ? "Login" : "Sign Up"}</h2>
          <div className="form-group">
            <input type="text" required />
            <i className="fas fa-user"></i>
            <label htmlFor="">Username</label>
          </div>
          {isSignIn || (
            <div className="form-group">
              <input type="email" required />
              <i className="fas fa-at"></i>
              <label htmlFor="">Email</label>
            </div>
          )}
          <div className="form-group">
            <input type="password" required />
            <i className="fas fa-lock"></i>
            <label htmlFor="">Password</label>
          </div>
          {!isSignIn && (
            <div className="form-group">
              <input type="password" required />
              <i className="fas fa-lock"></i>
              <label htmlFor="">Confirm Password</label>
            </div>
          )}
          {isSignIn ? (
            <button type="submit" className="btn">
              Login
            </button>
          ) : (
            <button type="submit" className="btn">
              Sign Up
            </button>
          )}
          <div className="link">
            <p>
              {isSignIn ? "Don't have an account?" : "Already have an account?"}
              <button
                type="button"
                className="switch-link"
                onClick={handleSwitchForm}
              >
                {isSignIn ? " Sign Up" : " Sign In"}
              </button>
            </p>
          </div>
        </form>
      </div>
    </div>
  );
}

export default Login;
