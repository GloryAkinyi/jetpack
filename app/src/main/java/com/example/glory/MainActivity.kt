package com.example.glory

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.glory.ui.theme.GloryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            demo()

        }
    }
}

@Composable
fun demo(){

    val mContext= LocalContext.current

   Column (modifier = Modifier
       .fillMaxSize()
       .padding(20.dp)){
       Text(text = "Hello Glory",
           color = Color.Red,
           fontSize = 30.sp,
           fontStyle = FontStyle.Italic,
           textDecoration = TextDecoration.Underline)

       Spacer(modifier = Modifier.height(50.dp))

       Text(text = "Welcome to Android",
           color = Color.Blue,
           fontFamily = FontFamily.Cursive,
           fontSize = 40.sp)
       Text(text = "Kotlin")

       Spacer(modifier = Modifier.height(50.dp))

       Text(text = "Jetpack compose",
           color = Color.Magenta,
           fontSize = 40.sp,
           fontFamily = FontFamily.SansSerif)

       Divider()
       Spacer(modifier = Modifier.height(30.dp))

       Row {
           Text(text = "Text1",
               fontSize = 30.sp)
           Spacer(modifier = Modifier.width(50.dp))
           Text(text = "Text2",
               fontSize = 30.sp)
       }

       Row {
           Text(text = "eMobilis",
               fontSize = 30.sp)
           Spacer(modifier = Modifier.width(50.dp))
           Text(text = "Technology",
               fontSize = 30.sp)
       }

       Box {
           Text(text = "Yes",
               fontSize = 30.sp)
           Text(text = "No",
               fontSize = 30.sp)
       }

       //Button
       Button(onClick = { /*TODO*/ },
           shape = RectangleShape,
           colors = ButtonDefaults.buttonColors(Color.Magenta)) {
           Text(text = "Click Me")
       }

       Button(onClick = { /*TODO*/ },
           shape = CutCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Magenta)) {
           Image(painter = painterResource(id = R.drawable.img_3),
               contentDescription = "")
          Text(text = "Add to cart",
              modifier = Modifier
                  .padding(start = 10.dp))
       }

       //Bordered button
       Button(onClick = { /*TODO*/ },
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp,Color.Red),
           colors = ButtonDefaults.outlinedButtonColors())
       {
             Text(text = "Bordered button")
       }

       Spacer(modifier = Modifier.height(100.dp))
       //Intent
       Button(onClick = {
                        mContext.startActivity(Intent(mContext,ImageActivity::class.java))
       },
           shape = CutCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Black),
           modifier = Modifier.padding(start = 150.dp)) {
           Text(text = "Next")
           
       }

   }


}
@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    demo()

}
