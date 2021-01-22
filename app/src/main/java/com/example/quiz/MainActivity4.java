package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView textView= (TextView) findViewById(R.id.tv);





        String[] array  ={ "Kite","Kill","Lose","Love","Leader","Lonely","Luck","Loyal","Life","Lively","Land","Limit","Lazy","Language","Logic","Late","Mistake","Manager","Meet","Moral","MurdMature","Movie","Man","Mountain","Mother","Money","Music","Machine","Must","Mirror","Marriage","Mortality","Merit","Neglect","Need","Neighbour","Never","Naught","Overcome","Opposition","Overcome","Opposition","Operation","Organise","Oath","Officer"};


        textView.post(new Runnable() {
            int i = 0;
            @Override
            public void run() {



                textView.setText(array[i]);
                i++;
                if (i == array.length)
                    i = 0;
                textView.postDelayed(this, 1500);

                ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 100);
                toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 200);



            }
        });


    }}
