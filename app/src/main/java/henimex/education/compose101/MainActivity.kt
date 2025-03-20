package henimex.education.compose101

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import henimex.education.compose101.ui.theme.Compose101Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose101Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        MainScreen();
                    }
                }
            }
        }

        lambdaTest(9, ::test)
    }

    fun lambdaTest(myInt: Int, myFunc: () -> Unit) {
        println(myInt)
        myFunc.invoke();
    }

    fun test() {
        println("TEST");
    }
}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
            .padding(all = 15.dp)
            .border(width = 1.dp, color = Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello World",
            color = Color.Red,
            fontWeight = FontWeight(500),
            fontSize = 15.sp,
        )

        Text(
            text = "Hi Ferhat",
            color = Color.Yellow,
            fontWeight = FontWeight(500),
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.padding(70.dp))

        Text(
            text = "Welcome Back",
            color = Color.Black,
            fontWeight = FontWeight(500),
            fontSize = 35.sp
        )

        Text(
            text = "How R you today",
            color = Color.Black,
            fontWeight = FontWeight(500),
            fontSize = 42.sp
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp).background(Color.Cyan),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "Text 1 ",
                color = Color.Black,
                fontWeight = FontWeight(500),
                fontSize = 12.sp
            )
            Text(
                text = "Text 2 ",
                color = Color.Black,
                fontWeight = FontWeight(500),
                fontSize = 12.sp
            )
            Text(
                text = "Text 3 ",
                color = Color.Black,
                fontWeight = FontWeight(500),
                fontSize = 12.sp
            )
            Text(
                text = "Text 4 ",
                color = Color.Black,
                fontWeight = FontWeight(500),
                fontSize = 12.sp
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Compose101Theme {
        //Greeting("Android")
        MainScreen()
    }
}