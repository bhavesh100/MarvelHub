package bhavesh.marvelhub.app.presentation.character_list

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import bhavesh.marvelhub.app.domain.model.Character
import bhavesh.marvelhub.app.presentation.character_list.components.CharacterListItem

@Composable
fun CharacterListScreen(
//    navController: NavController,
    viewModel: CharacterListViewModel = hiltViewModel()
){
    val state = viewModel.state.value
    Box (modifier = Modifier.fillMaxSize()){
        LazyColumn (modifier = Modifier.fillMaxSize()){
            items(state.characters){character ->
                CharacterListItem(
                    character = character,
                    onItemClick = {
                    }
                )
            }
        }
        if(state.error.isNotBlank()){
            Text(
                text = state.error,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal =  20.dp)
                    .align(Alignment.Center)
            )
        }
        if (state.isLoading){
            CircularProgressIndicator(modifier = Modifier
                .align(Alignment.Center))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ShowPreview(){
    Box (modifier = Modifier.fillMaxSize()) {
        val character = Character(
        id = 1,
        name = "random",
        description = " random ",
        thumbnailExt = "f",
        thumbnail = "dg",
        comics = listOf("kkjjk","jhjjk")
    )
        CircularProgressIndicator(modifier = Modifier
            .align(Alignment.Center))
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                Row (modifier = Modifier
                .fillMaxWidth()
                .clickable {  }
                .padding(20.dp)
            ){
                Text(text = character.name)
            }
            }
        }
    }
}