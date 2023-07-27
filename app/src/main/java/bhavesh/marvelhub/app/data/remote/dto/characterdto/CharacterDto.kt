package bhavesh.marvelhub.app.data.remote.dto.characterdto

data class CharacterDto(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: Data,
    val etag: String,
    val status: String
)