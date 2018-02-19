package xzy.twbkg.dagger2.ui.main.fragment

import xzy.twbkg.dagger2.service.ApiService

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
class HomeFragmentPresenter(val view: HomeFragmentContract.View, val apiService: ApiService) : HomeFragmentContract.UserActionListener {
    override fun loadData() {
        view.showDetail(apiService.loadData())
    }
}