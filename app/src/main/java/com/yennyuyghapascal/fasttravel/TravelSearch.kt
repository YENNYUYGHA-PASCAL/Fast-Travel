package com.yennyuyghapascal.fasttravel

interface TravelSearch {
    fun searchFlights(from: String, to: String, date: String)
    fun searchRail(from: String, to: String, date: String)
    fun searchBus(from: String, to: String, date: String)
    fun searchShip(from: String, to: String, date: String)
}
