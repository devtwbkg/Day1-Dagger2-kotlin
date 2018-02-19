package xzy.twbkg.dagger2.service

/**
 * Created by Wittaya Boonkong on 2/19/2018.
 */
interface ApiService {

    fun loadData(): List<String>
}

class ApiServiceImpl : ApiService {

    override fun loadData(): List<String> {
        val data = (0..100).map { "position $it" }
        return data
    }

}