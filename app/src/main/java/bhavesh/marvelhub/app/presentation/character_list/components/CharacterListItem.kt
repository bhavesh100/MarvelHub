package bhavesh.marvelhub.app.presentation.character_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import bhavesh.marvelhub.app.domain.model.Character
import coil.compose.AsyncImage

@Composable
fun CharacterListItem(
    character:Character,
    onItemClick: (Character) -> Unit
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .clickable { onItemClick }
        .padding(20.dp)
    ){
        val link = "${character.thumbnail}.${character.thumbnailExt}"
        AsyncImage(model = link,contentDescription = null, modifier = Modifier.size(100.dp))
        Text(text = character.name)
    }
}