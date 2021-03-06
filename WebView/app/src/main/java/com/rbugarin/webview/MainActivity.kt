package com.rbugarin.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView= this.findViewById<WebView>(R.id.WebView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()
        //webView.loadUrl("https://google.com")
        webView.loadUrl("file:///android_asset/index.html")

    }
}