package com.example.happybirthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdayapp.ui.theme.HappyBirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayAppTheme {
                //surface container
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(message = "Happy Birthday Noah!", from = "From Noah", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

//displays text to the UI with the Text() function
@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    //aligns the text in a column
    Column(
        verticalArrangement = Arrangement.Center,
        modifier =  modifier
    )
     {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp) //overriding the modifier passed in the onCreate
                .align(alignment = Alignment.End)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayAppTheme {
        //function call -- one argument
        GreetingText(message = "Happy Birthday Noah!", from = "From Noah")
    }
}
