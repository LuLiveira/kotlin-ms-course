package dev.lucas.hrworker.repositories

import dev.lucas.hrworker.entities.Worker
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WorkerRepository : JpaRepository<Worker, Long>