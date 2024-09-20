import React, { useEffect } from "react"
import { useState } from "react"
import ClipLoader from "react-spinners/ClipLoader";
export const LoginUsuario = () => {

    const [id_usuario, setId_usuario] = useState('')
    const [password, setPassword] = useState('')
    const [respuestaLogin, setRespuestaLogin] = useState(false)
    const [activateButton, setActivateButtom] = useState(false)
    var loginUsuario = {
        numero_documento: id_usuario,
        password: password
    }
    const functionIniciarSesion = (e) => {
        e.preventDefault();
        setActivateButtom(true)
        login(loginUsuario)
    }
    useEffect(() => {
        // Desactivar el botón si la respuesta es `true` o `false`
        if (respuestaLogin !== null) { // Asegurarse de que la respuesta no sea null
            setActivateButtom(false);
        }
    }, [respuestaLogin]);
    

    async function login(loginUsuario) {
        try {
            const consultaFetch = await fetch('http://localhost:8081/api/auth/login', { // Añadido http://
                method: "POST",
                headers: {
                    "Content-Type": "application/json" // Se añade el header
                },
                body: JSON.stringify(loginUsuario) // Convertimos el objeto a JSON
            });

            if (!consultaFetch.ok) {
                // Manejo de errores del lado del servidor
                const errorResponse = await consultaFetch.json();
                //  console.error("Server error:", errorResponse);
                setRespuestaLogin(false);
                return;
            } else {
                const respuesta = await consultaFetch.json();
                console.log("Respuesta:", respuesta);
                setRespuestaLogin(true);
            }


        } catch (error) {
            setRespuestaLogin(false);
            console.log("error")
        }
    }


    return (
        <>
            <div className="flex items-center justify-center min-h-screen">
                <div>
                    <form className="w-[500px] border rounded shadow-sm p-4">
                        <div>
                            <label for className="block font-bold">Usuario:
                            </label>
                            <input id="usuario_login" type="text" className="border px-4 py-2 rounded outline-none w-full"
                                name="numero_documento"
                                onChange={e => setId_usuario(e.target.value)}
                            ></input>
                        </div>
                        <div className="mt-4">
                            <label for className="block font-bold">Contraseña:
                            </label>
                            <input id="password_login" type="password" className="border px-4 py-2 rounded outline-none w-full"
                                onChange={e => setPassword(e.target.value)}
                            ></input>
                        </div>
                        <div className="mt-4 p-8 text-center">
                            {activateButton == false ? (
                                <button onClick={functionIniciarSesion} id="buttom_iniciar_sesion" className="bg-sky-600 text-white  py-4 px-8  rounded  cursor-pointer">Iniciar sesión</button>
                            ) : (
                                <a id="buttom_iniciar_sesion" className="bg-sky-600 text-white  py-4 px-8  rounded  cursor-pointer mt-auto mb-auto">
                                    <span className="mt-auto mb-auto">Cargando ... <ClipLoader className="" size={20} color="white"/> </span> </a>

                            )
                            }

                        </div>
                    </form>
                </div>
            </div>
        </>
    )
}