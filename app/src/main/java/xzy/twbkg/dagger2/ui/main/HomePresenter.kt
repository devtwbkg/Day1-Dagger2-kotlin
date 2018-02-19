package xzy.twbkg.dagger2.ui.main

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
class HomePresenter(val view: HomeContract.View) : HomeContract.UserActionListener {
    override fun refresh() {
        view.showLoading()
    }
}