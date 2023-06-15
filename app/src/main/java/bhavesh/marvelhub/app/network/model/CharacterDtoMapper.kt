package bhavesh.marvelhub.app.network.model

import bhavesh.marvelhub.app.domain.model.CharacterModel
import bhavesh.marvelhub.app.domain.util.DomainMapper
import bhavesh.marvelhub.app.network.model.charactersdto.Result

class CharacterDtoMapper : DomainMapper<Result,CharacterModel> {
    override fun mapToDomainModel(result: Result): CharacterModel {
        return CharacterModel(
            id = result.id,
            name = result.name,
            description = result.description,
            thumbnail = result.thumbnail.path,
            thumbnailExt =  result.thumbnail.extension,
            comics = result.comics.items.map {
                it.name
            }
        )
    }

    override fun mapFromDomainModel(domainModel: CharacterModel): Result {
        TODO("Not yet implemented")
    }
}