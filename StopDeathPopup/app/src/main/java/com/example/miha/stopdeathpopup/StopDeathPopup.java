package com.example.miha.stopdeathpopup;

import android.app.Dialog;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class StopDeathPopup extends AppCompatActivity implements View.OnClickListener {

    Button yesButton;
    Dialog dialog;
    Long waitMilliseconds = 5000L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_background_view);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        dialog = new Dialog(this);

        dialog.setContentView(R.layout.activity_stop_death_popup);
        dialog.setCanceledOnTouchOutside(false);

        yesButton = (Button) dialog.findViewById(R.id.yes_button);
        yesButton.setOnClickListener(this);

        dialog.show();
    }

    @Override
    public void onClick(View view) {
        dialog.dismiss();

        SystemClock.sleep(waitMilliseconds);

        dialog.show();
    }

}
