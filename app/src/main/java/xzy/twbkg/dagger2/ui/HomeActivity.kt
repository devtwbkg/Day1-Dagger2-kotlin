package xzy.twbkg.dagger2.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.android.synthetic.main.main_act.*
import xzy.twbkg.dagger2.R
import xzy.twbkg.dagger2.ui.main.HomeContract
import xzy.twbkg.dagger2.ui.main.fragment.HomeFragment
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), HomeContract.View, HasSupportFragmentInjector {


    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    @Inject
    lateinit var presenter: HomeContract.UserActionListener

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingAndroidInjector
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_act)

        AndroidInjection.inject(this)

        if (savedInstanceState == null) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.content_container, HomeFragment.newInstance())
                    .commit()
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        presenter.refresh()
    }

    override fun showLoading() {
        Log.d("HomeActivity ", "showLoading called.")
        tv_message.text = "showLoading called..."
    }

}
