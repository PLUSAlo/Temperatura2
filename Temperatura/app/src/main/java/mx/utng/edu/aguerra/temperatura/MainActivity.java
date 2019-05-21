package mx.utng.edu.aguerra.temperatura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView txtGrados;
    TextView txtResultado;
    Button btnCentigrados;
    Button btnFarenheit;
    double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtGrados= (TextView)findViewById(R.id.txtGrados);
        txtResultado=(TextView)findViewById(R.id.txtResultado);
        btnFarenheit=(Button)findViewById(R.id.btnFarenheit);
        btnCentigrados=(Button)findViewById(R.id.btnCentigrados);

        btnCentigrados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText("");
                if(txtGrados.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Porfavor introduce un grado", Toast.LENGTH_SHORT).show();
                }
                else{
                    resultado= Double.parseDouble(String.valueOf(txtGrados.getText()));
                    resultado= (resultado*1.8)+32;
                    String resultadoGrado=String.valueOf(resultado);
                    txtResultado.setText(resultadoGrado);
                }
            }
        });

        btnFarenheit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtResultado.setText("");
                if(txtGrados.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"Porfavor introduce un grado", Toast.LENGTH_SHORT).show();
                }
                else{
                    resultado= Double.parseDouble(String.valueOf(txtGrados.getText()));
                    resultado= (resultado-32)/1.8;
                    String resultadoGrado=String.valueOf(resultado);
                    txtResultado.setText(resultadoGrado);
                }
            }
        });
    }

}
