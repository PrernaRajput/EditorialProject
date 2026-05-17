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
import androidx.compose.foundation.Canvas
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EditorialScreen()
        }
    }
}

val InstrumentSerif: FontFamily = FontFamily(
    Font(R.font.instrument_serif_regular)
)
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


            Image(
                painter = painterResource(
                    id = R.drawable.green_chair
                ),
                contentDescription = "Green Chair",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(320.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Echo the intricate nature.",
                fontSize = 48.sp,
                fontWeight = FontWeight.Black,
                fontFamily = InstrumentSerif,
                color = Color.Black
            )

            BubbleBorderButton()
        }
    }
}

@Composable
fun BubbleBorderButton() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(90.dp),
        contentAlignment = Alignment.Center
    ) {

        Canvas(
            modifier = Modifier.matchParentSize()
        ) {

            val bubbleColor =
                Color.Black

            val spacing = 22f

            // top
            for (x in 0..size.width.toInt() step spacing.toInt()) {

                drawCircle(
                    color = bubbleColor,
                    radius =
                        (6..14).random().toFloat(),
                    center = Offset(
                        x.toFloat(),
                        10f
                    )
                )
            }

            // bottom
            for (x in 0..size.width.toInt() step spacing.toInt()) {

                drawCircle(
                    color = bubbleColor,
                    radius =
                        (6..14).random().toFloat(),
                    center = Offset(
                        x.toFloat(),
                        size.height - 10f
                    )
                )
            }

            // left
            for (y in 0..size.height.toInt() step spacing.toInt()) {

                drawCircle(
                    color = bubbleColor,
                    radius =
                        (6..14).random().toFloat(),
                    center = Offset(
                        10f,
                        y.toFloat()
                    )
                )
            }

            // right
            for (y in 0..size.height.toInt() step spacing.toInt()) {

                drawCircle(
                    color = bubbleColor,
                    radius =
                        (6..14).random().toFloat(),
                    center = Offset(
                        size.width - 10f,
                        y.toFloat()
                    )
                )
            }
        }

        Button(
            onClick = {},

            colors =
                ButtonDefaults.buttonColors(
                    containerColor =
                        Color(0xFF00FF26),
                    contentColor =
                        Color.Black
                ),

            shape =
                RoundedCornerShape(2.dp),

            modifier = Modifier
                .padding(2.dp)
                .fillMaxWidth()
                .height(64.dp)
        ) {

            Text(
                text = "Read More",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}