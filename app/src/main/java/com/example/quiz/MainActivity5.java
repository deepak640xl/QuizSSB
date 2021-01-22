package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);



        TextView textView= (TextView) findViewById(R.id.tv1);




        String[] array = new String[] {"Problem","Pity","Possible","Plan","Playground","Project","Punish","Pleasure","Precaution","Peace","Persuade","Praise","Puzzle","Provide","Progress","Party","Pride","Principle","Preparation","Purity","Policy","Passion","Purpose","Prosperity","Quiz","Question","Quick","Risk","Rigid","Religion","Refrain","Serious","Sympathy","Success","Solve","Service","System","Sister","Sharp","Soldier","Simple","Strategy","Surprised","Sin","Sustain","Shy","Suspense","Select","Strange","Space","Speed","Sleep","Situation","Suitable","Saint","Selfish","Travel","Trust","Team","Tired","Tackle","Time","Truth","Technology","Task","Tragedy","Typical","Thief","Torture","Test","Transparent","Teacher"};
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



    }

}