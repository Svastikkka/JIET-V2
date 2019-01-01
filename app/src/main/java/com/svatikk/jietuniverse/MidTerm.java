package com.svatikk.jietuniverse;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

/**
 * Created by manshusharma on 10/06/17.
 */
public class MidTerm extends Fragment {

    private ListView listView;
    private String names[];

    WebView webView;
    SwipeRefreshLayout swipeView;
    ProgressBar progressBar;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_student_mid_term, container, false);

        webView=(WebView) rootView.findViewById(R.id.mid);
        final WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        webView.loadUrl("https://badshahsharmaforever.000webhostapp.com/index5.php");

        //add new features in web

        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setSupportZoom(false);
        webSettings.setDomStorageEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);

        swipeView=(SwipeRefreshLayout) rootView.findViewById(R.id.swipeView);
        swipeView.setColorSchemeResources(R.color.svatikk1, R.color.svatikk2, R.color.svatikk3);
        progressBar=(ProgressBar)rootView.findViewById(R.id.progressBar);
        progressBar.getSolidColor();
        progressBar.setMax(50);

        webView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                swipeView.setRefreshing(false);

                progressBar.setVisibility(View.GONE);

            }


            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);

                webView.loadUrl("file:///android_asset/Error_happens.html");
            }
        });
        swipeView.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                webView.loadUrl("https://badshahsharmaforever.000webhostapp.com/index5.php");
            }
        });


        //Add animation to opening the layout
        Animation animation = AnimationUtils.loadAnimation(getContext(), R.anim.opeaning_activity);
        webView.setAnimation(animation);


        return rootView;
    }


}
