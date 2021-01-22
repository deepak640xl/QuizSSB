package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView= (TextView) findViewById(R.id.tv);





    String[] array = new String[] { "Earn","Escape","Elder","Extraordinary","Examination","Enjoy","Encourage","Efficiency","Enemy","Excuse","Fight","Fear","Future","Failure","Fair","Fellow","Follow","Friend","Foe","First","Finish","Faith","Forest","Film","Flexible","Favorite","Flowers","Family","Gun","God","Guts","Gay","Gold","Group","Guide","Guard","Girl","Gallant","Happy","Honest","Haste","Help","Height","Humorous","Holidayn","Hesitation","Home","Habit","Headmaster","Hate","Hardwork","Hand","Illiterate","Impossible","Insult","Imagination","Initiative","India","Influence","Insist","Injury","Injustice","Identity","Jump","Joke","Jungle","Joy","Jealous"};

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