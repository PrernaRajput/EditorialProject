package com.example.editorialui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.border
import androidx.compose.ui.draw.shadow

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EditorialScreen()
        }
    }
}

@Composable
fun EditorialScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFAFAFA)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFAFAFA))
                .padding(24.dp)
        ) {

            Text(
                text = "Where Form Meets Flora",
                fontSize = 52.sp,
                fontWeight = FontWeight.Black,
                color = Color.Black
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Editorial design inspired by the uploaded reference.",
                fontSize = 20.sp,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(
                    id = R.drawable.green_chair
                ),
                contentDescription = "Green Chair",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp)
            )

            Button(
                onClick = {},

                modifier = Modifier
                    .fillMaxWidth()
                    .height(72.dp)
                    .shadow(
                        elevation = 18.dp,
                        shape = RoundedCornerShape(24.dp),
                        clip = false
                    )
                    .border(
                        width = 2.dp,
                        color = Color(0xFF022202),
                        shape = RoundedCornerShape(24.dp)
                    ),

                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF00FF26),
                    contentColor = Color.Black
                ),

                shape = RoundedCornerShape(24.dp),

                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 10.dp
                )
            ) {

                Text(
                    text = "Read More",

                    fontSize = 22.sp,

                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }
}
