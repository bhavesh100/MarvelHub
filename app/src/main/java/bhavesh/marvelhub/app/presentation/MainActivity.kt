package bhavesh.marvelhub.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import bhavesh.marvelhub.app.presentation.character_list.CharacterListScreen
import bhavesh.marvelhub.app.ui.theme.MarvelHubTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            MarvelHubTheme {
                Surface {
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