import { FiX } from "react-icons/fi";
import $ from 'jquery'
import { useEffect, useState } from "react";
import * as React from 'react';
import CircularProgress from '@mui/material/CircularProgress';
import Box from '@mui/material/Box';
export const LoginCliente = ({ abrir, onClose }) => {
    useEffect(() => {
        if (abrir) {
            $('#ventanaLogin').removeClass('hidden');
        } else {
            $('#ventanaLogin').addClass('hidden');
        }
    }, [abrir]);

    const CerrarVentanaLogin = () => {
        $('#ventanaLogin').addClass('hidden');
        if (onClose) onClose(); // Notifica al componente padre que se ha cerrado el login
    };

    const [usuarioVal, setUsuario] = useState('')
    const [passwordVal, setPasswordVal] = useState('')


    const funcUsuarioValue = (e) => {
        setUsuario(e.target.value)
    }
    const funcPasswordValue = (e) => {
        setPasswordVal(e.target.value)
    }

    const [estadoButtom, setEstadoButtom] = useState(false)
    const IniciarSesion = (event) => {
        console.log("USUARIO: " + usuarioVal + "   PASSWORD: " + passwordVal)
        event.preventDefault();
        setEstadoButtom(true)
        setTimeout(() => {
            setEstadoButtom(false)

        }, 3000);
    }

    return (
        <div id="ventanaLogin" className="fixed inset-0 w-screen h-screen bg-[rgba(243,243,243,0.226)] flex items-center justify-center hidden">
            <div className="w-[500px] border rounded shadow px-4 py-4 bg-white">
                <a onClick={CerrarVentanaLogin} className="float-right text-2xl border rounded p-2 shadow"><FiX color="gray" /></a>
                <h1 className="text-center text-3xl mb-4 mt-14">Proyecto Web</h1>
                <form action=""  >
                    <div className="mb-4">
                        <label htmlFor="" className="block">Usuario o Email*: </label>
                        <input type="text" className="border shadow rounded outline-none w-full py-2 px-2" value={usuarioVal} onChange={funcUsuarioValue} />
                    </div>
                    <div className="mb-4">
                        <label htmlFor="" className="block">Password*:</label>
                        <input type="password" className="border shadow rounded outline-none w-full py-2 px-2" value={passwordVal} onChange={funcPasswordValue} />
                    </div>
                    <div className="text-sm px-2 mt-2">
                        <a href="#" >Olvidates tu Contrasena? recupera Aqui....</a>
                        <a href="#" className="flex gap-2">No tienes cuenta? <p>registrate Aqui! ...</p></a>
                    </div>
                    <div className="text-center mt-4 flex justify-center">
                        {estadoButtom === false ? (
                            <button className="shadow bg-sky-600 text-white px-2 py-2 rounded cursor-pointer flex gap-2" onClick={IniciarSesion}> <p className="mt-auto mb-auto">iniciar sesion </p></button>
                        ) : (
                            <a className="shadow bg-sky-600 text-white px-2 py-2 rounded cursor-not-allowed flex gap-2 opacity-50"> <p className="mt-auto mb-auto">iniciar sesion </p> <CircularProgress color="inherit" size={24} /></a>
                        )
                        }
                    </div>
                </form>
            </div>
        </div>
    )
}

export const RegistrarCliente = ({ abrirRegistrar, onCloseRegistrar }) => {
    useEffect(() => {
        if (abrirRegistrar) {
            $('#ventanaRegister').removeClass('hidden');
        } else {
            $('#ventanaRegister').addClass('hidden');
        }
    }, [abrirRegistrar]);

    const CerrarVentanaRegister = () => {
        $('#ventanaLogin').addClass('hidden');
        if (onCloseRegistrar) onCloseRegistrar(); // Notifica al componente padre que se ha cerrado el login
    };

    return (
        <div id="ventanaRegister" className="fixed inset-0 w-screen h-screen bg-[rgba(243,243,243,0.226)] flex items-center justify-center hidden">
            <div className="w-[600px] border rounded shadow px-4 py-4 bg-white">
                <a onClick={CerrarVentanaRegister} className="float-right text-2xl border rounded p-2 shadow"><FiX color="gray" /></a>

                <form action="" className="mt-16">

                    <div className="flex gap-4 mb-2">
                        <div className="w-full">
                            <label htmlFor="" className="block">Documento*: </label>
                            <select type="text" className="border shadow rounded outline-none w-full py-2 px-2" >
                                <option value="">DNI</option>
                            </select>
                        </div>
                        <div className="w-full">
                            <label htmlFor="" className="block">Numero Documento*: </label>
                            <input type="text" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>
                    </div>

                    <div className="flex gap-4 mb-2">
                        <div className="w-full">
                            <label htmlFor="" className="block">NickName*: </label>
                            <input type="text" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>
                        <div className="w-full">
                            <label htmlFor="" className="block">Nombre*: </label>
                            <input type="text" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>
                    </div>

                    <div className="flex gap-4 mb-2">
                        <div className="w-full">
                            <label htmlFor="" className="block">Primer Apellido*: </label>
                            <input type="text" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>
                        <div className="w-full">
                            <label htmlFor="" className="block">Segundo Apellido*: </label>
                            <input type="text" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>
                    </div>

                    <div className="flex gap-4 mb-2">
                        <div className="w-full">
                            <label htmlFor="" className="block">Correo*: </label>
                            <input type="text" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>

                    </div>
                    <div className="flex gap-4 mb-2">
                        <div className="w-full">
                            <label htmlFor="" className="block">Password*: </label>
                            <input type="password" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>
                        <div className="w-full">
                            <label htmlFor="" className="block">Password*: </label>
                            <input type="password" className="border shadow rounded outline-none w-full py-2 px-2" />


                        </div>
                    </div>
                    <div className="flex gap-4 mb-2">
                        <div className="w-full">
                            <label htmlFor="" className="block">Fecha Nacimiento*: </label>
                            <input type="date" className="border shadow rounded outline-none w-full py-2 px-2" />
                        </div>
                        <div className="w-full">
                            <label htmlFor="" className="block">Genero*: </label>
                            <select type="text" className="border shadow rounded outline-none w-full py-2 px-2" >
                                <option>MASCULINO</option>
                            </select>
                        </div>
                    </div>

                    <div className="flex justify-center">
                        <button className="shadow bg-sky-600 text-white px-2 py-2 rounded cursor-pointer flex gap-2">registrar</button>
                    </div>

                </form>

            </div>
        </div>
    )
}