package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BackgroundColor
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SecondaryButtonColor
import com.example.tomandjerry.ui.theme.TestTextColor


@Composable
fun ProductDetailsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .height(144.dp)
                .padding(top = 256.dp)
                .background(
                    BackgroundColor,
                    shape = RoundedCornerShape(21.dp)
                ),
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(top = 21.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(21.dp)
                ) {
                    Column() {
                        Text(
                            text = "Electric Tom pasta",
                            color = TestTextColor,
                            fontFamily = Ibm,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 27.sp
                        )
                        SpacerVertical(16)
                        Box(
                            modifier = Modifier
                                .size(width = 125.dp, height = 40.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(SecondaryButtonColor)
                                .clickable {}
                                .padding(horizontal = 10.dp, vertical = 9.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceAround,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.money_bag),
                                    contentDescription = "money pocket",
                                    modifier = Modifier.size(18.dp)
                                )
                                Text(
                                    text = "5",
                                    color = DarkBlueColor,
                                    fontFamily = Ibm,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "cheeses",
                                    color = DarkBlueColor,
                                    fontFamily = Ibm,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                    Icon(
                        painter = painterResource(id = R.drawable.heart),
                        contentDescription = "heart",
                        tint = DarkBlueColor,
                        modifier = Modifier
                            .size(width = 32.dp, height = 32.dp)
                    )
                }

                Text(
                    text = "Pasta cooked with a charger cable and\nsprinkled with questionable cheese. Make sure\nto unplug it before eating (or not, you decide).",
                    color = DarkBlueColor,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )



            }
        }

        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 60.dp, end = 30.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.makarona),
                contentDescription = "food plate",
                modifier = Modifier.size(width = 230.dp, height = 235.dp)
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun PreviewProductDetailsScreen() {
    ProductDetailsScreen()
}