package com.example.javachip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = new MapView(this);

        RelativeLayout mapViewContainer = (RelativeLayout) findViewById(R.id.Map_View);
        mapViewContainer.addView(mapView);

        WebView webView = (WebView) findViewById(R.id.webvw);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://map.kakao.com/link/to/카카오판교오피스,37.402056,127.108212");
    }
}
