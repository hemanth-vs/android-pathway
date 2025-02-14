package com.hemanthvs.androidpathway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hemanthvs.androidpathway.ui.theme.AndroidPathwayTheme
import com.hemanthvs.androidpathway.ui.theme.q1
import com.hemanthvs.androidpathway.ui.theme.q2
import com.hemanthvs.androidpathway.ui.theme.q3
import com.hemanthvs.androidpathway.ui.theme.q4

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPathwayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposableInfo(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun QuadrantInfoCard(header: String, info: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize().background(color = color).padding(16.dp)
    ){
        Text(
            text = header,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = info,
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}
@Composable
fun ComposableInfo(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(modifier = Modifier.weight(1f)) {
            QuadrantInfoCard(
                header = stringResource(R.string.text_composable_header),
                info = stringResource(R.string.text_composable_info),
                color = q2,
                modifier = Modifier.weight(1f)
            )
            QuadrantInfoCard(
                header = stringResource(R.string.image_composable_header),
                info = stringResource(R.string.image_composable_info),
                color = q1,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            QuadrantInfoCard(
                header = stringResource(R.string.row_composable_header),
                info = stringResource(R.string.row_composable_info),
                color = q3,
                modifier = Modifier.weight(1f)
            )
            QuadrantInfoCard(
                header = stringResource(R.string.column_composable_header),
                info = stringResource(R.string.column_composable_info),
                color = q4,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidPathwayTheme {
        ComposableInfo()
    }
}