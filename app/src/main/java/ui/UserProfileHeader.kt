package ui
import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile_page_ui.R
import constants.lightPinkColor
import models.PersonInfo


@Composable
fun UserProfileHeaderComponent(personInfo: PersonInfo) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        UserProfilePictureComponent(personInfo)
        UserProfileDetailsComponent(personInfo)
    }
}


@Composable
private fun UserProfilePictureComponent(personInfo: PersonInfo) {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.38f)
            .background(color = lightPinkColor),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.profile_picture),
                contentDescription = "User Profile Picture",
                modifier = Modifier.fillMaxWidth(0.7f).fillMaxHeight(0.7f)
            )
            Text(personInfo.name)
        }
    }
}

@Composable
private fun UserProfileDetailsComponent(personInfo: PersonInfo) {
    Column(
        modifier = Modifier.padding(14.dp)
    ) {
        KeyValuePairComponent(key = "Profession", value = personInfo.profession)
        KeyValuePairComponent(key = "Contact", value = personInfo.contact)
        KeyValuePairComponent(key = "Location", value = personInfo.location)
        PositionComponent()
    }
}


@Composable
private fun KeyValuePairComponent(
    key: String,
    value: String
) {
    Column(
        modifier = Modifier.absolutePadding(bottom = 10.dp)
    ) {
        TextComponent(text = key, color = Color.Black, fontSize = 12.sp)
        TextComponent(text = value, color = Color.Red, fontSize = 10.sp)
    }
}


@Composable
private fun TextComponent(
    text: String,
    color: Color,
    fontSize: TextUnit
) {
    Text(text = text, color = color, fontSize  = fontSize)
}


@Composable
private fun PositionComponent() {
    var position by remember {
        mutableStateOf("Open")
    }
    var isChecked by remember {
        mutableStateOf(false)
    }
    Column {
        TextComponent(text = "Position", color = Color.Black, fontSize = 15.sp)
        Row {
            Switch(checked = isChecked, onCheckedChange = {
                isChecked = !isChecked
                if(isChecked) {
                    position = "Open"
                } else {
                    position = "Close"
                }
            })
            TextComponent(text = position, color = Color.Red, fontSize = 12.sp)
        }
    }
}


