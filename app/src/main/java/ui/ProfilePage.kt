package ui
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import data.jobs
import models.Job
import models.PersonInfo


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
   Column {
       UserProfileHeaderComponent(personInfo)
       JobSection()
   }
}