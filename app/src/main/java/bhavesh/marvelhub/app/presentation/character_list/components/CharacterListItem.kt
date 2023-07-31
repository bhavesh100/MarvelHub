package bhavesh.marvelhub.app.presentation.character_list.components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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

@SuppressLint("SuspiciousIndentation")
@Composable
fun CharacterListItem(
    character:Character,
    onItemClick: (Character) -> Unit
){
    val url = "${character.thumbnail}.${character.thumbnailExt}"
    val httpsUrl = "https"+url.substring(4)

            Card(modifier = Modifier.height(200.dp)
                .width(150.dp)
                .padding(8.dp)
                .clickable {
//                    Toast.makeText(LocalContext.current,character.name, Toast.LENGTH_SHORT).show()
                           onItemClick
                },
                shape = RoundedCornerShape(15.dp),
                elevation = CardDefaults.cardElevation(5.dp),
                border = BorderStroke(2.dp,Color.Black)
            ) {

                Box(modifier = Modifier.fillMaxSize()
                    .clickable { onItemClick }
                    .background(Color.Black)){
                    Box(modifier = Modifier.fillMaxSize()){
                        Image(painter = rememberAsyncImagePainter(model = httpsUrl),
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier.fillMaxWidth()
                                .fillMaxHeight())
                    }
                    Box(modifier = Modifier
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent,Color.Black),
                                startY = 400f
                            )
                        )
                        .fillMaxSize())
                    Box(contentAlignment = Alignment.BottomCenter,
                        modifier = Modifier.fillMaxSize()
//                            .clickable { onItemClick }
                            )
                            {
                        Text(text = character.name, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold, color = Color.White)
                    }
                }

    }
}