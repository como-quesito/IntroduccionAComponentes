package com.example.campitos.introduccionacomponentes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.boton).setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View view) {
                                          RadioGroup grupo= (RadioGroup) findViewById(R.id.grupo1);
                                                 CheckBox caja= (CheckBox) findViewById(R.id.uno);
                                                      boolean checada=      caja.isChecked();
                                                  RadioButton bseleccionado= (RadioButton) findViewById(grupo.getCheckedRadioButtonId());
                                                            Toast.makeText(getApplicationContext(),"seleccionaste la uno? "+checada,Toast.LENGTH_SHORT).show();
                                                        }
                                                    }

        );
    }
}
