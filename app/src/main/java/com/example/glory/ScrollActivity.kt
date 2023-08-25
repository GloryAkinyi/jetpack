package com.example.glory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()

        }
    }
}

@Composable
fun cardDemo(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(30.dp)
        .verticalScroll(rememberScrollState())) {

        Text(text = "Dashboard",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 100.dp))

        Text(text = "Types of Dogs",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)

        //Row1
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Genres of Music",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row2
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Best Swahili Dishes",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row3
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Destination",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row4
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Artists",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row5
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Chefs",
            fontSize = 20.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.Bold)
        //Row6
        Row (modifier = Modifier.horizontalScroll(rememberScrollState())){
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)){
                    Image(painter = painterResource(id = R.drawable.img_1),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "Alaskan Malamute",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "BullDog",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.width(10.dp))

            //Forth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(painter = painterResource(id = R.drawable.img_2),
                        contentDescription = "",
                        modifier = Modifier.size(150.dp))
                    Text(text = "German Shepherd",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))


    }

}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}
