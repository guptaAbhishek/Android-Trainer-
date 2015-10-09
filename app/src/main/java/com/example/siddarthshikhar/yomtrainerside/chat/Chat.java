package com.example.siddarthshikhar.yomtrainerside.chat;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import com.example.siddarthshikhar.yomtrainerside.R;
import com.github.nkzawa.socketio.client.IO;
import com.parse.Parse;
import com.parse.ParseAnalytics;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;
import java.net.URISyntaxException;

/**
 * Created by Abhishek on 25-Sep-15.
 */
public class Chat extends ActionBarActivity{

    private Toolbar mToolbar;
    private MenuItem mSearchAction;
    private boolean isSearchOpened = false;
    private EditText editSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

    }

    private Socket mSocket;{
        try {
            mSocket = IO.socket("http://chat.socket.io");
        }catch (URISyntaxException e){

        }
    }

}

