import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myapplication.R
import com.example.myapplication.ui.theme.navColor
import java.util.Locale


@Preview
@Composable
fun HomePage(modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState()),
    ) {
        ConstraintLayout(modifier = modifier.fillMaxSize().padding(bottom = 100.dp)) {
            val (firstView, secondView, thirdView, fourthView,fifthView,sixthView,seventhView,eightView,ninethView,tenth) = createRefs()
            Box(modifier = modifier
                .constrainAs(firstView) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.absoluteLeft)
                }
                .padding(top = 37.dp, start = 29.dp)){
                LogoAppName(
                    texts = "entainance",
                    style = MaterialTheme.typography.bodyLarge,
                    id = R.drawable.logo,
                    textcolor = Color.Black
                )
            }
            Box(modifier = modifier
                .size(35.dp)
                .constrainAs(secondView) {
                    top.linkTo(parent.top, margin = 42.dp)
                    end.linkTo(parent.end, margin = 29.dp)
                },
                contentAlignment = Alignment.BottomCenter){
                Icon(imageVector = Icons.Outlined.Notifications,
                    contentDescription ="noty",
                    tint = Color.Black,
                    modifier = modifier.size(35.dp)
                )
            }
            Box(modifier = modifier
                .constrainAs(thirdView) {
                    top.linkTo(secondView.bottom, margin = 22.dp)
                    end.linkTo(parent.end, margin = 29.dp)
                },
                contentAlignment = Alignment.BottomCenter){
                Row(){
                  Text(text = "slide to".uppercase(Locale.UK),
                      style = MaterialTheme.typography.bodyMedium,
                      color = navColor)
                  Text(text = "slide to".uppercase(Locale.UK),
                      modifier.padding(start = 4.dp),
                      style = MaterialTheme.typography.bodyMedium,)
                }
            }
            Box(modifier = modifier
                .height(162.dp)
                .constrainAs(fourthView) {
                    top.linkTo(thirdView.bottom, margin = 22.dp)
                    end.linkTo(parent.end, margin = 29.dp)
                    start.linkTo(parent.start, margin = 29.dp)
                },
                contentAlignment = Alignment.Center) {
                Card(modifier = Modifier.padding(horizontal = 29.dp),
                    shape = RoundedCornerShape(5.6.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    )
                ) {
                    CardTheme()
                }
            }
            Box(modifier = modifier
                .constrainAs(fifthView) {
                    top.linkTo(fourthView.bottom, margin = 15.dp)
                    end.linkTo(parent.end, margin = 29.dp)
                },
                contentAlignment = Alignment.BottomCenter){
                Row(){
                    Text(text = "COMPLETE YOURb".uppercase(Locale.UK),
                        style = MaterialTheme.typography.bodyMedium,)
                    Text(text = " PROFILE".uppercase(Locale.UK),
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = modifier.padding(start = 4.dp),
                        color = navColor)

                }
            }
            Box(modifier = modifier
                .constrainAs(sixthView) {
                    top.linkTo(fifthView.top)
                    start.linkTo(parent.absoluteLeft)
                }
                .padding(top = 37.dp, start = 29.dp)){
                LogoAppName(
                    texts = "score",
                    style = MaterialTheme.typography.bodyLarge,
                    id = R.drawable.logo,
                    textcolor = Color.Black
                )
            }
            Box(modifier = modifier
                .constrainAs(seventhView) {
                    top.linkTo(sixthView.bottom, margin = 5.dp)
                    end.linkTo(parent.end, margin = 23.dp)
                    start.linkTo(parent.start, margin = 23.dp)
                },
                contentAlignment = Alignment.Center) {
                ProgressCardView()
            }
            Row(modifier = modifier
                .constrainAs(eightView) {
                    top.linkTo(seventhView.bottom, margin = 20.dp)
                    end.linkTo(parent.end, margin = 23.dp)
                    start.linkTo(parent.start, margin = 23.dp)
                },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Box(modifier = modifier
                    .weight(.5f)
                    .padding(start = 23.dp, end = 8.dp)) {
                    SecondCard(first = "rented", second = "property", id = R.drawable.rent)
                }
                Box(modifier = modifier
                    .weight(.5f)
                    .padding(start = 8.dp, end = 23.dp)) {
                    SecondCard(first = "ongoing", second = "deals",id=R.drawable.deal)
                }
            }
            Box(modifier = modifier
                .constrainAs(ninethView) {
                    top.linkTo(eightView.bottom, margin = 15.dp)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                },
                contentAlignment = Alignment.Center) {
                DetailsMainCard()
            }
            Row(modifier = modifier
                .constrainAs(tenth) {
                    top.linkTo(ninethView.bottom, margin = 20.dp)
                    end.linkTo(parent.end, margin = 23.dp)
                    start.linkTo(parent.start, margin = 23.dp)
                },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center) {
                Box(modifier = modifier
                    .weight(.5f)
                    .padding(start = 23.dp, end = 8.dp)) {
                    ButtonCard2(first = "raise", second = "complains")
                }
                Box(modifier = modifier
                    .weight(.5f)
                    .padding(start = 8.dp, end = 23.dp)) {
                    ButtonCardView()
                }
            }


        }

    }
}