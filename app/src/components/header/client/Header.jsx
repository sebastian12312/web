import React from "react";
import { useState, useEffect } from "react";
import '../../../index.css';
import './Header.css'
import { FiMenu } from "react-icons/fi";
import { FiX } from "react-icons/fi";
import $ from 'jquery'
import {LoginCliente , RegistrarCliente} from './Login'


export const HeaderClient = () => {
    return (
        <>
            <header className="border-b  px-8 py-6 shadow-sm">
                <div className="flex  justify-between">
                    <div className="logo_icon my-auto text-3xl  text-gray-800">
                        <a href="#">ProyectoWeb</a>
                    </div>
                    <div className="menu_top  my-auto">
                        <MenuHeaderClient></MenuHeaderClient>
                    </div>
                </div>
            </header>
            <OptionMenuBar></OptionMenuBar>
        </>
    )
}

const MenuHeaderClient = () => {

    return (
        <div className="">
            <ul className="flex gap-4  text-gl">
                <li className="mb-auto mt-auto menu_option"><a href="">Menu</a></li>
                <li className="mb-auto mt-auto menu_option"><a href="">Productos</a></li>
                <li className="mb-auto mt-auto menu_option"><a href="">Nosotros</a></li>
                <li className="mb-auto mt-auto menu_option"><a href="">Contacto</a></li>
                <MenuAutenticacion className="menu_autenticacion"></MenuAutenticacion>
                <ButtomMenuBar></ButtomMenuBar>
            </ul>
        </div>
    )
}
const MenuAutenticacion = () => {
    const [estadoLogin, setEstadoLogin] = useState(false)
    const OpenLogin = () =>{
        setEstadoLogin(true)
    }
    const CloseLogin = () => {
        setEstadoLogin(false);
    };

    const [estadoRegistrar, setEstadoRegistrar] = useState(false)
    const  OpenRegister = () =>{
        setEstadoRegistrar(true)
        console.log(estadoRegistrar)
    }

    const onCloseRegistrar = () =>{
        setEstadoRegistrar(false)
    }
    return (
        <>
            <li className="mb-auto mt-auto shadow-sm menu_autenticacion pointer" ><a onClick={OpenLogin} className="bg-sky-600 text-white px-4 py-4  rounded-[6px]  hover:bg-sky-800 pointer">iniciar sesion</a></li>
            <li className="mb-auto mt-auto shadow-sm  menu_autenticacion"><a  onClick={OpenRegister} className="bg-sky-600 text-white px-4 py-4  rounded-[6px]  hover:bg-sky-800">registrate</a></li>
            <LoginCliente  abrir={estadoLogin} onClose={CloseLogin}  />
            <RegistrarCliente  abrirRegistrar={estadoRegistrar}  onCloseRegistrar={onCloseRegistrar}/>
        </>
    )
}
const ButtomMenuBar = () => {
    const OpenModalMenu = () => {
        $('#menuBar_option').removeClass('hidden')
        $('#menuBar_option').removeClass('remove_bar_menu')
    }
    return (
        <>
            <li id="menu_bar" onClick={OpenModalMenu} className="mb-auto mt-auto border shadow-sm px-2 py-2 rounded pointer"><a className="text-2xl "><FiMenu color="gray" /></a></li>
        </>
    )
}
const OptionMenuBar = () => {
    const RemoveBarMenu = () =>{
        $('#menuBar_option').addClass('remove_bar_menu')
        const variable = $('#menuBar_option')
        if(variable.hasClass("remove_bar_menu")){
            variable.addClass('hidden')
        }
    }
    return (

        <div id="menuBar_option" className="menuBar_option w-[200px] h-screen hidden ">
            <a onClick={RemoveBarMenu} className="float-right mt-4 mr-4 text-2xl border p-2 rounded shadow-sm"><FiX color="gray"></FiX></a>
            <div className="mt-20 text-center  text-2xl">
                <a href="#" className="mb-4">Titulo Proyecto</a>
                <ul className="text-xl text-center mt-6 ">
                    <li className="mb-2"><a href="#">Menu</a></li>
                    <li className="mb-2"><a href="#">Contacto</a></li>
                    <li className="mb-2"><a href="#">Nosotros</a></li>
                    <li className="mb-2"><a href="#">Iniciar Sesion</a></li>
                    <li className="mb-2"><a href="#">Registrate</a></li>
                </ul>
            </div>
        </div>

    )
}