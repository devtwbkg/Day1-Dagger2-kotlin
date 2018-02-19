package xzy.twbkg.dagger2.ui.di

import dagger.Module
import dagger.Provides
import xzy.twbkg.dagger2.service.ApiService
import xzy.twbkg.dagger2.ui.main.fragment.HomeFragment
import xzy.twbkg.dagger2.ui.main.fragment.HomeFragmentContract
import xzy.twbkg.dagger2.ui.main.fragment.HomeFragmentPresenter

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
@Module
class HomeFragmentModule {

    @Provides
    fun provideView(fragment: HomeFragment): HomeFragmentContract.View = fragment

    @Provides
    fun providePresenter(view: HomeFragmentContract.View, api: ApiService): HomeFragmentContract.UserActionListener {
        return HomeFragmentPresenter(view, api)
    }
}