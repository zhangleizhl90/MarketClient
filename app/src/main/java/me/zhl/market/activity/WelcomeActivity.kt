package me.zhl.market.activity

import kotlinx.android.synthetic.main.activity_welcome.*
import me.zhl.market.R
import org.jetbrains.anko.clearTask
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity


/**
 * Welcome Activity, Launcher activity
 * Created by admin on 2018/2/4 0004.
 */
class WelcomeActivity : BaseActivity() {
    override fun layoutResId(): Int = R.layout.activity_welcome

    override fun initListeners() {

    }

    override fun initVars() {
        imageView.setImageResource(R.drawable.ic_launcher_background)

        goToMain()
    }

    private fun goToMain() {
        imageView.postDelayed({
            startActivity(intentFor<MainActivity>())
            finish()
        }, 3000)
    }
}