package randomperson.cleanarchitecture.framg.com.koin_mvvm_randomperson.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<VieModel : BaseViewModel> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getViewRes())
    }

    abstract fun getViewRes(): Int
    fun addFragment(fragment: Fragment, container: Int, tag: String, isAddBackStack: Boolean?) {
        supportFragmentManager.apply {
            beginTransaction().apply {
                add(container, fragment)
                if (isAddBackStack == true) addToBackStack(tag)
                commit()
            }
        }
    }
}