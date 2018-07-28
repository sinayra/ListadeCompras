package com.listadecompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.listadecompras.entity.Market;
import com.listadecompras.persistence.ListApp;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text);

        // Put this in a different thread or use AsyncSession in greenDAO.
        // For Demo purpose, this query is made on main thread but it should in a different thread.
        Market market = ((ListApp)getApplication()).getDaoSession().getMarketDao().load(1L);

        if(market != null){
            textView.setText(market.getName());
        }
    }
}
