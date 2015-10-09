package com.example.siddarthshikhar.yomtrainerside;

import android.content.ClipData;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Abhishek on 22-Sep-15.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    protected TextView consumerName;
    protected TextView consumerAddress;
    protected TextView consumerGender;
    protected TextView consumerPhone;
    protected ImageView callBtn;
    protected ImageView shareBtn;
    protected ImageView cancelBtn;
    protected ImageView acceptBtn;
    protected ImageView chatBtn;
    public View view;
    public ClipData.Item currentItem;

    public CustomViewHolder(View itemView) {
        super(itemView);

        this.consumerName = (TextView) itemView.findViewById(R.id.consumerName);
       //this.consumerGender = (TextView) itemView.findViewById(R.id.consumserGender);
        this.consumerAddress = (TextView) itemView.findViewById(R.id.consumerAddress);
        this.callBtn = (ImageView) itemView.findViewById(R.id.callBtn);
        this.shareBtn = (ImageView)itemView.findViewById(R.id.shareBtn);
        this.cancelBtn = (ImageView)itemView.findViewById(R.id.cancel);
        this.acceptBtn = (ImageView)itemView.findViewById(R.id.acceptBtn);
        this.chatBtn = (ImageView)itemView.findViewById(R.id.chatBtn);
    }
}
