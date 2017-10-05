package com.example.daniel.calculodenotas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.DecimalFormat;
import android.os.Build;
import android.renderscript.Double2;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText n1m1,n2m1,n3m1,n1m2,n2m2,n3m2,n1m3,n2m3,n3m3,n1m4,n2m4,n3m4;
    public TextView  progra,robot,seminario,sgra;
    public String note1,note2,note3,note4;
    public  double notaf;
    SharedPreferences  notas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notas  = getSharedPreferences("notas",this.MODE_PRIVATE);
        n1m1 = (EditText) findViewById(R.id.nota1M1);
        n2m1 = (EditText) findViewById(R.id.nota2M1);
        n3m1 = (EditText) findViewById(R.id.nota3M1);

        n1m2 = (EditText) findViewById(R.id.nota1M2);
        n2m2 = (EditText) findViewById(R.id.nota2M2);
        n3m2 = (EditText) findViewById(R.id.nota3M2);

        n1m3 = (EditText) findViewById(R.id.nota1M3);
        n2m3 = (EditText) findViewById(R.id.nota2M3);
        n3m3 = (EditText) findViewById(R.id.nota3M3);

        n1m4 = (EditText) findViewById(R.id.nota1M4);
        n2m4 = (EditText) findViewById(R.id.nota2M4);
        n3m4 = (EditText) findViewById(R.id.nota3M4);

        progra = (TextView)findViewById(R.id.notaFinalM1);
        robot = (TextView)findViewById(R.id.robo);
        seminario = (TextView)findViewById(R.id.nfinSeminario);
        sgra = (TextView)findViewById(R.id.sgraf);



        SharedPreferences sp = getPreferences(this.MODE_PRIVATE);
        n1m1.setText(sp.getString("n1m1",""));
        n2m1.setText(sp.getString("n2m1",""));
        n3m1.setText(sp.getString("n3m1",""));

        n1m2.setText(sp.getString("n1m2",""));
        n2m2.setText(sp.getString("n2m2",""));
        n3m2.setText(sp.getString("n3m2",""));

        n1m3.setText(sp.getString("n1m3",""));
        n2m3.setText(sp.getString("n2m3",""));
        n3m3.setText(sp.getString("n3m3",""));

        n1m4.setText(sp.getString("n1m4",""));
        n2m4.setText(sp.getString("n2m4",""));
        n3m4.setText(sp.getString("n3m4",""));



        progra.setText(sp.getString("progra","Nota final"));
        seminario.setText(sp.getString("seminario","Nota final"));
        sgra.setText(sp.getString("sgra","Nota final"));
        robot.setText(sp.getString("robot","Nota final"));

        note1 = progra.getText().toString();
        note2 = seminario.getText().toString();
        note3=robot.getText().toString();
        note4 = sgra.getText().toString();

        n1m1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note1 = calculo_nota_final(n1m1,n2m1,n3m1);
                progra.setText(note1);
                guardarNotas();
            }
        });
        n2m1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note1 = calculo_nota_final(n1m1,n2m1,n3m1);
                progra.setText(note1);
                guardarNotas();
            }
        });

        n3m1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note1 = calculo_nota_final(n1m1,n2m1,n3m1);
                progra.setText(note1);
                guardarNotas();
            }
        });

        n1m2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note2 = calculo_nota_final(n1m2,n2m2,n3m2);
                robot.setText(note2);
                guardarNotas();
            }
        });

        n2m2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note2 = calculo_nota_final(n1m2,n2m2,n3m2);
                robot.setText(note2);
                guardarNotas();
            }
        });

        n3m2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note2 = calculo_nota_final(n1m2,n2m2,n3m2);
                robot.setText(note2);
                guardarNotas();
            }
        });

        n1m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note3 = calculo_nota_final(n1m3,n2m3,n3m3);
                seminario.setText(note3);
                guardarNotas();
            }
        });

        n2m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note3 = calculo_nota_final(n1m3,n2m3,n3m3);
                seminario.setText(note3);
                guardarNotas();
            }
        });

        n3m3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note3 = calculo_nota_final(n1m3,n2m3,n3m3);
                seminario.setText(note3);
                guardarNotas();
            }
        });

        n1m4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note4 = calculo_nota_final(n1m4,n2m4,n3m4);
                sgra.setText(note4);
                guardarNotas();
            }
        });

        n2m4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note4 = calculo_nota_final(n1m4,n2m4,n3m4);
                sgra.setText(note4);
                guardarNotas();
            }
        });

        n3m4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void afterTextChanged(Editable editable) {
                note4 = calculo_nota_final(n1m4,n2m4,n3m4);
                sgra.setText(note4);
                guardarNotas();
            }
        });



    }
    public  void promedio(View v){
        double n1 = Double.valueOf(note1);
        double n2 = Double.valueOf(note2);
        double n3 = Double.valueOf(note3);
        double n4 = Double.valueOf(note4);

        notaf = ((n1+n2+n3+n4)/4);

        double f = Math.rint(notaf*1000)/1000;
        Toast.makeText(getApplicationContext(),getResources().getString(R.string.promedio)+String.valueOf(f),Toast.LENGTH_LONG).show();

    }

    public void guardarNotas(){
        SharedPreferences archivo = getPreferences(this.MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();


        editor.putString("n1m1",n1m1.getText().toString());
        editor.putString("n2m1",n2m1.getText().toString());
        editor.putString("n3m1",n3m1.getText().toString());

        editor.putString("n1m2",n1m1.getText().toString());
        editor.putString("n2m2",n2m2.getText().toString());
        editor.putString("n3m2",n3m2.getText().toString());

        editor.putString("n1m3",n1m3.getText().toString());
        editor.putString("n2m3",n2m3.getText().toString());
        editor.putString("n3m3",n3m3.getText().toString());

        editor.putString("n1m4",n1m4.getText().toString());
        editor.putString("n2m4",n2m4.getText().toString());
        editor.putString("n3m4",n3m4.getText().toString());




        editor.putString("progra",progra.getText().toString());
        editor.putString("seminario",seminario.getText().toString());
        editor.putString("sgra",sgra.getText().toString());
        editor.putString("robot",robot.getText().toString());

        editor.commit();

    }


    public String calculo_nota_final(EditText n1, EditText n2 , EditText n3){
        try{
        float nota1 = Float.valueOf(n1.getText().toString());
        float nota2 = Float.valueOf(n2.getText().toString());
        float nota3 = Float.valueOf(n3.getText().toString());

        if (nota1 >5 || nota2 >5 || nota3 > 5 || nota1 < 0 || nota2 < 0|| nota3<0){
            Toast.makeText(getApplicationContext(),getResources().getString(R.string.error),Toast.LENGTH_LONG).show();
            return "0";
        }
        else {
            double notaf = Math.rint((nota1*0.3 +nota2*0.3+nota3*0.4)*1000)/1000;
            String nf = String.valueOf(notaf);


            return (nf);
        }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),getResources().getString(R.string.error),Toast.LENGTH_LONG).show();
            return "0";
        }
    }

    public void lanzar(View view) {
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);
    }

}
