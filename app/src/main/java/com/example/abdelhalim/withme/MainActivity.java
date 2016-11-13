package com.example.abdelhalim.withme;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {

    EditText Et_Email, Et_Pass;
    String pass, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Et_Email = (EditText) findViewById(R.id.EmailEtx);
        Et_Pass = (EditText) findViewById(R.id.PassEtx);

        Button LoginBb = (Button) findViewById(R.id.signInBtn);

        LoginBb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii;
                ii = new Intent(MainActivity.this,PagerActivity.class);
                startActivity(ii);
            }
        });

        Button SignupBb = (Button) findViewById(R.id.signUpBtn);

        SignupBb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,SignUpFragment.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
