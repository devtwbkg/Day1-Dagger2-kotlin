package xzy.twbkg.dagger2.app.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import xzy.twbkg.dagger2.ui.HomeActivity
import xzy.twbkg.dagger2.ui.di.MainActivityModule
import xzy.twbkg.dagger2.ui.main.fragment.MainFragmentBinder

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
@Module
abstract class ActivityBinder {

    @ContributesAndroidInjector(modules = [MainActivityModule::class, MainFragmentBinder::class])
    abstract fun bindMainActivity(): HomeActivity
}