package com.example.cory.coryalfordcontacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener myOnClickListener=
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView textViewName = (TextView) findViewById(R.id.textViewName);
                        TextView textViewEmail = (TextView) findViewById(R.id.textViewPhone);
                        TextView textViewPhone = (TextView) findViewById(R.id.textViewEmail);
                        TextView textViewType = (TextView) findViewById(R.id.textViewType);

                        EditText editTextName = (EditText) findViewById(R.id.editTextName);
                        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
                        EditText editTextPhone = (EditText) findViewById(R.id.editTextPhone);
                        RadioButton rbLand = (RadioButton) findViewById(R.id.rbLand);
                        RadioButton rbCell = (RadioButton) findViewById(R.id.rbCell);

                        textViewName.setText(editTextName.getText());
                        textViewEmail.setText(editTextEmail.getText());
                        textViewPhone.setText(editTextPhone.getText());
                        if (rbLand.isChecked()) {
                            textViewType.setText(rbLand.getText());
                        }
                        if (rbCell.isChecked()) {
                            textViewType.setText(rbCell.getText());
                        }
                    }
                };
        Button save = (Button) findViewById(R.id.button);
        save.setOnClickListener(myOnClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
