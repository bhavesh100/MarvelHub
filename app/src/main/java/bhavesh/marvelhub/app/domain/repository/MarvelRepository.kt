package bhavesh.marvelhub.app.domain.repository


import bhavesh.marvelhub.app.data.remote.dto.charactersdto.CharactersDto
import bhavesh.marvelhub.app.common.Resource

interface MarvelRepository {
    suspend fun getCharacters(offset: String): CharactersDto
    suspend fun getAllSerchedCharacters(search: String): Resource<CharactersDto>
}