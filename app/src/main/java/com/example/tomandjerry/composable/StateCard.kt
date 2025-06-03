package com.example.tomandjerry.composable

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import com.example.tomandjerry.ui.theme.DescriptionTextColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.SecondDescriptionTextColor
import com.example.tomandjerry.ui.theme.SmallCardColor

@Composable
fun StateCard(image: Int, title: String, description: String) {

        Image(
            painter = painterResource(id = image),
            contentDescription = "devil state",
            modifier = Modifier.size(53.dp)
        )
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = title,
                color = DescriptionTextColor,
                fontFamily = Ibm,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
            )
            Text(
                text = description,
                color = SecondDescriptionTextColor,
                fontFamily = Ibm,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
            )
        }
    }

@Preview(showBackground = true)
@Composable
fun PreviewStateCard() {
    StateCard(R.drawable.devil_state, "1M 12K", "No. of deaths")
}