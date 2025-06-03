package com.example.tomandjerry.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.composable.HeaderTomAccount
import com.example.tomandjerry.composable.TomAccountDetails


@Composable
fun TomAccount() {
    Box(
        modifier = Modifier
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState()),
    ) {
        HeaderTomAccount()
        TomAccountDetails()
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewTomAccount() {
    TomAccount()
}