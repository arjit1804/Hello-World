package com.example.first_challange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        EditText edt1 = findViewById(R.id.et1);
        EditText edt2 = findViewById(R.id.et2);
        EditText edt3 = findViewById(R.id.et3);

        TextView tev1 = findViewById(R.id.tv1);
        TextView tev2 = findViewById(R.id.tv2);
        TextView tev3 = findViewById(R.id.tv3);

        tev1.setText("First Name = " + edt1.getText().toString());
        tev2.setText("Last Name = " + edt2.getText().toString());
        tev3.setText("Email = " + edt3.getText().toString());
    }

}