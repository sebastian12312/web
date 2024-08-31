import { MenuLateralDashboard } from './menu_lateral'
import $ from 'jquery'
export const BodyDashboard = () => {

    if(localStorage.getItem("estadoBarra") == true){
        $('#barra_lateral').removeClass("w-[250px]")
        $('#barra_lateral').addClass("w-[50px]")
    }
    return (

        <div className="body flex mt-20">
            <div className="barra_lateral w-[250px] border h-screen shadow-sm  p-2 ">
                <MenuLateralDashboard></MenuLateralDashboard>
            </div>
            <div className="w-screen  bg-blue-600 m-2 ">
                <h1>hola</h1>
            </div>
        </div>
    )
}