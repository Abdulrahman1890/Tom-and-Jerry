package com.example.tomandjerry.composable

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.LightButtonColor
import com.example.tomandjerry.ui.theme.LineThroughColor

@Composable
fun HeaderTomAccount() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.account_background),
            contentDescription = "Tom Account Background",
            modifier = Modifier.fillMaxWidth()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {

            Image(
                painter = painterResource(id = R.drawable.account_profile),
                contentDescription = "profile picture",
                modifier = Modifier
                    .size(95.dp)
                    .padding(top = 16.dp)
            )
            SpacerVertical(5)
            Text(
                text = "Tom",
                color = Color.White,
                fontFamily = Ibm,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp
            )
            Text(
                text = "specializes in failure!",
                color = LineThroughColor,
                fontFamily = Ibm,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
            SpacerVertical(10)
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(53.dp))
                    .size(width = 132.dp, height = 33.dp)
                    .background(LightButtonColor)
                    .padding(horizontal = 19.dp, vertical = 6.dp)
                    .clickable(onClick = {}),
            ) {
                Text(
                    text = "Edit foolishness",
                    color = Color.White,
                    fontSize = 13.sp,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHeaderTomAccount() {
    HeaderTomAccount()
}