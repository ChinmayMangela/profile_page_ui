package ui
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import data.jobs
import models.Job
import models.PersonInfo
import models.ProfileStats


@Composable
fun ProfilePage(
) {
    val personInfo = PersonInfo(
        name = "Tobi Lateef",
        profession = "Contractor",
        contact = "+92 9876543210",
        location = "Logos",
        position = "Open",
        jobsDone = jobs
    )

    val profileStats = ProfileStats(
        averageRating = 4.3,
        jobsCompleted = 32,
        payRange = "150K - 200K",
        onGoing = 2,
        availability = "Excellent",
        service = "Good",
        quality = "Good"
    )

   Column {
       UserProfileHeaderComponent(personInfo)
       JobSection()
       ProfileStatsComponent(profileStats)
   }
}