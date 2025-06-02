package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.NotificationBorderColor
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SecondaryTextColor

@Composable
fun Header(title: String, subtitle: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            modifier = Modifier
                .size(64.dp),
            painter = painterResource(id = R.drawable.jerry_profile_image),
            contentDescription = "profile picture",
        )
        Column(
            modifier = Modifier
                .padding(start = 10.dp, top = 6.dp, bottom = 6.dp, end = 52.dp),
        ) {

            Text(
                text = title,
                color = PrimaryTextColor,
                fontFamily = Ibm,
                fontSize = 19.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = subtitle,
                color = SecondaryTextColor,
                fontFamily = Ibm,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            )
        }
        BadgedBox(
            badge = {
                Badge(
                    containerColor = DarkBlueColor,
                    contentColor = Color.White,
                    modifier = Modifier
                        .size(18.dp)
                ) {
                    Text("3", fontSize = 13.sp)
                }
            },
            content = {
                Icon(
                    modifier = Modifier
                        .size(53.dp)
                        .border(
                            width = 1.dp,
                            color = NotificationBorderColor,
                            shape = RoundedCornerShape(16.dp)
                        )
                        .padding(horizontal = 10.dp, vertical = 10.dp),
                    painter = painterResource(id = R.drawable.notification),
                    contentDescription = "notification"
                )
            }
        )
    }
}

@Preview(widthDp = 360)
@Composable
fun HeaderPreview() {
    Header(title = "Title", subtitle = "Subtitle")
}