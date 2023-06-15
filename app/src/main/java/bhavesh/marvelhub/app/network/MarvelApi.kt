package bhavesh.marvelhub.app.network

import bhavesh.marvelhub.app.network.model.charactersdto.CharactersDto
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelApi {

    @GET("/v1/public/characters")
    suspend fun getAllCharacters(
        @Query("apikey")apikey:String,
        @Query("ts")ts: String,
        @Query("hash")hash: String,
        @Query("offset")offset: String
    ) : CharactersDto

    @GET("/v1/public/characters")
    suspend fun getAllSearchedCharacters(
        @Query("apikey")apikey:String,
        @Query("ts")ts: String,
        @Query("hash")hash: String,
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