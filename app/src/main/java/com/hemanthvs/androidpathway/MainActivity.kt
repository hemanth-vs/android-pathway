package com.hemanthvs.androidpathway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hemanthvs.androidpathway.ui.theme.AndroidPathwayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPathwayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        fullName = "Self",
                        title = "Student",
                        phone = "Random Phone number",
                        linkedIn = "Random LinkedIn",
                        email = "Random email",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(fullName: String, title: String, phone: String, linkedIn: String, email: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize(1f)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(3f).padding(top = 32.dp)
        ) {
            Image(painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.size(80.dp)
                )
            Text(
                text = fullName,
                modifier = Modifier
            )
            Text(text = title,
                modifier = Modifier
            )
        }
        Column(verticalArrangement = Arrangement.Bottom,
            modifier = Modifier.weight(1f).padding(48.dp)
            ){
            Row {
                Icon(
                    Icons.Rounded.Phone,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(text = phone)
            }
            Row {
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.inbug_black),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )}
                Text(text = linkedIn)

            }
            Row {
                Icon(
                    Icons.Rounded.MailOutline,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 16.dp)
                )
                Text(text = email)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidPathwayTheme {
//        Greeting("Android")
    }
}