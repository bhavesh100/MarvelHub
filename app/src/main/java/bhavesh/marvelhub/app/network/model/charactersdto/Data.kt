package bhavesh.marvelhub.app.network.model.charactersdto

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<Result>,
    val total: Int
)