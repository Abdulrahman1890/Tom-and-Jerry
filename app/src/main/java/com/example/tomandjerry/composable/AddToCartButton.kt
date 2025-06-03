package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BorderColor
import com.example.tomandjerry.ui.theme.BottomButtonColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.LightWhiteTextColor
import com.example.tomandjerry.ui.theme.LineThroughColor


@Composable
fun AddToCartButton() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .border(
                width = 1.dp,
                color = BorderColor,
            )
            .padding(horizontal = 21.dp, vertical = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    BottomButtonColor,
                    shape = RoundedCornerShape(21.dp)
                )
                .padding(vertical = 12.dp),
            contentAlignment = Alignment.Center
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Add to cart",
                    fontFamily = Ibm,
                    color = LightWhiteTextColor,
                    fontSize = 21.sp,
                    fontWeight = FontWeight.Medium
                )
                SpacerHorizontal(10)
                Icon(
                    painter = painterResource(id = R.drawable.dot),
                    contentDescription = "dot",
                    tint = LightWhiteTextColor,
                    modifier = Modifier.size(8.dp)
                )
                SpacerHorizontal(10)
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "3 cheeses",
                        color = Color.White,
                        fontFamily = Ibm,
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "5 cheeses",
                        fontFamily = Ibm,
                        color = LineThroughColor,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewAddToCartButton() {
    AddToCartButton()
}