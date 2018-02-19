package xzy.twbkg.dagger2.ui.di

import dagger.Module
import dagger.Provides
import xzy.twbkg.dagger2.ui.HomeActivity
import xzy.twbkg.dagger2.ui.main.HomeContract
import xzy.twbkg.dagger2.ui.main.HomePresenter

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
@Module
class MainActivityModule {
    @Provides
    fun provideMainView(homeActivity: HomeActivity): HomeContract.View = homeActivity

    @Provides
    fun privatePresenter(view: HomeContract.View): HomeContract.UserActionListener {
        return HomePresenter(view)
    }
}