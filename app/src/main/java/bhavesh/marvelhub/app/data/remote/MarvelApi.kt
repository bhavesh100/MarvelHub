package bhavesh.marvelhub.app.data.remote

import bhavesh.marvelhub.app.data.remote.dto.charactersdto.CharactersDto
import bhavesh.marvelhub.app.common.Constants
import bhavesh.marvelhub.app.common.Constants.API_KEY
import bhavesh.marvelhub.app.common.Constants.timeStamp
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