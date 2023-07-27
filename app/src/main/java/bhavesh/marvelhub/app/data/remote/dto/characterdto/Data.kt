package bhavesh.marvelhub.app.data.remote.dto.characterdto

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<Result>,
    val total: Int
)