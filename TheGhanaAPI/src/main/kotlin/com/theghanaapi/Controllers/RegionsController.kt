package com.theghanaapi.Controllers

import com.theghanaapi.Services.RegionsServices
import com.theghanaapi.models.Regions
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api")
class RegionsController() {
    var regService = RegionsServices()

    @GetMapping("/regions")
    fun getRegion(): List<Regions> {
        return regService.GetRegionsCapitalList()
    }
}

