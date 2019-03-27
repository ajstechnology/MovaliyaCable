package movaliyacable.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;
import com.movaliyacable.R;

import movaliyacable.adsutility.AdsMobUtility;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout btnsignin,btnsignup;
    TextView ivforgot;
    TextView tvtermandcondition;
    private AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);


         inint();
    }
    public void inint()
    {
        btnsignin=(LinearLayout) findViewById(R.id.ll_btn_signIn);
        btnsignup=(LinearLayout)findViewById(R.id.ll_btn_signUp);
        ivforgot=(TextView)findViewById(R.id.iv_forgot_password) ;
        tvtermandcondition=(TextView)findViewById(R.id.txttermndcondition);



        String termsLink = " <a href=https://www.yourdomain.com/terms-conditions.html >Movaliya Cable Provider Terms & Conditions -> </a>";


        String forgotstr="Forgot Your Password ?";
        String allText =  termsLink ;

        tvtermandcondition.setMovementMethod(LinkMovementMethod.getInstance());
        tvtermandcondition.setText(Html.fromHtml(allText));

        ivforgot.setMovementMethod(LinkMovementMethod.getInstance());
        ivforgot.setText(Html.fromHtml(forgotstr));

        btnsignin.setOnClickListener(this);
        btnsignup.setOnClickListener(this);
        ivforgot.setOnClickListener(this);
        tvtermandcondition.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v==btnsignin)
        {
            Intent  i =new Intent(LoginActivity.this,Main2Activity.class);
            startActivity(i);

        }
        if(v==btnsignup)
        {
            Intent ii= new Intent(LoginActivity.this,RegisterActivity.class);
            startActivity(ii);
        }
        if(v==ivforgot)
        {
            Intent iii=new Intent(LoginActivity.this,ForgotActivity.class);
            startActivity(iii);
        }
        if(v==tvtermandcondition)
        {
            Intent iii=new Intent(LoginActivity.this,TermAndConditionActivity.class);
            startActivity(iii);
        }
    }
}
