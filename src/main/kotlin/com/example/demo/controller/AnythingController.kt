package com.example.demo.controller

import com.example.demo.entity.AnythingEntity
import com.example.demo.service.AnythingService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("anything")
class AnythingController(
        val anythingService: AnythingService
) {

    @GetMapping("/findAll")
    fun findAll(): List<AnythingEntity> {
        return this.anythingService.findAll()
    }

    @GetMapping("/insert")
    fun insert(@RequestParam(value = "name", required = false, defaultValue = "doma") name: String): String {

        val entity = AnythingEntity()
        entity.name = name
        this.anythingService.insert(entity)

        return "success"
    }
}