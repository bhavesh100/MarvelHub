package bhavesh.marvelhub.app.presentation

sealed class Screen(val route: String){
    object CharacterListScreen: Screen("character_list")
}
