import React from "react";
import { useState, useEffect } from "react";
import $ from 'jquery'
import { FcMenu } from "react-icons/fc";
import { FcAbout } from "react-icons/fc";
import { FcFeedback } from "react-icons/fc";
import { FcSettings } from "react-icons/fc";
import { FiChevronRight } from "react-icons/fi";
import { CiGrid41 } from "react-icons/ci";
export const MenuLateralDashboard = () => {

    return (
<nav className=" mt-8 w-auto">
    <a href="#" className="flex border shadow-sm rounded p-2 mb-4 justify-between">
        <CiGrid41  className="mt-auto mb-auto mr-1"/>
        <p className="flex justify-between mt-auto mb-auto w-full">
            Menu
        </p>
        <FiChevronRight className="mt-auto mb-auto" />
    </a>
    <a href="#" className="flex border shadow-sm rounded p-2 mb-4 justify-between">
        <CiGrid41  className="mt-auto mb-auto mr-1"/>
        <p className="flex justify-between mt-auto mb-auto w-full">
            Menu
        </p>
        <FiChevronRight className="mt-auto mb-auto" />
    </a>
    <a href="#" className="flex border shadow-sm rounded p-2 mb-4 justify-between">
        <CiGrid41  className="mt-auto mb-auto mr-1"/>
        <p className="flex justify-between mt-auto mb-auto w-full">
            Menu
        </p>
        <FiChevronRight className="mt-auto mb-auto" />
    </a>
    <a href="#" className="flex border shadow-sm rounded p-2 mb-4 justify-between">
        <CiGrid41  className="mt-auto mb-auto mr-1"/>
        <p className="flex justify-between mt-auto mb-auto w-full">
            Menu
        </p>
        <FiChevronRight className="mt-auto mb-auto" />
    </a>
</nav>

    )
}