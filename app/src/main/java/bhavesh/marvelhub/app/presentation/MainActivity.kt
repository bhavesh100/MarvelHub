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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import bhavesh.marvelhub.app.presentation.character_list.CharacterDetailScreen
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
                Surface {
                    Column {
                        TopAppBar(title = { Text(text = "MARVELHUB",
                            color = Color.White,
                            modifier = Modifier.
                            background(color = Color.Red, shape = RoundedCornerShape(5.dp))) }
                            , colors = TopAppBarDefaults.largeTopAppBarColors(
                            containerColor = Color.Transparent
                        ))
                                CharacterListScreen()

                    }
                }
            }
        }
    }
}