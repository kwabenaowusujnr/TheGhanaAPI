package com.theghanaapi.Services

import com.theghanaapi.models.Regions

class RegionsServices {
    //var regionList = mutableListOf<Regions>()
    var regionList = listOf(
            Regions("Ashanti Region","Kumasi"),
            Regions("Brong-Ahafo Region","Sunyani"),
            Regions("Central Region","Cape Coast"),
            Regions("Eastern Region","Koforidua"),
            Regions("Greater Accra Region","Accra"),
            Regions("Northern Region","Tamale"),
            Regions("Upper East Region","Bolgatanga"),
            Regions("Upper West Region","Wa"),
            Regions("Volta Region","Ho"),
            Regions("Western Region","Sekondi-Takoradi"),
            Regions("Ahafo Region","Goaso"),
            Regions("Bono Region","Sunyani"),
            Regions("Bono East Region","Techiman"),
            Regions("North East Region","Nalerigu"),
            Regions("Oti Region","Dambai"),
            Regions("Savannah Region","Damongo"),
    )

    fun GetRegionsCapitalList(): List<Regions> {
        return regionList
    }
}