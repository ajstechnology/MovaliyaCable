package movaliyacable.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.ads.AdView;
import com.movaliyacable.R;
import movaliyacable.adsutility.AdsMobUtility;

public class ForgotActivity  extends AppCompatActivity
{
    private AdView mAdView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_forgot);


        mAdView = (AdView) findViewById(R.id.adView);
        AdsMobUtility.initAdsMob(ForgotActivity.this);
        AdsMobUtility.bannerAd(ForgotActivity.this, mAdView);


    }


}
