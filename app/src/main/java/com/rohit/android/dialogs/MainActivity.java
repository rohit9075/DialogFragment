package com.rohit.android.dialogs;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        if (fab == null) throw new AssertionError();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog() {

        // creating the object of the AlertDialogFragment
        AlertDialogFragment dialogFragment = new AlertDialogFragment();

        // setCancelable(false) used to prevent dialog disappear when touch the screen out side
        dialogFragment.setCancelable(false);

        // Showing the dialog Fragment using show method.
        dialogFragment.show(getSupportFragmentManager(),"DIALOG_FRAGMENT");
    }

}
