package com.example.musadkhan.exoplayertask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;



import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {



    ViewPager2 viewPager2;
    ArrayList<videomodel> videos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);
        videos = new ArrayList<>();

        videomodel ob1 = new videomodel("https://joy.videvo.net/videvo_files/video/free/2019-11/large_watermarked/190301_1_25_11_preview.mp4");
        videomodel ob2 = new videomodel("https://joy.videvo.net/videvo_files/video/free/2019-11/large_watermarked/190301_1_25_03_preview.mp4");
        videomodel ob3 = new videomodel("https://joy.videvo.net/videvo_files/video/free/2021-03/large_watermarked/210203_01_Outdoors_4k_020_preview.mp4");
        videomodel ob4 = new videomodel("https://joy.videvo.net/videvo_files/video/free/2019-11/large_watermarked/190301_1_25_10_preview.mp4");
        videomodel ob5 = new videomodel("https://joy.videvo.net/videvo_files/video/free/2019-08/large_watermarked/190301_02_KenyaWildlife_16_preview.mp4");
        videomodel ob6 = new videomodel("https://cdn.videvo.net/videvo_files/video/premium/video0314/large_watermarked/601-2_601-8705_preview.mp4");


        videos.add(ob1);
        videos.add(ob2);
        videos.add(ob3);
        videos.add(ob4);
        videos.add(ob5);
        videos.add(ob6);

        viewPager2.setAdapter(new videoAdapter(videos));

    }


}