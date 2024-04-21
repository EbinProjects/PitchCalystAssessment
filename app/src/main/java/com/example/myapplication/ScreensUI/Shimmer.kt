import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myapplication.R
import com.example.myapplication.ui.theme.navColor
import java.util.Locale


@Composable
fun ShimmerListItem(
    isLoading: Boolean,
    contentAfterLoading: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    if(isLoading) {
        Column(
            modifier = modifier
                .fillMaxSize()
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
                    Box(modifier = modifier.background(Color.Transparent).height(30.dp).shimmerEffect()){

                    }
                }
                Box(modifier = modifier
                    .size(35.dp)
                    .constrainAs(secondView) {
                        top.linkTo(parent.top, margin = 42.dp)
                        end.linkTo(parent.end, margin = 29.dp)
                    }.shimmerEffect(),){

                }
                Box(modifier = modifier
                    .constrainAs(thirdView) {
                        top.linkTo(secondView.bottom, margin = 22.dp)
                        end.linkTo(parent.end, margin = 29.dp)
                    }.shimmerEffect(),){

                }
                Box(modifier = modifier.fillMaxWidth().padding(horizontal = 29.dp)
                    .height(162.dp)
                    .constrainAs(fourthView) {
                        top.linkTo(thirdView.bottom, margin = 22.dp)
                        end.linkTo(parent.end, margin = 29.dp)
                        start.linkTo(parent.start, margin = 29.dp)
                    }.shimmerEffect()) {
                    Card(modifier = Modifier.padding(horizontal = 29.dp).shimmerEffect()) {

                    }
                }
                Box(modifier = modifier.width(100.dp).height(30.dp)
                    .constrainAs(fifthView) {
                        top.linkTo(fourthView.bottom, margin = 15.dp)
                        end.linkTo(parent.end, margin = 29.dp)
                    }.shimmerEffect()){
                }
                Box(modifier = modifier.fillMaxWidth()
                    .constrainAs(sixthView) {
                        top.linkTo(fifthView.top)
                        start.linkTo(parent.absoluteLeft)
                    }
                    .padding(top = 37.dp, start = 29.dp).shimmerEffect()){
                    Box(modifier = modifier.height(30.dp).shimmerEffect()){

                    }
                }
                Box(modifier = modifier.fillMaxWidth()
                    .constrainAs(seventhView) {
                        top.linkTo(sixthView.bottom, margin = 5.dp)
                        end.linkTo(parent.end, margin = 23.dp)
                        start.linkTo(parent.start, margin = 23.dp)
                    }.shimmerEffect()) {
                    Card(modifier = Modifier
                        .height(67.7.dp).padding(horizontal = 29.dp).shimmerEffect(),
                        shape = RoundedCornerShape(5.dp),
                    ){

                    }
                }
                Row(modifier = modifier
                    .constrainAs(eightView) {
                        top.linkTo(seventhView.bottom, margin = 20.dp)
                        end.linkTo(parent.end, margin = 23.dp)
                        start.linkTo(parent.start, margin = 23.dp)
                    }.shimmerEffect(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center) {
                    Box(modifier = modifier.fillMaxWidth()
                        .weight(.5f)
                        .padding(start = 23.dp, end = 8.dp).shimmerEffect()) {
                        Card(modifier = Modifier
                            .height(82.7.dp).shimmerEffect(),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 20.dp
                            )
                        ){

                        }
                    }
                    Box(modifier = modifier
                        .weight(.5f)
                        .padding(start = 8.dp, end = 23.dp).shimmerEffect()) {
                        Card(modifier = Modifier
                            .height(82.7.dp).shimmerEffect(),
                            shape = RoundedCornerShape(5.dp),
                            elevation = CardDefaults.cardElevation(
                                defaultElevation = 20.dp
                            )
                        ){

                        }
                    }
                }
                Box(modifier = modifier.fillMaxWidth()
                    .constrainAs(ninethView) {
                        top.linkTo(eightView.bottom, margin = 15.dp)
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                    },
                    contentAlignment = Alignment.Center) {
                    Box(modifier = Modifier.fillMaxWidth().padding(horizontal = 29.dp)
                        .height(139.7.dp).shadow(10.dp).shimmerEffect(),
                    ){

                    }
                }
                Row(modifier = modifier
                    .constrainAs(tenth) {
                        top.linkTo(ninethView.bottom, margin = 20.dp)
                        end.linkTo(parent.end, margin = 23.dp)
                        start.linkTo(parent.start, margin = 23.dp)
                    },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center) {
                    Box(modifier = modifier.fillMaxWidth().padding(horizontal = 10.dp)
                        .weight(.5f).shimmerEffect()
                        .padding(start = 23.dp, end = 8.dp)) {
                    }
                    Box(modifier = modifier.fillMaxWidth().padding(horizontal = 10.dp)
                        .weight(.5f).shimmerEffect()
                        .padding(start = 23.dp, end = 8.dp)) {
                    }
                }


            }

        }
    } else {
        contentAfterLoading()
    }
}



fun Modifier.shimmerEffect(): Modifier = composed {
    var size by remember {
        mutableStateOf(IntSize.Zero)
    }
    val transition = rememberInfiniteTransition()
    val startOffsetX by transition.animateFloat(
        initialValue = -2 * size.width.toFloat(),
        targetValue = 2 * size.width.toFloat(),
        animationSpec = infiniteRepeatable(
            animation = tween(1000)
        )
    )

    background(
        brush = Brush.linearGradient(
            colors = listOf(
                Color(0xFFB8B5B5),
                Color(0xFF8F8B8B),
                Color(0xFFB8B5B5),
            ),
            start = Offset(startOffsetX, 0f),
            end = Offset(startOffsetX + size.width.toFloat(), size.height.toFloat())
        )
    )
        .onGloballyPositioned {
            size = it.size
        }
}