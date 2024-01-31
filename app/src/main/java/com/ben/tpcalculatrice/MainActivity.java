package com.ben.tpcalculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText _edtPremier,_edtSecond;
    TextView _txtResultat;
    Button _btnSom,_btnSou,_btnMul,_btnDiv, _btnMod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _edtPremier = findViewById(R.id.edtPremier);
        _edtSecond = findViewById(R.id.edtSecond);
        _txtResultat = findViewById(R.id.txtResultat);
        _btnSom = findViewById(R.id.btnSom);
        _btnSou = findViewById(R.id.btnSou);
        _btnMul = findViewById(R.id.btnMul);
        _btnDiv = findViewById(R.id.btnDiv);
        _btnMod = findViewById(R.id.btnMod);
        _btnSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_edtPremier.getText().toString().equals("") || _edtPremier.getText().toString().equals(".") || _edtSecond.getText().toString().equals(".") ||_edtPremier.getText().toString() == null || _edtSecond.getText().toString().equals("") ||_edtSecond.getText().toString() == null)
                {
                    Toast.makeText(getApplicationContext(),"données manquantes!",Toast.LENGTH_LONG).show();
                    return;
                }
                float x1 = Float.parseFloat(_edtPremier.getText().toString());
                float x2 = Float.parseFloat(_edtSecond.getText().toString());
                DecimalFormat f = new DecimalFormat("#.##");
                float y = x1+ x2;
                String formattedValue = f.format(y);

                _txtResultat.setText(String.valueOf(formattedValue));
            }
        });






    }
}