package me.zhl.market.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * BaseActivity
 * Created by admin on 2018/2/4 0004.
 */
abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(layoutResId())
        initView()
        initListeners()
        initVars()
    }

    /**
     * Return the layout resource id
     */
    protected abstract fun layoutResId(): Int

    /**
     * Init View
     */
    protected open fun initView() {

    }

    /**
     * Init Listeners
     */
    protected open fun initListeners() {

    }

    /**
     * Init Vars
     */
    protected open fun initVars() {

    }
}