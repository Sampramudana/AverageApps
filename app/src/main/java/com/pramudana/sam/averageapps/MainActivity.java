package com.pramudana.sam.averageapps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMath, etLanguage, etEnglish, etMajor;
    Button btnCalculate;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLanguage = (EditText)findViewById(R.id.etLanguage);
        etMath = (EditText)findViewById(R.id.etMath);
        etEnglish = (EditText) findViewById(R.id.etEnglish);
        etMajor = (EditText)findViewById(R.id.etMajor);
        btnCalculate = (Button)findViewById(R.id.btnCalculate);
        txtResult = (TextView)findViewById(R.id.txtResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nLanguage = etLanguage.getText().toString();
                String nMath = etMath.getText().toString();
                String nEnglish = etEnglish.getText().toString();
                String nMajor = etMajor.getText().toString();

                int aLanguage = Integer.parseInt(nLanguage);
                int aMath = Integer.parseInt(nMath);
                int aEnglish = Integer.parseInt(nEnglish);
                int aMajor = Integer.parseInt(nMajor);

                int rRata = (aLanguage + aMath + aEnglish + aMajor) /4;

                if (rRata >= 0 && rRata <= 40) {
                    txtResult.setText("Result = Nilai D");
                }else if (rRata >= 41 && rRata <= 65) {
                    txtResult.setText("Result = Nilai C");
                }else if (rRata >= 66 && rRata <= 80) {
                    txtResult.setText("Result = Nilai B");
                }else if (rRata >= 81 && rRata <= 100){
                    txtResult.setText("Result = Nilai A");
                }else {
                    txtResult.setText("Your Average is Overload");
                }

            }
        });
    }
}
