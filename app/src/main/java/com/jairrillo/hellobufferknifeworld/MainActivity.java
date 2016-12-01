package com.jairrillo.hellobufferknifeworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @BindView(R.id.txtText) TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnOK)
    public void doSubmit(View view) {
        Log.d("MainActivity", "That' worked");
        Toast.makeText(this, "That' worked!!: " + txtView.getText(), Toast.LENGTH_SHORT).show();
    }
}
