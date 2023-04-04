package com.theghanaapi.Controllers

import com.theghanaapi.models.Presidents
import com.theghanaapi.Services.PresidentsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/v1/api")
class PresidentsController {
    var presService = PresidentsService()

    @GetMapping("/presidents")
    fun getPresidents(): List<Presidents> {
        return presService.getPresidents()
    }

}