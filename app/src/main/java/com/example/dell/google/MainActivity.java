package com.example.dell.google;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private WebView webView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.google);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDisplayZoomControls(true);

        editText = (EditText) findViewById(R.id.EEEE);
        // final String url = editText.getText().toString();
        editText.isCursorVisible();


        button = (Button) findViewById(R.id.Buttonid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                load();
            }
        });
        editText.setText("Enter address: ");
        @Override
        public void onBackPressed()
        {
            if (webView.canGoBack()) {
                webView.goBack();
            } else
                finish();
        }

    public void load() {
        webView.loadUrl("https://" + editText.getText().toString());
    }

}
}
