package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.CardLinearFirstColor
import com.example.tomandjerry.ui.theme.CardLinearSecondColor
import com.example.tomandjerry.ui.theme.DescriptionTextColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.IconColor
import com.example.tomandjerry.ui.theme.SmallCardColor

@Composable
fun PreparationMethodCard(number: String, text: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 26.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .align(Alignment.Center)
                .height(42.dp)


        ) {
            Text(
                text = text,
                color = DescriptionTextColor,
                fontFamily = Ibm,
                fontSize = 19.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 32.dp)
            )
        }

        Box(
            modifier = Modifier
                .size(48.dp)
                .border(
                    width = 1.dp,
                    color = SmallCardColor,
                    shape = RoundedCornerShape(133.dp)
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(133.dp)
                ),
        ) {
            Text(
                text = number,
                color = IconColor,
                fontFamily = Ibm,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.align(Alignment.Center)
            )

        }


    }

}


@Preview(showBackground = true)
@Composable
fun PreviewPreparationMethodCard() {
    PreparationMethodCard("1", "Put the pasta in a toaster.")
}