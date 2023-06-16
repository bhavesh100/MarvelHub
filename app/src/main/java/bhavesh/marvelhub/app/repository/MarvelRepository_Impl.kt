package bhavesh.marvelhub.app.repository

import bhavesh.marvelhub.app.network.MarvelApi
import bhavesh.marvelhub.app.network.model.charactersdto.CharactersDto
import bhavesh.marvelhub.app.util.Resource
import java.lang.Exception

class MarvelRepository_Impl(
    private val marvelApi: MarvelApi
) : MarvelRepository {
    override suspend fun getCharacters(offset: Int): Resource<CharactersDto> {
        val response = try {
            marvelApi.getAllCharacters(offset = offset.toString())
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

    override suspend fun getAllSerchedCharacters(search: String): Resource<CharactersDto> {
        val response = try {
            marvelApi.getAllSearchedCharacters(Search = search)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }
}