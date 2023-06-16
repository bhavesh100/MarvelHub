package bhavesh.marvelhub.app.di


import bhavesh.marvelhub.app.network.MarvelApi
import bhavesh.marvelhub.app.repository.MarvelRepository_Impl
import bhavesh.marvelhub.app.util.Constants.BASE_URL
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
    fun provideMarvelRepository(api: MarvelApi) = MarvelRepository_Impl(api)

    @Provides
    @Singleton
    fun provideMarvelApi() : MarvelApi = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(MarvelApi::class.java)
}