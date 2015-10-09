package com.example.siddarthshikhar.yomtrainerside.clients;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.siddarthshikhar.yomtrainerside.R;

/**
 * Created by Abhishek on 29-Sep-15.
 */
public class ClientsCustomViewHolder extends RecyclerView.ViewHolder {
    protected TextView clientName;
    protected TextView clientAddress;

    public ClientsCustomViewHolder(View itemView) {
        super(itemView);
        this.clientName = (TextView) itemView.findViewById(R.id.client_name);
        //this.consumerGender = (TextView) itemView.findViewById(R.id.consumserGender);
        this.clientAddress = (TextView) itemView.findViewById(R.id.consumerAddress);
    }
}
