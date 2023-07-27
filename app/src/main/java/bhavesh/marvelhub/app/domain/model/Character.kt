package bhavesh.marvelhub.app.domain.model

data class Character(
    val id: Int,
    val name: String,
    val description: String,
    val thumbnail: String,
    val thumbnailExt: String,
    val comics: List<String>,
    val series: List<String>,
    val storyName: List<String>,
    val storyType: List<String>
)
