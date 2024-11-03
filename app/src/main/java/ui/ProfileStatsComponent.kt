package ui
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import constants.profileStatsContainerColor
import models.ProfileStats


@Composable
fun ProfileStatsComponent(profileStats: ProfileStats) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(profileStatsContainerColor)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Row(
                modifier = Modifier.padding(bottom = 35.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                KeyValuePairComponent(key = profileStats.averageRating.toString(), value = "Average Rating", modifier = Modifier.weight(1f).padding(end = 8.dp))
                KeyValuePairComponent(key = profileStats.jobsCompleted.toString(), value = "Jobs Completed", modifier = Modifier.weight(1f).padding(start = 8.dp))
            }
            Row (
                modifier = Modifier.padding(bottom = 35.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                KeyValuePairComponent(key = profileStats.payRange, value = "Pay Range", keyFontSize = 30.sp, valueFontSize = 10.sp, modifier = Modifier.weight(1f).padding(end = 8.dp))
                KeyValuePairComponent(key ="0${profileStats.onGoing}", value = "Ongoing", modifier = Modifier.weight(1f).padding(start = 8.dp))
            }

            Row(
                modifier = Modifier.padding(bottom = 35.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                KeyValuePairComponent(key = profileStats.availability, value = "Availability", keyFontSize = 20.sp, valueFontSize = 10.sp, modifier = Modifier.weight(1f).padding(end = 8.dp))
                KeyValuePairComponent(key = profileStats.service, value = "Service", keyFontSize = 20.sp, valueFontSize = 10.sp, modifier = Modifier.weight(1f).padding(start = 8.dp, end = 8.dp))
                KeyValuePairComponent(key = profileStats.quality, value = "Quality", keyFontSize = 20.sp, valueFontSize = 10.sp, modifier = Modifier.weight(1f).padding(start = 8.dp))
            }
        }
    }
}

@Composable
private fun KeyValuePairComponent(
    key: String,
    value: String,
    keyFontSize: TextUnit = 60.sp,
    valueFontSize: TextUnit = 16.sp,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(text = key, color = Color.White, fontSize = keyFontSize)
        Text(text = value, color = Color.White, fontSize = valueFontSize)
    }
}
