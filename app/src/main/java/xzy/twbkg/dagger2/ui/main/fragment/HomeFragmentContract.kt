package xzy.twbkg.dagger2.ui.main.fragment

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
interface HomeFragmentContract {
    interface View {
        fun showDetail(data: List<String>)
    }

    interface UserActionListener {
        fun loadData()
    }
}