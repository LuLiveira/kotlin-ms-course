package dev.lucas.hrworker.controllers

import dev.lucas.hrworker.entities.Worker
import dev.lucas.hrworker.repositories.WorkerRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/workers")
class WorkerController(val repository: WorkerRepository) {

    @GetMapping
    fun findAll (): ResponseEntity<List<Worker>> {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    fun findById (@PathVariable id: Long): ResponseEntity<Worker> {
        return ResponseEntity.ok(repository.getById(id));
    }
}