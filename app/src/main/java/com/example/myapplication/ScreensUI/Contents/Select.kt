import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.navColor
import java.util.Locale


@Composable
fun SelectCard(modifier: Modifier = Modifier,id : Int,txt:String){
    Card(modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(30.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ){
        Box(modifier = modifier.background(Color.White),
            contentAlignment = Alignment.Center){
         Row(verticalAlignment = Alignment.CenterVertically,
             horizontalArrangement = Arrangement.Center,
             modifier = modifier.fillMaxWidth().padding(4.dp)) {
             Image(painter = painterResource(id = id), contentDescription = "content",
                 modifier = modifier.size(30.dp))
             Spacer(modifier = modifier.padding(start = 2.dp))
             Text(text = txt.uppercase(Locale.UK),
                 color = navColor,
                 style = MaterialTheme.typography.bodyMedium,
             )
         }
        }
    }
}