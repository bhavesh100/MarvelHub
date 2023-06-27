package bhavesh.marvelhub.app.data.remote.dto.charactersdto

data class Stories(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemXXX>,
    val returned: Int
)