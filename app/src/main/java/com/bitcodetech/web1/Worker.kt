package com.bitcodetech.web1

import android.os.AsyncTask

class Worker : AsyncTask<Any?, Any?, Any?>() {

    override fun doInBackground(vararg p0: Any?): Any? {
        WebUtil.basicHttpDemo("https://bitcode.in")
        return null
    }
}