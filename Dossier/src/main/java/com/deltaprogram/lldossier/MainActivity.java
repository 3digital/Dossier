package com.deltaprogram.lldossier;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import static android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity implements OnItemClickListener, View.OnClickListener {
    public Button button;
    public ListView listView;
    public TextView occupationData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }

        });
    {


    }

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent("android.intent.action.MAIN");
                ComponentName iComponentName = new ComponentName("com.ThreeDigital.bartalk", "com.ThreeDigital.bartalk.FullscreenActivity" );
                mIntent.setComponent(iComponentName);
                startActivity(mIntent);
                finish();
            }

        });
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        boolean position = false;
        Object id;
        final int listView = Log.i("ListView", "You clicked Item: " + " at position:" + position);
        // Then you start a new Activity via Intent
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        intent.putExtra("position", position);
        startActivity(intent);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}

