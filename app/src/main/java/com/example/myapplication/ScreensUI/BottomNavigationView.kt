import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.myapplication.NavScreens.Screenes
import com.example.myapplication.NavigationItems.bottomLists
import com.example.myapplication.ui.theme.navColor
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BottomBarWithFabDem( ) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            ConstraintLayout(modifier = Modifier.fillMaxSize()){
                val(bottomNavBar, fab) =createRefs()
                BottomAppBar(
                    modifier = Modifier
                        .height(65.dp)
                        .constrainAs(bottomNavBar) {
                            bottom.linkTo(parent.bottom)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        }
                        .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                        .background(navColor),
                    containerColor = navColor,
                    tonalElevation = 20.dp
                ) {
                    BottomNav(navController = navController)
                }
                Card(modifier = Modifier
                    .size(60.dp).constrainAs(fab) {
                        bottom.linkTo(bottomNavBar.top, margin = (-28).dp)
                        end.linkTo(parent.end)
                        start.linkTo(parent.start)
                    }
                    .background(Color.Transparent),
                    shape = CircleShape,
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 10.dp
                    ),
                    border = BorderStroke(4.dp, Color.White)
                ) {
                    FloatingActionButton(
                        modifier = Modifier.fillMaxSize(),
                        shape = CircleShape,
                        onClick = {
                            Screenes.home.route.let {
                                navController.navigate(it) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                            Screenes.message.route.let { navController.navigate(it) }
                        },
                        containerColor = navColor
                    ) {
                        Icon(imageVector = Icons.Filled.Add,
                            modifier = Modifier.size(40.dp),
                            contentDescription = "Add icon",
                            tint = Color.White)
                    }

                }


            }
        },

    ) {
        MainScreenNavigation(navController)
    }
}

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun MainScreenNavigation(navController: NavHostController) {
    val scope = rememberCoroutineScope()
    NavHost(navController, startDestination = Screenes.home.route) {
        composable(Screenes.home.route) {
            var isLoading by remember {
                mutableStateOf(true)
            }
            scope.launch {
                delay(5000)
                isLoading = false
            }
            ShimmerListItem(
                isLoading = isLoading,
                contentAfterLoading = {
                    HomePage()
                })

        }
        composable(Screenes.message.route) {
            MessagePage()
        }
        composable(Screenes.shopping.route){
            ShoppPage()
        }
        composable(Screenes.account.route){
            AccountPage()
        }



    }
}


@Composable
fun BottomNav(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    var selectedIndex by rememberSaveable {
        mutableIntStateOf(0)
    }
    NavigationBar( modifier = Modifier
        .fillMaxWidth()
        .height(100.dp),
        containerColor = navColor) {

        bottomLists.forEachIndexed { index, bottomNavigationModel ->
            NavigationBarItem(
                modifier = Modifier.background(navColor),
                selected = currentRoute == bottomNavigationModel.title,

                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Transparent,
                    unselectedIconColor = navColor,
                    indicatorColor = navColor
                ),
                onClick = {
                    selectedIndex = index
                    navController.popBackStack()
                    navController.navigate(bottomNavigationModel.title)


                }
                , icon = {
                    if(selectedIndex==index){
                        SelectCard(id = bottomNavigationModel.selectedIcons, txt = bottomNavigationModel.title )

                    } else{
                        Image(
                            painter = painterResource(id = bottomNavigationModel.unselectedIcons),
                            contentDescription = bottomNavigationModel.title,
                            modifier = Modifier

                        )
                    }


                })
        }

    }
}
