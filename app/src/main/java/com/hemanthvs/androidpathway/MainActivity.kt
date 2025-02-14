package com.hemanthvs.androidpathway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hemanthvs.androidpathway.ui.theme.AndroidPathwayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPathwayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeTutorial(
                        header = stringResource(id = R.string.compose_tutorial_header),
                        info1 = stringResource(id = R.string.compose_info_1),
                        info2 = stringResource(id = R.string.compose_info_2),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeTutorial(header: String, info1: String, info2: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            Modifier.fillMaxWidth()
            )
        Text(text = header,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = info1,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = info2,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidPathwayTheme {
        ComposeTutorial(
            header = stringResource(id = R.string.compose_tutorial_header),
            info1 = stringResource(id = R.string.compose_info_1),
            info2 = stringResource(id = R.string.compose_info_2),
            modifier = Modifier.padding(8.dp)
        )
    }
}