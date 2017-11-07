package edu.tecii.android.aplicacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    TextView txtvw1;
    EditText edtxt;
    Button btnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button);
        txtvw1=(TextView)findViewById(R.id.textView);
        edtxt=(EditText)findViewById(R.id.editText);
        btnt=(Button)findViewById(R.id.button4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto = edtxt.getText().toString();
                txtvw1.setText(texto);
            }
        });

        btnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Activity2.class);
                startActivityForResult(intent, 0);
            }
        });
    }
}
