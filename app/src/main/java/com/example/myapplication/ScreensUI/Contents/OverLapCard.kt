import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.cardMaintheme
import com.example.myapplication.ui.theme.worst
import java.util.Locale


@Preview
@Composable
fun DetailsMainCard(modifier: Modifier = Modifier){
    Box(modifier = Modifier
        .height(139.7.dp).shadow(10.dp),
    ){
        Box(modifier = modifier
            .background(Color.White)
            .fillMaxSize()) {
          Box(contentAlignment = Alignment.TopEnd, modifier = modifier.fillMaxSize()) {
              Image(painter = painterResource(id = R.drawable.vector), contentDescription ="vector" )
          }
            Box(contentAlignment = Alignment.TopEnd, modifier = modifier.fillMaxSize()) {
                Image(painter = painterResource(id = R.drawable.vector1), contentDescription ="vector1" )
            }
            Box(contentAlignment = Alignment.TopStart, modifier = modifier.fillMaxSize()) {
                Row(modifier = modifier.fillMaxSize()){
                    Image(painter = painterResource(id = R.drawable.mapp),
                        modifier = modifier
                            .weight(.3f)
                            .fillMaxSize()
                            .size(350.dp),
                        contentDescription ="map" )
                    Column(modifier = modifier
                        .fillMaxHeight()
                        .weight(.7f),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){

                        Text(text = "deal".uppercase(Locale.UK),
                            color = worst,
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(start = 5.dp, top = 5.dp),
                            textAlign =  TextAlign.Left,
                            style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium
                            ),
                            fontFamily = FontFamily(
                                Font(R.font.intermedium)
                            ),
                        )

                        Text(text = "manager".uppercase(Locale.UK),
                            color = Color.Black,
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(start = 5.dp, top = 5.dp),
                            textAlign =  TextAlign.Left,
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium
                            ),
                            textDecoration = TextDecoration.Underline ,
                            fontFamily = FontFamily(
                                Font(R.font.intersemibold)
                            ),
                        )

                        Text(text = "js dfjka djkf ajksd fisdai sdfia sdifiai.".uppercase(Locale.UK),
                            color = Color.Gray,
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(start = 5.dp, top = 5.dp),
                            textAlign =  TextAlign.Left,
                            style = TextStyle(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium
                            ),
                            fontFamily = FontFamily(
                                Font(R.font.intermedium)
                            ),
                        )
                        Row(modifier = modifier.padding(top = 15.dp)) {
                            Spacer(modifier = Modifier.background(Color.LightGray,
                                RoundedCornerShape(50.dp)
                            ).size(20.dp))
                            Card(modifier = Modifier.padding(start = 15.dp)
                                .height(24.7.dp),
                                shape =  RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.Transparent
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 15.dp
                                )
                            ){
                                Box(modifier = modifier.fillMaxSize().background(cardMaintheme,),
                                    contentAlignment = Alignment.Center){
                                    Text(text = "lease pending by landlord".uppercase(Locale.UK),
                                        color = Color.White,
                                        modifier = modifier
                                            .fillMaxSize()
                                            .padding(start = 5.dp, top = 5.dp),
                                        textAlign =  TextAlign.Center,
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.Medium
                                        ),
                                        fontFamily = FontFamily(
                                            Font(R.font.intersemibold)
                                        ),
                                    )
                                }
                            }
                        }

                    }
                }


            }


        }
    }
}