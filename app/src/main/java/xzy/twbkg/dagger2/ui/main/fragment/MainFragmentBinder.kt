package xzy.twbkg.dagger2.ui.main.fragment

import dagger.Module
import dagger.android.ContributesAndroidInjector
import xzy.twbkg.dagger2.ui.di.HomeFragmentModule

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
@Module
abstract class MainFragmentBinder {
    @ContributesAndroidInjector(modules = [HomeFragmentModule::class])
    abstract fun bindHomeFragment(): HomeFragment
}