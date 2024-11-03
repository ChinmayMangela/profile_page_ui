package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.jobs
import models.Job

@Composable
fun JobSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(10.dp)
    ) {
        TextComponent(text = "Jobs Done", color = Color.Black, fontSize = 20.sp)
        JobListComponent()
    }
}


@Composable
fun JobListComponent() {
    LazyRow(
        modifier = Modifier.padding(vertical = 10.dp)
    ) {
        items(jobs.size) {
            JobTileComponent(job = jobs[it])
        }
    }
}

@Composable
fun JobTileComponent(job: Job) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(10.dp)
            .height(90.dp).width(120.dp)
            .background(Color.White)
            .border(1.dp, Color.Gray, RoundedCornerShape(10.dp))
            .clip(
                shape = RoundedCornerShape(10.dp)
            )
    ) {
       TextComponent(text = job.name, color = Color.Red, fontSize = 12.sp)
    }
}