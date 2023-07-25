package bhavesh.marvelhub.app.domain.use_case.get_characters

import bhavesh.marvelhub.app.common.Resource
import bhavesh.marvelhub.app.domain.model.Character
import bhavesh.marvelhub.app.domain.repository.MarvelRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(
    private val repository: MarvelRepository
) {
    operator fun invoke(): Flow<Resource<List<Character>>> = flow {
        try {
            emit(Resource.Loading())
            val characters = repository.getCharacters().data.results.map { it.toCharacter() }
            emit(Resource.Success(characters))
        } catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException){
            emit(Resource.Error("Couldn't reach server. Check your internet connect"))
        }
    }
}