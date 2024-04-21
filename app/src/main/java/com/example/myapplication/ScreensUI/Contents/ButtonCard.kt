import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.navColor
import com.example.myapplication.ui.theme.worst
import java.util.Locale



@Preview
@Composable
fun ButtonCardView(modifier: Modifier = Modifier){
    Card(modifier = Modifier
        .height(95.7.dp),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 20.dp
        )
    ){
        Box(modifier = modifier
            .fillMaxSize()
            .background(Color.White),
            contentAlignment = Alignment.Center){
                Column (verticalArrangement = Arrangement.Top,
                    modifier = modifier
                        .fillMaxSize()
                        .padding(start = 13.dp)){
                    Spacer(modifier = modifier.padding(top=25.dp))
                    Text(text = "first".uppercase(Locale.UK),
                        color = Color.Black,
                        modifier = modifier.wrapContentWidth(),
                        textAlign =  TextAlign.Left,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        fontFamily = FontFamily(
                            Font(R.font.interbold)
                        ),
                    )
                    Row (){
                        Text(text = "bill BY".uppercase(Locale.UK),
                            color = Color.Black,
                            modifier = modifier.wrapContentWidth(),
                            textAlign =  TextAlign.Left,
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Medium
                            ),
                            fontFamily = FontFamily(
                                Font(R.font.interregular)
                            ),
                        )
                        Spacer(modifier = modifier.padding(3.dp))
                       Box(modifier = modifier
                           .width(98.dp)
                           .height(14.dp)
                           .background(
                               navColor,
                               RoundedCornerShape(50.dp)
                           )
                           .padding(horizontal = 5.dp)){
                           Text(text = "LANDLORD".uppercase(Locale.UK),
                               color = Color.White,
                               modifier = modifier.wrapContentWidth().fillMaxWidth(),
                               textAlign =  TextAlign.Center,
                               style = TextStyle(
                                   fontSize = 10.sp,
                                   fontWeight = FontWeight.Medium,
                                   letterSpacing = .4.sp
                               ),
                               fontFamily = FontFamily(
                                   Font(R.font.interbold)
                               ),
                           )
                           Spacer(modifier = modifier.padding(5.dp))

                       }
                    }

                }
            }
           

    }
}