package com.example.siddarthshikhar.yomtrainerside;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Abhishek on 06-Oct-15.
 */
public class FavouritesClassesAdapter extends RecyclerView.Adapter<CustomViewHolder> implements PostRequestAsyncTask.RequestDoneTaskListener {
    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void processEnquiries(Boolean ifExecuted, String output, int typeOfError) {

    }
}
