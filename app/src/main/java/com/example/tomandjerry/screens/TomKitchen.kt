package com.example.tomandjerry.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.composable.HeaderKitchen
import com.example.tomandjerry.composable.ProductDetailsScreen


@Composable
fun TomKitchen() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        HeaderKitchen()

    }
    ProductDetailsScreen()
}

@Preview(showBackground = true)
@Composable
fun PreviewKitchenScreen() {
    TomKitchen()
}