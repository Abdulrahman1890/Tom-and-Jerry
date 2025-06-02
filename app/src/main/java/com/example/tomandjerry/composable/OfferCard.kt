package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BackgroundColor
import com.example.tomandjerry.ui.theme.CardLinearFirstColor
import com.example.tomandjerry.ui.theme.CardLinearSecondColor
import com.example.tomandjerry.ui.theme.Ibm

@Composable
fun OfferCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(144.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(144.dp)
                .padding(top = 21.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(CardLinearFirstColor, CardLinearSecondColor),
                        start = Offset(0f, 0f),
                        end = Offset(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY)
                    ),
                    shape = RoundedCornerShape(21.dp)
                ),
        ) {

            Column(
                modifier = Modifier
                    .padding(16.dp),
            ) {
                Text(
                    text = stringResource(R.string.buy_1_tom_and_get_2_for_free),
                    color = Color.White,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Bold,
                    fontSize = 19.sp
                )
                SpacerVertical(15)
                Text(
                    text = stringResource(R.string.adopt_tom_free_fail_free_guarantee),
                    color = BackgroundColor,
                    fontFamily = Ibm,
                    fontWeight = FontWeight.Normal,
                    fontSize = 15.sp
                )
            }
        }
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ellipse),
                contentDescription = "Tom Image",
                modifier = Modifier
                    .size(width = 153.dp, height = 144.dp)
                    .offset(x = 5.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.tom_money),
                contentDescription = "Tom Image",
                modifier = Modifier
                    .size(width = 153.dp, height = 144.dp)
            )

        }

    }
}


@Preview(showBackground = true)
@Composable
fun OfferCardPreview() {
    OfferCard()
}