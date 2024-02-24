import * as React from 'react';
import Login from "./Login.jsx"
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import CssBaseline from '@mui/material/CssBaseline';
import Divider from '@mui/material/Divider';
import Drawer from '@mui/material/Drawer';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import myImage from './Logo.jpeg'
import Template from "../components/Template/Template"
import { BrowserRouter, Routes, Route, Navigate, useNavigate } from 'react-router-dom';
import AddQuestions from './Template/AddQuestions';
import FormItem from './Form/FormItem';
import "./Sidebar.css"
import ExamForm from './Student/ExamForm.jsx';
import AllForm from './Form/AllForm.jsx';
const drawerWidth = 240;

function Sidebar(props) {
  const { window } = props;
  const [mobileOpen, setMobileOpen] = React.useState(false);
  const navigate = useNavigate()

  const handleDrawerToggle = () => {
    setMobileOpen(!mobileOpen);
  };

  const user = localStorage.getItem('loggedInUsername')
  const drawer = (
    <div>
      <div className='logo' onClick={() => (<Navigate to="/"></Navigate>)}>
        <img src={myImage} alt="Website Logo" className='logo-img' />
      </div>
      <Toolbar />
      <div className='list'>
        <a href="/form">Forms</a>
        <a href='/template'>Templates</a>
        <a href='/allForms'>Show Forms</a>
      </div>
      <Divider />
    </div>
  );

  // Remove this const when copying and pasting into your project.
  const container = window !== undefined ? () => window().document.body : undefined;
  React.useEffect(() => {
    if (!user) {
      navigate('/login')
    }
  }, [])
  return (
    <Box sx={{ display: 'flex' }}>
      <CssBaseline />
      <AppBar
        position="fixed"
        sx={{
          width: { sm: `calc(100% - ${drawerWidth}px)` },
          ml: { sm: `${drawerWidth}px` },
        }}
      >
        <Toolbar>
          <IconButton
            color="inherit"
            aria-label="open drawer"
            edge="start"
            onClick={handleDrawerToggle}
            sx={{ mr: 2, display: { sm: 'none' } }}
          >
            <MenuIcon />
          </IconButton>
          <Typography className='nav' variant="h6" noWrap component="div">
            <div className='username'>
              <span>Welcome:</span>
              <span>{user}</span>
            </div>
            <button onClick={() => {
              localStorage.removeItem("loggedInUser")
              localStorage.removeItem("loggedInUsername")
            }} className='btn'>Logout</button>
          </Typography>
        </Toolbar>
      </AppBar>
      <Box
        component="nav"
        sx={{ width: { sm: drawerWidth }, flexShrink: { sm: 0 } }}
        aria-label="mailbox folders"
      >
        {/* The implementation can be swapped with js to avoid SEO duplication of links. */}
        <Drawer
          container={container}
          variant="temporary"
          open={mobileOpen}
          onClose={handleDrawerToggle}
          ModalProps={{
            keepMounted: true, // Better open performance on mobile.
          }}
          sx={{
            display: { xs: 'block', sm: 'none' },
            '& .MuiDrawer-paper': { boxSizing: 'border-box', width: drawerWidth },
          }}
        >
          {drawer}
        </Drawer>
        <Drawer
          variant="permanent"
          sx={{
            display: { xs: 'none', sm: 'block' },
            '& .MuiDrawer-paper': { boxSizing: 'border-box', width: drawerWidth },
          }}
          open
        >
          {drawer}
        </Drawer>
      </Box>
      <Box
        component="main"
        sx={{ flexGrow: 1, p: 3, width: { sm: `calc(100% - ${drawerWidth}px)` } }}
      >
        <Toolbar />
        {/* <Template /> */}
      </Box>
    </Box>
  );
}


export default Sidebar;