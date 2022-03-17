package dev.lucas.hrworker.repositories

import dev.lucas.hrworker.entities.Worker
import org.springframework.data.jpa.repository.JpaRepository

interface WorkerRepository : JpaRepository<Worker, Long>