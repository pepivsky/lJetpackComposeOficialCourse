package com.example.cursooficialjetpackcompose.ui.practice.composeBasics

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Quadrant(modifier: Modifier = Modifier, title: String, description: String) {
    Box(
        modifier,
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                modifier = Modifier.padding(bottom = 16.dp),
                text = title,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
        }

    }
}

@Composable
fun QuadrantsScreen() {
    Column(Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .weight(1F)
                .background(Color.Black)
        ) {

            Quadrant(
                modifier = Modifier
                    .background(Color.Green)
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(16.dp),
                title = "Text composable",
                description = "Displays text and follows Material Design guidelines."
            )

            Quadrant(
                modifier = Modifier
                    .background(Color.Yellow)
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(16.dp),
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object."
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
                .background(Color.Black)
        ) {
            Quadrant(
                modifier = Modifier
                    .background(Color.Cyan)
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(16.dp),
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence."
            )

            Quadrant(
                modifier = Modifier
                    .background(Color.LightGray)
                    .weight(1F)
                    .fillMaxHeight()
                    .padding(16.dp),
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence."
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantsScreen()
}