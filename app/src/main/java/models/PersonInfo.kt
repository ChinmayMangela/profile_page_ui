package models

data class PersonInfo(
    val name: String,
    val profession: String,
    val contact: String,
    val location: String,
    val position: String,
    val jobsDone: List<Job>
)
