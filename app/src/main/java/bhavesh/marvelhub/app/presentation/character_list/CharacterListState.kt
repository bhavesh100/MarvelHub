package bhavesh.marvelhub.app.presentation.character_list

import bhavesh.marvelhub.app.domain.model.Character

data class CharacterListState(
    val isLoading: Boolean = false,
    val characters: List<Character> = emptyList(),
    val error: String = ""
)
