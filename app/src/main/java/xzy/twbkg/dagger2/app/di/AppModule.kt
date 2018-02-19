package xzy.twbkg.dagger2.app.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import xzy.twbkg.dagger2.service.ApiService
import xzy.twbkg.dagger2.service.ApiServiceImpl

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
@Module
class AppModule {

    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideApiServide(): ApiService = ApiServiceImpl()
}