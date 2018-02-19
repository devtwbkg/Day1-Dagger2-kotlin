package xzy.twbkg.dagger2.app.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import xzy.twbkg.dagger2.MainApplication

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */


interface ComponentBuilder<out C> {
    fun build(): C
}

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBinder::class])
interface AppComponent {

    fun inject(application: MainApplication)

    @Component.Builder
    interface Builder : ComponentBuilder<AppComponent> {

        /**
         * will allow clients of this builder to pass their own instances,
         * and those instances can be injected within the component
         */
        @BindsInstance
        fun application(application: Application): Builder
    }

}