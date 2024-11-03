package models

data class ProfileStats(
    val averageRating: Double,
    val jobsCompleted: Int,
    val payRange: PayRange,
    val onGoing: Int,
    val availability: String,
    val service: String,
    val quality: String,
)
