package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.TitleTextColor

@Composable
fun SettingsAndFavourite(image: Int, title: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "sleep",
            modifier = Modifier.size(53.dp)
        )
        SpacerHorizontal(10)
        Text(
            text = title,
            color = TitleTextColor,
            fontFamily = Ibm,
            fontWeight = FontWeight.Medium,
            fontSize = 21.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSettingsAndFavourite() {
    SettingsAndFavourite(R.drawable.bed, "Change sleeping place")
}