package com.example.siddarthshikhar.yomtrainerside.clients;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.siddarthshikhar.yomtrainerside.ConsumerProfileComplete;
import com.example.siddarthshikhar.yomtrainerside.CustomViewHolder;
import com.example.siddarthshikhar.yomtrainerside.GetConsumer;
import com.example.siddarthshikhar.yomtrainerside.R;

import java.util.List;


/**
 * Created by Abhishek on 29-Sep-15.
 */
public class ClientsRecycleAdapter extends RecyclerView.Adapter<ClientsCustomViewHolder> {
    private List<GetClients> getClientsList;
    private Context context;

    public ClientsRecycleAdapter(Context context,List<GetClients> getClientsList){
        this.context = context;
        this.getClientsList = getClientsList;
    }


    @Override
    public ClientsCustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_client_list_row,viewGroup,false);
        ClientsCustomViewHolder viewHolder = new ClientsCustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ClientsCustomViewHolder holder, int position) {
        final GetClients getClients = getClientsList.get(position);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClientsCustomViewHolder holder = (ClientsCustomViewHolder) v.getTag();
                int position = holder.getPosition();
                GetClients getClients1 = getClientsList.get(position);
                Intent consumerDetailIntent = new Intent(v.getContext(),ConsumerProfileComplete.class);
                consumerDetailIntent.putExtra("name",getClients1.getClientName());
                v.getContext().startActivity(consumerDetailIntent);
            }
        };

        holder.clientName.setText(Html.fromHtml(getClients.getClientName()));
        //customViewHolder.consumerGender.setText(Html.fromHtml(getConsumer.getConsumerGender()));
//        holder.clientAddress.setText(Html.fromHtml(getClients.getClientAddress()));

        //Handle click event on both title and image click
        holder.clientName.setOnClickListener(clickListener);
        //holder.clientAddress.setOnClickListener(clickListener);

        holder.clientName.setTag(holder);
        //holder.clientAddress.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return (null!=getClientsList ? getClientsList.size():0);
    }
}
