package kku.thanawut.easykku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private Button signInButton, signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind Widget
        signInButton = (Button) findViewById(R.id.button);
        signUpButton = (Button) findViewById(R.id.button2);
        // Sing up Controler
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SignUpActivity.class));
            }
        });



    } // Mian Medthod
} // Main Class