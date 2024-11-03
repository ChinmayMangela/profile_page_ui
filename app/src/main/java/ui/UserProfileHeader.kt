package ui
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import constants.lightPinkColor

@Composable
fun UserProfileHeaderComponent() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        UserProfilePictureComponent()
        UserProfileDetailsComponent()
    }
}


@Composable
fun UserProfilePictureComponent() {
    Box(
        modifier = Modifier
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.3f)
            .background(color = lightPinkColor)
    )
}

@Composable
fun UserProfileDetailsComponent() {
    Column {
        KeyValuePairComponent(key = "Profession", value = "Contractor")
        KeyValuePairComponent(key = "Contact", value = "+91 9876543210")
    }
}


@Composable
fun KeyValuePairComponent(
    key: String,
    value: String
) {
    Column {
        TextComponent(text = key, color = Color.Black, fontSize = 14.sp)
        Text(text = value, color = Color.Red, fontSize = 10.sp)
    }
}


@Composable
fun TextComponent(
    text: String,
    color: Color,
    fontSize: TextUnit
) {
    Text(text = text, color = color, fontSize  = fontSize)
}



