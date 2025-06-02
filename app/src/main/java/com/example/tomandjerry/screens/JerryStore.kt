package com.example.tomandjerry.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.R
import com.example.tomandjerry.composable.CheapTomSection
import com.example.tomandjerry.composable.Header
import com.example.tomandjerry.composable.OfferCard
import com.example.tomandjerry.composable.ProductCard
import com.example.tomandjerry.composable.SimpleSearchBar
import com.example.tomandjerry.composable.SpacerHorizontal
import com.example.tomandjerry.composable.SpacerVertical
import com.example.tomandjerry.ui.theme.BackgroundColor

@Composable
fun JerryStore() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(BackgroundColor)
            .padding(horizontal = 21.dp, vertical = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header(
            title = stringResource(R.string.hi_jerry),
            subtitle = stringResource(R.string.which_tom_do_you_want_to_buy)
        )
        SpacerVertical(21)
        SimpleSearchBar()
        SpacerVertical(10)
        OfferCard()
        SpacerVertical(32)
        CheapTomSection()
        SpacerVertical(21)
        Row(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(
                    image = R.drawable.sport_tom,
                    title = "Sport Tom",
                    description = "He runs 1 meter... trips\nover his boot.",
                    sale = "5",
                    price = "3"
                )
            }
            SpacerHorizontal(10)
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(
                    image = R.drawable.lover_tom,
                    title = "Tom the lover",
                    description = "He loves one-sidedly...\nand is beaten by the other\nside.",
                    price = "5"
                )
            }
        }
        SpacerVertical(16)
        Row(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(
                    image = R.drawable.bomb_tom,
                    title = "Tom the bomb",
                    description = "He blows himself up\nbefore Jerry can catch\nhim.",
                    price = "10"
                )
            }
            SpacerHorizontal(10)
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(
                    image = R.drawable.spy_tom,
                    title = "Spy Tom",
                    description = "Disguises itself as a table.",
                    price = "12"
                )
            }
        }
        SpacerVertical(16)
        Row(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(
                    image = R.drawable.frozen_tom,
                    title = "Frozen Tom",
                    description = "He was chasing Jerry, he\nfroze after the first look",
                    price = "10"
                )
            }
            SpacerHorizontal(10)
            Box(modifier = Modifier.weight(1f)) {
                ProductCard(
                    image = R.drawable.sleeping_tom,
                    title = "Sleeping Tom",
                    description = "He doesn't chase anyone,\nhe just snores in stereo.",
                    price = "10"
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    JerryStore()
}