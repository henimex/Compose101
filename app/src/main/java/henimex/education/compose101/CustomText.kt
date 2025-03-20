package henimex.education.compose101

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomizedTextArea(input: String) {
    Text(
        text = input,
        color = Color.White,
        fontWeight = FontWeight(600),
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(Color.Magenta)
            .padding(10.dp)
            .fillMaxWidth( 0.9f)
            .clickable {
                printSomething(input)
            }
    )
}


fun printSomething(input: String) {
    println("From Method $input")
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun SpecialPreview() {
    CustomizedTextArea("Hello From Custom File 2")
}