package com.example.can_karademir_biography_app

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class BlogActivity : AppCompatActivity() {

    lateinit var projectWebwiew: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        val url = "https://github.com/cankarademir";
        projectWebwiew =findViewById(R.id.webwiew1)
        projectWebwiew.settings.javaScriptEnabled = true
        projectWebwiew.webViewClient = customWebViewClient()
        projectWebwiew.loadUrl(url)
    }
    class customWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            Log.d("shouldOverrideUrlLoading", "Loading")
            return super.shouldOverrideUrlLoading(view, request)
        }
    }
}