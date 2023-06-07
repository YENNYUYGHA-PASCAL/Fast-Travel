 package com.yennyuyghapascal.fasttravel

 class TravelAppSearch : TravelSearch {
        override fun searchFlights(from: String, to: String, date: String) {
            // code to search for flight tickets
        }

        override fun searchRail(from: String, to: String, date: String) {
            // code to search for rail tickets
        }

        override fun searchBus(from: String, to: String, date: String) {
            // code to search for bus tickets
        }

        override fun searchShip(from: String, to: String, date: String) {
            // code to search for ship tickets
        }
    }

    // Example usage to test the search module
    val searchModule = TravelAppSearch()
    searchModule.searchFlights("Paris", "London", "2023-01-01")
    searchModule.searchRail("Berlin", "Munich", "2023-01-01")
    searchModule.searchBus("New York", "Boston", "2023-01-01")
    searchModule.searchShip("Tokyo", "Hawaii", "2023-01-01")
}
}