@file:Suppress("unused", "MemberVisibilityCanPrivate", "HasPlatformType")

package com.example.gdgdevfest17

import android.app.Fragment
import android.os.Bundle
import android.view.View

class MagicFragment : Fragment() {

    val lazyMagicView by lazy {
        view.findViewById<View>(404)
    }
    val cuteLazyMagicView by lazy(LazyThreadSafetyMode.NONE) {
        view.findViewById<View>(404)
    }

    lateinit var magicView: View

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        magicView = view.findViewById(404)

        lazyMagicView.visibility = View.GONE
        cuteLazyMagicView.visibility = View.VISIBLE
    }
}
