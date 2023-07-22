package bhavesh.marvelhub.app.presentation.character_list.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import bhavesh.marvelhub.app.domain.model.Character
import coil.compose.rememberAsyncImagePainter

@Composable
fun CharacterListItem(
    character:Character,
    onItemClick: (Character) -> Unit
){
        val link = "${character.thumbnail}.${character.thumbnailExt}"
    val convLink = "https"+link.substring(4)

    Card(modifier = Modifier.fillMaxWidth(0.5f)
        .padding(5.dp),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(5.dp),
        border = BorderStroke(2.dp,Color.Black)
    ) {

        Box(modifier = Modifier.size(200.dp)
            .clickable { onItemClick }
            .background(Color.Black)){
                Box(modifier = Modifier.fillMaxSize()){
                    Image(painter = rememberAsyncImagePainter(model = convLink),
                        contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxWidth()
                        .fillMaxHeight())
                }
            Box(modifier = Modifier
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Transparent,Color.LightGray),
                        startY = 400f
                    )
                )
                .fillMaxSize())
                Box(contentAlignment = Alignment.BottomCenter,
                modifier = Modifier.fillMaxSize()){
                    Text(text = character.name, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color.Black)
                }
        }
    }
}