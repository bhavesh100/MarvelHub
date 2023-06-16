package bhavesh.marvelhub.app.repository


import bhavesh.marvelhub.app.network.model.charactersdto.CharactersDto
import bhavesh.marvelhub.app.util.Resource

interface MarvelRepository {
    suspend fun getCharacters(offset:Int): Resource<CharactersDto>
    suspend fun getAllSerchedCharacters(search: String): Resource<CharactersDto>
}