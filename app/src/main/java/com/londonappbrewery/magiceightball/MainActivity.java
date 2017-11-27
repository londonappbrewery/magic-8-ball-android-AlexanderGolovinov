package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAsk = (Button) findViewById(R.id.btnAsk);

        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView displayText = (TextView) findViewById(R.id.textAsk);

                EditText questionInput = (EditText) findViewById(R.id.questionText);
                String question = questionInput.getText().toString();

                displayText.setText(question);

                Random random = new Random();
                int randomNumber = random.nextInt(5);
                int[] imageArray = {R.drawable.ball1,
                                        R.drawable.ball2,
                                        R.drawable.ball3,
                                        R.drawable.ball4,
                                        R.drawable.ball5};
                ImageView imgDisplay = (ImageView) findViewById(R.id.imgAnswer);
                imgDisplay.setImageResource(imageArray[randomNumber]);



            }
        });







    }
}
