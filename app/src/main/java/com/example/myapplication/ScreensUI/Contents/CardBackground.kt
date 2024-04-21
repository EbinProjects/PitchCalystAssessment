
import android.annotation.SuppressLint
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
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
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myapplication.R
import com.example.myapplication.ui.theme.cardMaintheme
import com.example.myapplication.ui.theme.cardtheme
import java.util.Locale


@SuppressLint("SuspiciousIndentation")
@Preview
@Composable
fun CardTheme(modifier: Modifier =Modifier){
    Box(modifier = modifier
        .height(162.dp)
        .background(cardMaintheme)){
        Box(modifier=modifier.fillMaxSize()){
            Image(painter = painterResource(id = R.drawable.logoback),
                modifier= modifier
                    .fillMaxSize()
                    .alpha(.12f),
                contentDescription ="image" )
        }
        ConstraintLayout(modifier = modifier.fillMaxSize()) {
          val (first,second,third,fourth,fifth,sixth,seventh,eighth) = createRefs()
            Box(modifier = modifier
                .constrainAs(first) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
                .padding(top = 19.dp, start = 8.44.dp)){
                Text(text = "gaurav srivastava".uppercase(Locale.UK),
                    color = Color.White,
                    style = MaterialTheme.typography.bodySmall)
            }
            Box(modifier = modifier.constrainAs(second){
                top.linkTo(parent.top, margin = 13.08.dp)
                end.linkTo(parent.end, margin = 20.dp)
            }){
                Row {
                    Text(text = "share".uppercase(Locale.UK),
                        color = Color.White,
                        style = MaterialTheme.typography.bodySmall,
                    )
                    Icon(imageVector = Icons.Outlined.Share,
                        contentDescription ="share",
                        modifier = modifier
                            .size(23.dp)
                            .padding(start = 5.dp),
                        tint = Color.White)
                }

            }
            Card(modifier = Modifier
                .constrainAs(third) {
                    top.linkTo(first.bottom, margin = 20.dp)
                    start.linkTo(parent.start)
                }
                .height(59.7.dp)
                .width(154.dp),
                shape = RoundedCornerShape(bottomEnd =  6.5.dp, topEnd = 6.5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                )
            ){
              Box(modifier = modifier
                  .fillMaxSize()
                  .background(cardtheme),
                  contentAlignment = Alignment.Center){
                  LogoAppName(
                      id = R.drawable.logo2,
                      texts = "entainance", style = MaterialTheme.typography.bodyLarge,
                      textcolor =Color.White)
              }
            }
            Image(painter = painterResource(id = R.drawable.qr),
                modifier = modifier
                    .constrainAs(fourth) {
                        top.linkTo(third.bottom, margin = 5.dp)
                        start.linkTo(parent.start, margin = 9.4.dp)
                        bottom.linkTo(parent.bottom, margin = 3.dp)
                    }
                    .size(50.dp),
                contentDescription = "qr")
            Box( modifier = modifier
                .constrainAs(fifth) {
                    top.linkTo(third.bottom, margin = 5.dp)
                    start.linkTo(fourth.end, margin = 9.4.dp)
                    bottom.linkTo(parent.bottom, margin = 3.dp)
                }){
                Row() {
                    Text(text = "R Score".uppercase(Locale.UK),
                        color = Color.White,
                        style = MaterialTheme.typography.bodySmall,
                    )
                    Text(modifier= modifier.padding(start = 5.dp, bottom = 2.dp),
                        text = "450",
                        color = Color.White,
                        style = MaterialTheme.typography.labelLarge,
                    )
                }
            }
            Card(modifier = Modifier
                .constrainAs(sixth) {
                    top.linkTo(second.bottom)
                    end.linkTo(parent.end)

                }
                .height(97.7.dp)
                .width(132.64.dp),
                shape = RoundedCornerShape(topStart =  5.6.dp, bottomStart = 5.6.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                )
            ){
                Box(modifier = modifier
                    .fillMaxSize()
                    .background(Color.White)){
                    Box(modifier = modifier
                        .fillMaxSize(),
                        contentAlignment = Alignment.TopCenter){
                        Text(text = "id code - rtrgs9768".uppercase(Locale.UK),
                            color = cardMaintheme,
                            modifier = modifier.fillMaxWidth().padding(3.dp),
                            textAlign =  TextAlign.Center,
                            style = TextStyle(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium),
                            fontFamily = FontFamily(
                                Font(R.font.interextrabold)
                            ),
                        )
                    }
                    Box(modifier = modifier
                        .fillMaxSize(),
                        contentAlignment = Alignment.BottomCenter){
                        Text(text = "R score - 450".uppercase(Locale.UK),
                            color = cardMaintheme,
                            modifier = modifier.fillMaxWidth().padding(3.dp),
                            textAlign =  TextAlign.Center,
                            style = TextStyle(
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Medium),
                            fontFamily = FontFamily(
                                Font(R.font.intersemibold)
                            ),
                        )
                    }

                }

            }
            Card(modifier = Modifier
                .constrainAs(seventh) {
                    top.linkTo(sixth.top)
                    bottom.linkTo(sixth.bottom)
                    end.linkTo(parent.end)

                }
                .height(59.7.dp)
                .width(145.64.dp),
                shape = RoundedCornerShape(topStart =  6.5.dp, bottomStart = 6.5.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 20.dp
                )
            ){
                Column(modifier = modifier
                    .fillMaxSize()
                    .background(cardMaintheme) ,
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "aAdhaar - xxxx xxxx xx12".uppercase(Locale.UK),
                        color = Color.White,
                        modifier = modifier.fillMaxWidth().padding(start = 5.dp, top = 5.dp),
                        textAlign =  TextAlign.Left,
                        style = TextStyle(
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        fontFamily = FontFamily(
                            Font(R.font.intermedium)
                        ),
                    )
                    Text(text = "pan     - xxxx xxxx xx29".uppercase(Locale.UK),
                        color = Color.White,
                        modifier = modifier.fillMaxWidth().padding(start = 5.dp,top = 5.dp),
                        textAlign =  TextAlign.Left,
                        style = TextStyle(
                            fontSize = 10.sp,
                            letterSpacing = .5.sp,
                            fontWeight = FontWeight.Medium),
                        fontFamily = FontFamily(
                            Font(R.font.intermedium)
                        ),
                    )
                }
            }
            Box(modifier = Modifier
                .constrainAs(eighth) {
                    top.linkTo(sixth.bottom)
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)

                }){
                Text(text = "Residential tenant".uppercase(Locale.UK),
                    color = Color.Gray,
                    style = MaterialTheme.typography.bodySmall,
                )
            }

        }

    }

}