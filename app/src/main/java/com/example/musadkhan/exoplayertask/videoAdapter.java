package com.example.musadkhan.exoplayertask;

import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class videoAdapter extends RecyclerView.Adapter<videoAdapter.myviewholder>
{

    ArrayList<videomodel> videos;

    public videoAdapter(ArrayList<videomodel> videos) {
        this.videos = videos;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_video_row,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.setdata(videos.get(position));
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }





    class myviewholder extends RecyclerView.ViewHolder
    {

        VideoView videoView;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);

            videoView = itemView.findViewById(R.id.videoview);
        }

        void setdata(videomodel obj)
        {
            videoView.setVideoPath(obj.getUrl());

            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    mediaPlayer.start();
                }
            });
        }


    }
}
