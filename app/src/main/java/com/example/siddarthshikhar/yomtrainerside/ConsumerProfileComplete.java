package com.example.siddarthshikhar.yomtrainerside;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import org.w3c.dom.Text;

/**
 * Created by Abhishek on 23-Sep-15.
 */
public class ConsumerProfileComplete extends FragmentActivity {

    private TextView consumerName,consumerAddress,consumerGender,consumerBudget,consumerNotes,monday,tuesday,wednesday,thursday,friday,saturday,sunday;
    private ImageView callBtn,acceptBtn,rejectBtn,chatBtn,shareBtn;
    GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consumer_profile_complete);

//        googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        consumerName = (TextView)findViewById(R.id.consumerName);
        consumerAddress = (TextView)findViewById(R.id.consumerAddress);
        consumerGender = (TextView)findViewById(R.id.consumerGender);
        consumerBudget = (TextView)findViewById(R.id.consumerBudget);
        consumerNotes = (TextView)findViewById(R.id.consumerNotes);

        consumerName.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Bold.ttf"));
        consumerAddress.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf"));
        consumerGender.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf"));
        consumerBudget.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf"));
        consumerNotes.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/Roboto-Regular.ttf"));

        monday = (TextView)findViewById(R.id.monday);
        tuesday = (TextView)findViewById(R.id.tuesday);
        wednesday = (TextView)findViewById(R.id.wednesday);
        thursday = (TextView)findViewById(R.id.thursday);
        friday = (TextView)findViewById(R.id.friday);
        saturday = (TextView)findViewById(R.id.saturday);
        sunday = (TextView)findViewById(R.id.sunday);

        callBtn = (ImageView)findViewById(R.id.callBtn);
        acceptBtn = (ImageView)findViewById(R.id.acceptBtn);
        rejectBtn = (ImageView)findViewById(R.id.rejectBtn);
        chatBtn = (ImageView)findViewById(R.id.chatBtn);
        shareBtn = (ImageView)findViewById(R.id.shareBtn);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9654871464"));
                startActivity(callIntent);
            }
        });

        callBtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
    }
}
