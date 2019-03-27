package movaliyacable.view;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.movaliyacable.R;

public class NewConnectionActivity extends AppCompatActivity
{
    WebView webview;
    ProgressDialog pDialog;
    Button newconnection;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_newconnection);
        init();
        listener();
    }

    private void init() {

        webview = (WebView) findViewById(R.id.webview);
        newconnection=(Button)findViewById(R.id.btnnewconnection);

        newconnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = new AlertDialog.Builder(
                        NewConnectionActivity.this).create();

                // Setting Dialog Title
                alertDialog.setTitle("");

                // Setting Dialog Message
                alertDialog.setMessage("નવા કનેક્શન માટે ની તમારી વિનંતી સ્વીકારવા માં આવી છે. તાત્કાલિક જવાબ મેળવવા માટે સંપર્ક કરો...સુરેશભાઈ જાદવભાઈ મોવલિયા" +
                        "મો. ૯૮૭૯૦ ૧૨૫૧૪ ");

                // Setting Icon to Dialog
                alertDialog.setIcon(R.drawable.tick);

                // Setting OK Button
                alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Write your code here to execute after dialog closed
                        Toast.makeText(getApplicationContext(), "Thank you so much connected me", Toast.LENGTH_SHORT).show();
                    }
                });

                // Showing Alert Message
                alertDialog.show();
            }
        });
        webview.getSettings().setJavaScriptEnabled(true);
        pDialog = new ProgressDialog(NewConnectionActivity.this);
        pDialog.setTitle("Movaliya Cable");
        pDialog.setMessage("Loading...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        webview.loadUrl("https://drive.google.com/drive/u/0/my-drive?ogsrc=32f");

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


