package com.example.cursooficialjetpackcompose.ui.practice.composeBasics

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cursooficialjetpackcompose.R
import com.example.cursooficialjetpackcompose.ui.theme.GreenAndroid

@Composable
fun BusinessCardScreen(name: String, phone: String, user: String, email: String) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF073042))
    ) {
        BusinessCardHeader(
            name = name,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(bottom = 30.dp)
        )
        BusinessCardFooter(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 50.dp),
            phone, user, email
        )
    }
}

@Composable
fun BusinessCardHeader(modifier: Modifier = Modifier, name: String) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            modifier = Modifier.size(100.dp),
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null
        )
        Text(
            text = name,
            color = Color.White,
            fontSize = 32.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Android Developer Extraordinaire",
            color = GreenAndroid,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BusinessCardFooter(modifier: Modifier = Modifier, phone: String, user: String, email: String) {
    Column(modifier = modifier.fillMaxWidth()) {
        ItemFooter(icon = Icons.Default.Phone, content = phone)
        ItemFooter(icon = Icons.Default.Share, content = user)
        ItemFooter(icon = Icons.Default.Email, content = email)
    }
}

@Composable
fun ItemFooter(icon: ImageVector, content: String, modifier: Modifier = Modifier) {
    Divider(color = Color(0xff526e7b))
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 80.dp)
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = GreenAndroid)
        Spacer(modifier = Modifier.size(24.dp))
        Text(text = content, color = Color.White)
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardScreenPreview() {
    BusinessCardScreen(
        "Jennifer Doe",
        phone = "+11 (123)444 555 666",
        user = "@AndroidDev",
        email = "jen.doe@android.com"
    )
}