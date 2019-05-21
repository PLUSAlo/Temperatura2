package mx.edu.utng.aguerra.banderas2019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtPais;
    ImageView imgBandera;
    Button btnAceptar;
    Button btnNuevo;
    String [] paises{"Alemania", "Argentina", "Austria", "Australia", "Bahamas", "Brasil", "Chile", "México"};
    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inflate Relacionar los objetos de la vista con la clase controladora
        txtPais= (TextView)findById(R.id.txt_pais);
        imgBandera= (ImageView)findById(R.id.img_bandera);
        btnNuevo= (Button)findById(R.id.btn_nuevo);
        btnAceptar= (Button)findById(R.id.btn_aceptar);

        btnNuevo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Random r= new Random();
                x= r.nextInt(paises.length);
                switch (x){
                    case 0:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.alemania));
                        break;
                    case 1:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.argentina));
                        break;
                    case 2:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.austria));
                        break;
                    case 3:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.australia));
                        break;
                    case 4:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.bahamas));
                        break;
                    case 5:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.brasil));
                        break;
                    case 6:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.chile));
                        break;
                    case 7:
                        imgBandera.setBackgroundDrawable(getResources().getDrawable(R.drawable.mexico));
                        break;
                }

            }
        });

    btnAceptar,setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            String respuesta;
            String pais;
            pais= paises[x];
            respuesta= txtPais.getText().toString();
            if (respuesta.equals(pais)){
               Toast.makeText(getApplication(), "Correcto!!", Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(getApplication(), "Incorrecto, es... ", Toast.LENGTH_LONG).show();
            }
        }
        });
    }
}































