package me.zhl.market.activity

import android.view.Gravity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_content.*
import me.zhl.market.R

/**
 * Main Activity
 * Created by admin on 2018/2/4 0004.
 */
class MainActivity : BaseActivity() {
    override fun layoutResId(): Int = R.layout.activity_main

    override fun initView() {
        super.initView()
        setSupportActionBar(toolbar)
        title = "Main"
        toolbar.setNavigationIcon(R.drawable.ic_menu_white_24dp)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(Gravity.START)
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}