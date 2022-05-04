package com.example.infernodewebview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    private WebView web1;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layoutfragment1, container, false);

        web1 = view.findViewById(R.id.web1);

        WebSettings ws = web1.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        web1.setWebViewClient(new WebViewClient());
        web1.loadUrl("https://www.twitch.tv");
        return view;
    }
}
