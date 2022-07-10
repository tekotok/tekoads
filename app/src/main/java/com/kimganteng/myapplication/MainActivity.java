package com.kimganteng.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.aliendroid.alienads.AlienOpenAds;
import com.aliendroid.alienads.AliendroidBanner;
import com.aliendroid.alienads.AliendroidInitialize;
import com.aliendroid.alienads.AliendroidIntertitial;
import com.aliendroid.alienads.AliendroidMediumBanner;
import com.aliendroid.alienads.AliendroidNative;
import com.aliendroid.alienads.AliendroidReward;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlienOpenAds.LoadOpenAds("");
        RelativeLayout layAds = findViewById(R.id.layAds);
        RelativeLayout layNative = findViewById(R.id.layNative);
        AliendroidInitialize.SelectAdsAdmob(this,"KOSONG","12345678");
        AliendroidNative.SmallNativeAdmob(this,layAds,"KOSONG","XXca-app-pub-3940256099942544/2247696110","342342352",
                "","","","","");
        //AliendroidMediumBanner.MediumBannerIron(this,layNative,"","Home_Screen","");

        //AliendroidReward.LoadRewardAdmob(this,"APPLOVIN-D","ca-app-pub-3940256099942544/5224354917","");
        AliendroidIntertitial.LoadIntertitialAdmob(this,"KOSONG","DefaultInterstitial","KOSONG","a","b","c","d","e");

    }

    public void showreward(View view){

        AliendroidIntertitial.ShowIntertitialAdmob(MainActivity.this,"KOSONG","DefaultInterstitial","",0,"a","b","c","d","e");
        //AliendroidReward.ShowRewardAdmob(MainActivity.this,"APPLOVIN-D","ca-app-pub-3940256099942544/5224354917","");
    }
}