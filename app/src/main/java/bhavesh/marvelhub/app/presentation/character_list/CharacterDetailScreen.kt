package bhavesh.marvelhub.app.presentation.character_list

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import bhavesh.marvelhub.app.presentation.Screen


@Composable
fun CharacterDetailScreen(
    navController: NavController
){
    val context = LocalContext.current

    Box (modifier = Modifier.fillMaxSize()){
        Text(text = "Detailed screen")
        Button(onClick = {
            Toast.makeText(context,"hello", Toast.LENGTH_SHORT).show()
//            navController.navigate(Screen.CharacterListScreen.route)
        }){
            Text(text = "detailed screen")
        }
    }
}