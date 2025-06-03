package com.example.tomandjerry.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tomandjerry.composable.AddToCartButton
import com.example.tomandjerry.composable.HeaderKitchen
import com.example.tomandjerry.composable.ProductDetailsScreen


@Composable
fun TomKitchen() {

    Scaffold(
        bottomBar = {
            AddToCartButton()
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {

                Box(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState()),
                ) {
                    HeaderKitchen()
                    ProductDetailsScreen()

                }
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewKitchenScreen() {
    TomKitchen()
}