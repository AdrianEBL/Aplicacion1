package edu.tecii.android.aplicacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView txtvw1;
    EditText edtxt1;
    EditText edtxt2;
    Button btn1;
    Button btn2;
    Button btnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtvw1=(TextView)findViewById(R.id.textView2);
        edtxt1=(EditText)findViewById(R.id.editText2);
        edtxt2=(EditText)findViewById(R.id.editText3);
        btn1=(Button)findViewById(R.id.button2);
        btn2=(Button)findViewById(R.id.button3);
        btnv=(Button)findViewById(R.id.button5);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String et1 = edtxt1.getText().toString();
                    if (!et1.isEmpty()){
                        double grc = Double.parseDouble(et1);
                        double grf = ((9*grc)/5)+32;
                        edtxt2.setText(String.format("%.2f", grf));
                    } else {
                        Toast.makeText(getApplicationContext(), "Por favor inserta una" +
                                "\ncantidad de grados \ncentigrados para convertirlos" +
                                "\na grados fahrenheit", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error en el tipo de datos ingresados" +
                            "\nSolo se aceptan numeros decimales (5.43)", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                try{
                    String et2 = edtxt2.getText().toString();
                    if (!et2.isEmpty()){
                        double grf = Double.parseDouble(et2);
                        double grc = ((grf-32)*5)/9;
                        edtxt1.setText(String.format("%.2f", grc));
                    } else {
                        Toast.makeText(getApplicationContext(), "Por favor inserta una" +
                                "\ncantidad de grados \nfahrenheit para convertirlos" +
                                "\na grados centigrados", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(), "Error en el tipo de datos ingresados" +
                            "\nSolo se aceptan numeros decimales (5.43)", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(view.getContext(), MainActivity.class);
                startActivityForResult(intent2, 0);
            }
        });
    }
}
