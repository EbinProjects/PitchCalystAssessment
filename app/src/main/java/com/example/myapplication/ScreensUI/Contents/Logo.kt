import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.text


@Composable
fun LogoAppName(
    modifier: Modifier = Modifier,
    texts: String,
    style: TextStyle,
    id: Int,
    textcolor: Color
){
    Box(modifier = modifier.background(Color.Transparent).height(30.dp)){
        Row {
            Image(modifier = modifier.padding(bottom = 3.dp),
                painter = painterResource(id = id),
                contentDescription ="logo" )
            Box(modifier.fillMaxHeight().wrapContentWidth(),
                contentAlignment = Alignment.BottomStart) {
                Text(text = texts,
                    color = textcolor,
                    style = style,
                )
            }

        }
    }

}