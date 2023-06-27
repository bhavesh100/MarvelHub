package bhavesh.marvelhub.app.di


import bhavesh.marvelhub.app.data.remote.MarvelApi
import bhavesh.marvelhub.app.data.repository.MarvelRepositoryImpl
import bhavesh.marvelhub.app.common.Constants.BASE_URL
import bhavesh.marvelhub.app.domain.repository.MarvelRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMarvelApi() : MarvelApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MarvelApi::class.java)
    }
    @Provides
    @Singleton
    fun provideMarvelRepository(api: MarvelApi): MarvelRepository {
        return MarvelRepositoryImpl(api)
    }
}