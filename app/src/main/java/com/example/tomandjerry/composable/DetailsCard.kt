package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.example.tomandjerry.ui.theme.IconColor
import com.example.tomandjerry.ui.theme.SecondDescriptionTextColor
import com.example.tomandjerry.ui.theme.SmallCardColor

@Composable
fun DetailsCard(image: Int, title: String, description: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .size(138.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(SmallCardColor)
    ) {
        Icon(
            painter = painterResource(image),
            contentDescription = "temperature",
            tint = IconColor,
            modifier = Modifier.size(42.dp)
        )
        SpacerVertical(16)
        Text(
            text = title,
            color = DescriptionTextColor,
            fontFamily = Ibm,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
            color = SecondDescriptionTextColor,
            fontFamily = Ibm,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            textAlign = TextAlign.Center
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDetailsCard() {
    DetailsCard(R.drawable.temperature, "1000 V", "Temperature")
}