package com.example.cursooficialjetpackcompose.ui.practice.composeBasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursooficialjetpackcompose.R

@Composable
fun Article() {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            text = stringResource(R.string.first_paragraph),
            textAlign = TextAlign.Justify
        )
        Text(
            modifier = Modifier.padding(16.dp),
            text = stringResource(id = R.string.content_article),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    Article()
}