package bhavesh.marvelhub.app.presentation.character_list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bhavesh.marvelhub.app.common.Resource
import bhavesh.marvelhub.app.domain.use_case.get_characters.GetCharactersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor (
    private val getCharactersUseCase: GetCharactersUseCase
    ) : ViewModel() {

    private val _state = mutableStateOf(CharacterListState())
    val state: State<CharacterListState> = _state

    init {
        getCharacters()
    }
    private fun getCharacters(){
        getCharactersUseCase().onEach { result ->
            when(result){
                is Resource.Success -> {
                    _state.value = CharacterListState(characters = result.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = CharacterListState(error = result.message ?: "An unexpected error occured")
                }
                is Resource.Loading -> {
                    _state.value = CharacterListState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}