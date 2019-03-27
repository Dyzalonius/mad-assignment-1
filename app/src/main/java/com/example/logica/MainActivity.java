package com.example.logica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView columnLeft, columnMiddle;
    Button buttonSubmit;
    EditText editText1, editText2, editText3, editText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        columnLeft = findViewById(R.id.textViewColumnLeft);
        columnMiddle = findViewById(R.id.textViewColumnMiddle);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);

        columnLeft.setText(Html.fromHtml(getString(R.string.left_column)));
        columnMiddle.setText(Html.fromHtml(getString(R.string.middle_column)));

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean result = true;

                if (!editText1.getText().toString().equals("T"))
                    result = false;
                if (!editText2.getText().toString().equals("F"))
                    result = false;
                if (!editText3.getText().toString().equals("F"))
                    result = false;
                if (!editText4.getText().toString().equals("F"))
                    result = false;

                String resultText = result ? "Success" : "Not correct";
                Toast.makeText(v.getContext(), resultText, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
