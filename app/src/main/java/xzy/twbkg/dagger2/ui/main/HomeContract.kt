package xzy.twbkg.dagger2.ui.main

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
interface HomeContract {
    interface View {
        fun showLoading()
    }

    interface UserActionListener {
        fun refresh()
    }
}