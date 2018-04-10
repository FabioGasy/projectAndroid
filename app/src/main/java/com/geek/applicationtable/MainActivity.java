package com.geek.applicationtable;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText number;
    private Button ok;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = (EditText) findViewById(R.id.editText);
        ok     = (Button) findViewById(R.id.button);
        display= (TextView) findViewById(R.id.display);

        ok.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                affiherTable();
            }
        });
    }
    private void affiherTable(){
        StringBuffer contenu = new StringBuffer();
        String num = number.getText().toString();
            if (num.trim().length()>0){
                int n = Integer.parseInt(num);
                for (int i=0;i<=10;i++){
                   contenu.append(n + " x " + i + " = "+ (n * i)+"\n") ;

                }
                    display.setText(contenu);
            }else{
                Toast.makeText(MainActivity.this,"Veuillez entré un chiffre valide",Toast.LENGTH_SHORT).show();
            }


    }

}
