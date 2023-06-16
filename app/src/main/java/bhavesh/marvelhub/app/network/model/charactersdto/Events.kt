package bhavesh.marvelhub.app.network.model.charactersdto

data class Events(
    val available: Int,
    val collectionURI: String,
    val items: List<Item>,
    val returned: Int
)