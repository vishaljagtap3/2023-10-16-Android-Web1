package com.bitcodetech.web1

import android.util.Log
import java.net.HttpURLConnection
import java.net.URL

class WebUtil {

    companion object {

        fun basicHttpDemo(url : String) {
            val webUrl = URL(url)
            val httpUrlConnection = webUrl.openConnection() as HttpURLConnection

            httpUrlConnection.connect()
            Log.e("tag", "Got response")

            val inStream = httpUrlConnection.inputStream
            val data = ByteArray(1024)
            var count = 0
            val buffer = StringBuffer()

            count = inStream.read(data);
            while(count != -1) {
                buffer.append( String(data, 0, count))
                count = inStream.read(data);
            }

            inStream.close()
            httpUrlConnection.disconnect()

            Log.e("tag", buffer.toString())
        }

    }

}