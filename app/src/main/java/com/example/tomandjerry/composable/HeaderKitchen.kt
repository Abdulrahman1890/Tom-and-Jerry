package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.example.tomandjerry.ui.theme.Ibm

@Composable
fun HeaderKitchen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.top_background),
            contentDescription = "Tom Kitchen Background"
        )

        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopStart)
                .padding(start = 21.dp, top = 40.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ruler),
                    contentDescription = "chef",
                    tint = Color.White
                )
                SpacerHorizontal(10)
                Text(
                    text = "High tension",
                    color = Color.White,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 21.sp
                )
            }
            SpacerVertical(21)
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.chef),
                    contentDescription = "chef",
                    tint = Color.White
                )
                SpacerHorizontal(10)
                Text(
                    text = "Shocking foods",
                    color = Color.White,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 21.sp
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHeaderKitchenScreen() {
    HeaderKitchen()
}