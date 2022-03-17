package entities

data class Payment(
    val name: String,
    val dailyIncome: Double,
    val days: Int
) {
    fun getTotal(): Double {
        return this.days * this.dailyIncome;
    }
}