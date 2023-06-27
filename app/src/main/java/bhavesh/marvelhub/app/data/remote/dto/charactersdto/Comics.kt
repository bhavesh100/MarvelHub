package bhavesh.marvelhub.app.data.remote.dto.charactersdto

data class Comics(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)