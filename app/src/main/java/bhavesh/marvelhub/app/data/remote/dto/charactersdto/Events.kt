package bhavesh.marvelhub.app.data.remote.dto.charactersdto

data class Events(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)