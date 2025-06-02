package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ButtonColor
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.PrimaryTextColor
import com.example.tomandjerry.ui.theme.SearchBarTextColor

@Composable
fun ProductCard(image: Int, title: String, description: String, sale: String = "", price: String) {
    Box(
        modifier = Modifier
            .height(300.dp)
            .width(200.dp)

    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(top = 21.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(21.dp)
                ),
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(top = 120.dp)
            ) {
                Text(
                    text = title,
                    color = PrimaryTextColor,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 24.sp
                )
                Text(
                    text = description,
                    color = SearchBarTextColor,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 5.dp)
                )
            }
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, top = 230.dp, end = 5.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .size(width = 135.dp, height = 38.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(ButtonColor)
                            .clickable {}
                            .padding(horizontal = 12.dp, vertical = 8.dp)
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
                                text = sale,
                                color = DarkBlueColor,
                                fontFamily = Ibm,
                                fontWeight = FontWeight.Medium,
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                style = TextStyle(
                                    textDecoration = TextDecoration.LineThrough,
                                    color = DarkBlueColor
                                )
                            )
                            Text(
                                text = price,
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
                    Icon(
                        modifier = Modifier
                            .size(40.dp)
                            .border(
                                width = 1.dp,
                                color = DarkBlueColor,
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(horizontal = 10.dp, vertical = 10.dp),
                        painter = painterResource(id = R.drawable.add_cart),
                        tint = DarkBlueColor,
                        contentDescription = "notification"
                    )
                }
            }

        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Tom Image",
                modifier = Modifier
                    .size(width = 124.dp, height = 133.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProductCardPreview() {
    ProductCard(
        image = R.drawable.sport_tom,
        title = "Tom Money",
        description = "He is a very good boy",
        sale = "5",
        price = "3"
    )

}