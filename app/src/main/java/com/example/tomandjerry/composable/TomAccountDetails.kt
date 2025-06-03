package com.example.tomandjerry.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BackgroundColor
import com.example.tomandjerry.ui.theme.DescriptionTextColor
import com.example.tomandjerry.ui.theme.GreenColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.RedColor
import com.example.tomandjerry.ui.theme.SmallCardColor
import com.example.tomandjerry.ui.theme.TitleTextColor
import com.example.tomandjerry.ui.theme.YellowColor


@Composable
fun TomAccountDetails() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 215.dp)
            .background(
                BackgroundColor,
                shape = RoundedCornerShape(21.dp)
            ),
    ) {
        Image(
            painter = painterResource(id = R.drawable.line),
            contentDescription = "line",
            modifier = Modifier.padding(top = 481.dp)
        )
        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .padding(start = 21.dp, end = 21.dp, bottom = 32.dp, top = 30.dp)
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .size(width = 213.dp, height = 75.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(SmallCardColor)
                    ) {
                        StateCard(R.drawable.devil_state, "2M 12K", "No. of quarrels")
                    }
                }
                SpacerHorizontal(10)
                Box(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .size(width = 213.dp, height = 75.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(GreenColor)
                    ) {
                        StateCard(R.drawable.run_state, "+500 h", "Chase time")
                    }
                }
            }
            SpacerVertical(10)
            Row(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .size(width = 213.dp, height = 75.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(RedColor)
                    ) {
                        StateCard(R.drawable.sad_state, "2M 12K", "Hunting times")
                    }
                }
                SpacerHorizontal(10)
                Box(modifier = Modifier.weight(1f)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .size(width = 213.dp, height = 75.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(YellowColor)
                    ) {
                        StateCard(R.drawable.broken_state, "3M 7K", "Heartbroken")
                    }
                }
            }
            SpacerVertical(32)
            Text(
                text = "Tom settings",
                color = TitleTextColor,
                fontFamily = Ibm,
                fontWeight = FontWeight.Bold,
                fontSize = 27.sp,
            )
            SpacerVertical(10)
            SettingsAndFavourite(R.drawable.bed, "Change sleeping place")
            SpacerVertical(16)
            SettingsAndFavourite(R.drawable.meaw, "Meow settings")
            SpacerVertical(16)
            SettingsAndFavourite(R.drawable.fridge, "Password to open the fridge")
            SpacerVertical(32)
            Text(
                text = "His favorite foods",
                color = TitleTextColor,
                fontFamily = Ibm,
                fontWeight = FontWeight.Bold,
                fontSize = 27.sp,
            )
            SpacerVertical(10)
            SettingsAndFavourite(R.drawable.warning, "Mouses")
            SpacerVertical(16)
            SettingsAndFavourite(R.drawable.food, "Last stolen meal")
            SpacerVertical(16)
            SettingsAndFavourite(R.drawable.sleep, "Change sleep mood")
            SpacerVertical(32)
            Text(
                text = "v.TomBeta",
                color = DescriptionTextColor,
                fontFamily = Ibm,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomAccountDetails() {
    TomAccountDetails()
}