package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);






        TextView textView= (TextView) findViewById(R.id.tv1);




        String[] array = new String[] {"Urge","Use","Upset","Virtue","Victory","Vision","Work","Women","Weak","Withdraw","Wife","Wealth","Welfare","Worry","Wisdom","Worthy","Yield","Youth","Young","Zenith","Zeal"};
        textView.post(new Runnable() {
            int i = 0;
            @Override
            public void run() {



                textView.setText(array[i]);
                i++;
                if (i == array.length)
                    i = 0;
                textView.postDelayed(this, 1200);
                ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 100);
                toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 200);




            }
        });



    }
}