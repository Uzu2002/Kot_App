package com.example.kot_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kot_app.ui.theme.Kot_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kot_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    /*
                    GreetingImage(message = stringResource(R.string.happy_birthday_text), from = stringResource(
                                            R.string.signature_text))

                    ArticleText(message = stringResource(R.string.jetpack_title), from1 = stringResource(
                                            R.string.jetpack_body1), from2 = stringResource(
                        R.string.jetpack_body2))
                    */
                    /*
                    TaskImage(message = stringResource(R.string.task_mes), from = stringResource(R.string.task_string))
                    */
                    QuadrantImage(message = stringResource(R.string.quadrant_head_1), from = stringResource(
                                            R.string.quadrant_text_1), message1 = stringResource(R.string.quadrant_head_2), from1 = stringResource(
                                                                    R.string.quadrant_text_2), message2 = stringResource(
                                                                                            R.string.quadrant_head_3), from2 = stringResource(
                                                                                                                    R.string.quadrant_text_3), message3 = stringResource(
                                                                                                                                            R.string.quadrant_head_4), from3 = getString(
                                                                                                                                                                    R.string.quadrant_text_4),)
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(8.dp)
        ) {
            Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 116.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = from,
                fontSize = 36.sp,
                modifier = Modifier
                    .padding(16.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }

}

@Composable
fun ArticleText(message: String, from1: String, from2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 35.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from1,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = from2,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}


@Composable
fun ArticleImage(message: String, from1: String, from2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)

    Column(
        modifier, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        ArticleText(
            message = message,
            from1 = from1,
            from2 = from2,
            modifier = Modifier
                .padding(16.dp, 16.dp, 16.dp, 16.dp)
        )
    }

}

@Composable
fun TaskText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 35.sp,
            lineHeight = 70.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}


@Composable
fun TaskImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)

    Column(
        modifier , verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Inside
        )
        TaskText(
            message = message,
            from = from,
            modifier = Modifier
                .padding(16.dp, 16.dp, 16.dp, 16.dp)
        )
    }

}


@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)

    Box(modifier){
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        alpha = 0.5F
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }

}

@Composable
fun TextComposable(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 90.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

    }

}

@Composable
fun ImageComposable(message1: String, from1: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message1,
            fontSize = 90.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from1,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

    }

}

@Composable
fun RowComposable(message2: String, from2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message2,
            fontSize = 90.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from2,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

    }

}

@Composable
fun ColumnComposable(message3: String, from3: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message3,
            fontSize = 90.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from3,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )

    }

}

@Composable
fun QuadrantImage(message: String, from: String, message1: String, from1: String, message2: String, from2: String, message3: String, from3: String, modifier: Modifier = Modifier) {

    Column(
        modifier, horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier){
            modifier.fillMaxWidth(50%)
            Color(
                0xFFEADDFF
            )
            TextComposable(

                message = message,
                from = from,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
        Box(modifier){
            Color(
                0xFFD0BCFF
            )
            TextComposable(

                message = message1,
                from = from1,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
        Box(modifier){
            Color(
                0xFFB69DF8
            )
            TextComposable(

                message = message2,
                from = from2,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
        Box(modifier){
            Color(
                0xFFF6EDFF
            )
            TextComposable(

                message = message3,
                from = from3,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
    }


}



@Preview(
    showBackground = true,
    name = "phone",
    showSystemUi = true
)
@Composable
    fun BirthdayCardPreview() {
        Kot_AppTheme {
            /*
            GreetingImage(
                message = stringResource(R.string.happy_birthday_text),
                from = stringResource(R.string.signature_text)
            )
             */
            QuadrantImage(
                message = stringResource(R.string.quadrant_head_1),
                from = stringResource(R.string.quadrant_text_1),
                message1 = stringResource(R.string.quadrant_head_2),
                from1 = stringResource(R.string.quadrant_text_2),
                message2 = stringResource(R.string.quadrant_head_3),
                from2 = stringResource(R.string.quadrant_text_3),
                message3 = stringResource(R.string.quadrant_head_4),
                from3 = stringResource(R.string.quadrant_text_4)
            )
        }

}
