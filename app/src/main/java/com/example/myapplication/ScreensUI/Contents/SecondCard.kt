import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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



@Composable
fun SecondCard(modifier: Modifier = Modifier,first :String,second :String,id : Int){
    Card(modifier = Modifier
        .height(82.7.dp),
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 20.dp
        )
    ){
     Row (
       modifier = modifier
           .background(Color.White)
           .fillMaxSize(),
         verticalAlignment =  Alignment.CenterVertically,
         horizontalArrangement = Arrangement.Center
     ){
       Box(modifier = modifier
           .weight(.7f)
           .fillMaxSize(),
           contentAlignment = Alignment.Center){
         Column (verticalArrangement = Arrangement.Center,){
             Text(text = first.uppercase(Locale.UK),
                 color = worst,
                 modifier = modifier.wrapContentWidth(),
                 textAlign =  TextAlign.Left,
                 style = TextStyle(
                     fontSize = 12.sp,
                     fontWeight = FontWeight.Medium
                 ),
                 fontFamily = FontFamily(
                     Font(R.font.intermedium)
                 ),
             )
             Text(text = second.uppercase(Locale.UK),
                 color = navColor,
                 modifier = modifier.wrapContentWidth(),
                 textAlign =  TextAlign.Left,
                 style = TextStyle(
                     fontSize = 14.sp,
                     fontWeight = FontWeight.Medium
                 ),
                 fontFamily = FontFamily(
                     Font(R.font.intermedium)
                 ),
             )

         }
          }
         Box(modifier = modifier
             .weight(.3f)
             .fillMaxSize(),
             contentAlignment = Alignment.Center) {
           Image(painter = painterResource(id = id), contentDescription = "img")
         }
     }
    }

}