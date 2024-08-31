import {HeaderClient} from './components/header/client/Header'

import {HeaderDashboard} from './components/dashboard/header.jsx'
import {BodyDashboard} from './components/dashboard/body.jsx'
import  './index.css'
function App() {
  return (
    <div className="main">
        <HeaderDashboard/>
        <BodyDashboard/>
    </div>
  );
}

export default App;
