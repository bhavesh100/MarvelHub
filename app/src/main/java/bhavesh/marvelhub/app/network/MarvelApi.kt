package bhavesh.marvelhub.app.network

import bhavesh.marvelhub.app.network.model.charactersdto.CharactersDto
import bhavesh.marvelhub.app.util.Constants
import bhavesh.marvelhub.app.util.Constants.API_KEY
import bhavesh.marvelhub.app.util.Constants.timeStamp
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApi {

    @GET("characters")
    suspend fun getAllCharacters(
        @Query("apikey")apikey:String = API_KEY,
        @Query("ts")ts: String = timeStamp,
        @Query("hash")hash: String = Constants.hash(),
        @Query("offset")offset: String
    ) : CharactersDto

    @GET("characters")
    suspend fun getAllSearchedCharacters(
        @Query("apikey")apikey:String = API_KEY,
        @Query("ts")ts: String = timeStamp,
        @Query("hash")hash: String = Constants.hash(),
        @Query("nameStartsWith")Search: String
    ) : CharactersDto

//    @GET("/v1/public/characters")
//    suspend fun getAllCharacterById(
//        @Query("apikey")apikey:String,
//        @Query("ts")ts: String,
//        @Query("hash")hash: String,
//        @Query("offset")offset: String
//    ) : CharacterDto
}