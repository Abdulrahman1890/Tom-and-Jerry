package com.example.tomandjerry.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.DarkBlueColor
import com.example.tomandjerry.ui.theme.Ibm
import com.example.tomandjerry.ui.theme.SearchBarTextColor

@Composable
fun SimpleSearchBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TextField(
            modifier = Modifier.size(width = 330.dp, height = 64.dp),
            shape = RoundedCornerShape(16.dp),
            value = stringResource(R.string.search_about_tom),
            textStyle = TextStyle(
                fontFamily = Ibm,
                fontWeight = FontWeight.Normal,
                color = SearchBarTextColor,
                fontSize = 19.sp
            ),
            onValueChange = {},
            leadingIcon = {
                Icon(
                    modifier = Modifier.padding(start = 16.dp),
                    painter = painterResource(id = R.drawable.search),
                    tint = SearchBarTextColor,
                    contentDescription = "Search Icon",
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                unfocusedIndicatorColor = Color.Transparent,
            )
        )

        IconButton(
            onClick = { },
            modifier = Modifier
                .size(64.dp)
                .background(
                    color = DarkBlueColor,
                    shape = RoundedCornerShape(16.dp)
                )
        ) {
            Icon(
                painter = painterResource(R.drawable.filter),
                tint = Color.White,
                contentDescription = "filter"
            )
        }
    }
}

@Preview(widthDp = 360)
@Composable
fun SearchBarPreview() {
    SimpleSearchBar()
}