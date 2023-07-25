package bhavesh.marvelhub.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import bhavesh.marvelhub.app.presentation.character_list.CharacterListScreen
import bhavesh.marvelhub.app.ui.theme.MarvelHubTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            MarvelHubTheme {
                Column {
                    Surface {
                        TopAppBar(title = { Text(text = "MARVELHUB", color = Color.White, modifier = Modifier.background(color = Color.Red, shape = RoundedCornerShape(5.dp))) }, colors = TopAppBarDefaults.largeTopAppBarColors(
                            containerColor = Color.Transparent
                        ))
                        }
                        CharacterListScreen()
                }

//                    val navController = rememberNavController()
//                    NavHost(navController = navController,
//                        startDestination = Screen.CharacterListScreen.route
//                    ){
//                        composable(
//                            route = Screen.CharacterListScreen.route
//                        ){
//                            CharacterListScreen(navController)
//                        }
//                    }
//                }
            }
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MarvelHubTheme {
        Greeting("Android")
    }
}