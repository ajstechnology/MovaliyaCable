package movaliyacable.view;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.movaliyacable.R;

public class TermAndConditionActivity extends AppCompatActivity
{
    WebView webview;
    ProgressDialog pDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_termandcondition);
        init();
        listener();
    }
    private void init() {

            webview = (WebView) findViewById(R.id.webview);
            webview.getSettings().setJavaScriptEnabled(true);
            pDialog = new ProgressDialog(TermAndConditionActivity.this);
            pDialog.setTitle("PDF");
            pDialog.setMessage("Loading...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(false);
            webview.loadUrl("https://drive.google.com/file/d/0B534aayZ5j7Yc3RhcnRlcl9maWxl/view");

        }

        private void listener() {
            webview.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon) {
                    super.onPageStarted(view, url, favicon);
                    pDialog.show();
                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    pDialog.dismiss();
                }
            });
        }
    }

