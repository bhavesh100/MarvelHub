package bhavesh.marvelhub.app.data.repository

import bhavesh.marvelhub.app.data.remote.MarvelApi
import bhavesh.marvelhub.app.data.remote.dto.charactersdto.CharactersDto
import bhavesh.marvelhub.app.common.Resource
import bhavesh.marvelhub.app.domain.repository.MarvelRepository
import java.lang.Exception
import javax.inject.Inject

class MarvelRepositoryImpl @Inject constructor(
    private val marvelApi: MarvelApi
) : MarvelRepository {
    override suspend fun getCharacters(): CharactersDto {
            return marvelApi.getAllCharacters()
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