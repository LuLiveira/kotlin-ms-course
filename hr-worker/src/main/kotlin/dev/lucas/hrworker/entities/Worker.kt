package dev.lucas.hrworker.entities

import javax.persistence.*
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "tb_worker")
data class Worker (
    @Id @GeneratedValue(strategy = IDENTITY) val id: Long,
    val name: String,
    val dailyIncome: Double
)