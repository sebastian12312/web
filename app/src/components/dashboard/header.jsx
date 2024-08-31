import React from "react";
import { useState, useEffect } from "react";
import $ from 'jquery'
import { FcMenu } from "react-icons/fc";
import { FcAbout } from "react-icons/fc";
import { FcFeedback } from "react-icons/fc";
import { FcSettings } from "react-icons/fc";
import { FiChevronRight } from "react-icons/fi";
import { MenuLateralDashboard } from './menu_lateral'
export function HeaderDashboard() {
    const [btnBarra, setBarra] = useState(false)
    const btnBarraLateral = () => {

        var buttom = document.getElementById("checked_buttom_lateral")

        if (buttom.checked) {
            console.log("hola")
            localStorage.setItem('estadoBarra', true)
        } else {
            console.log("adios")
            localStorage.setItem('estadoBarra', false)
        }
    }

    return (
        <>
            <header className="fixed top-0 border shadow-sm px-4 py-6 fixed w-screen bg-white">
                <div className="flex justify-between">
                    <div className="flex gap-2 mt-auto mb-auto">

                        <a className="flex items-center justify-center relative p-2 border rounded shadow-sm">
                            <FcMenu className="w-6 h-6" />
                            <input
                                id="checked_buttom_lateral"
                                type="checkbox"
                                className="absolute inset-0 opacity-0 cursor-pointer"
                                onClick={btnBarraLateral}
                            />
                        </a>


                        <a href="#" className=" mt-auto mb-auto text-2xl text-gray-600">TituloDashboard</a>
                    </div>

                    <div className="flex gap-2 mt-auto mb-auto">
                        <a href="#" className="border rounded shadow-sm  p-2 mt-auto mb-auto  "><FcFeedback size={26} /></a>
                        <a href="#" className="border rounded shadow-sm  p-2 mt-auto mb-auto "><FcAbout size={26} /></a>
                        <a href="#" className="border rounded shadow-sm  p-2 mt-auto mb-auto "><FcSettings size={26} /></a>
                        <a href="#" className="border rounded shadow-sm  p-2 mt-auto mb-auto ">Sebastian Barrientos </a>
                    </div>
                </div>
            </header>

        </>
    )

}


// 