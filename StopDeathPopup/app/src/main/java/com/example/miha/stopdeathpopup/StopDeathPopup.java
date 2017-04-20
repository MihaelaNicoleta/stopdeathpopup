package com.example.miha.stopdeathpopup;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class StopDeathPopup extends AppCompatActivity implements View.OnClickListener {

    Button yesButton;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().setDisplayShowTitleEnabled(false);

        dialog = new Dialog(this);

        dialog.setContentView(R.layout.activity_stop_death_popup);
        yesButton = (Button) dialog.findViewById(R.id.yes_button);
        dialog.show();
    }

    @Override
    public void onClick(View view) {
        
    }
}
