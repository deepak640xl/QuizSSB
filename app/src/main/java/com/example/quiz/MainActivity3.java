package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);




        TextView textView= (TextView) findViewById(R.id.tv1);




        String[] array = new String[] { "Atom","Assist","Agree","Affection","Accept","Attack","Afraid","Alone","Admire","Active","Attempt","Army","Able","Accomplish","Appeal","Abuse","Annoy","Award","Accident","Against","Average","Ask","Adventure","Achieve","Aim","Adversity","Attract","Approach","Aloof","Aid","Argument","Architect","Ambassador","Again","All","Aware","Adult","Boredom","Bachelor","Ballot","Barrier","Beauty","Bribe","Books","Behave","Break","Blood","Begin","Beggar","Blessing","Best","Baby","Bold","Bright","Bee","Blunder","Border","Betray","Bluff","Boss","Blame","Bilateral","Burden","Beat","Borrow","Brave","Bad","Bed","Bullet","Bully","Bomb","Cannot","Climb","Corruption","Conquer","Choice","Charity","Candle","Calm","Calamity","Character","Cooperation","Continue","Complete","Circumstances","Confidence","Careful","Compel","Captain","Cult","Clean","Cheat","Company","Congratulation","Capable","Criticize","Convince","Class","Conduct","Change","Casual","Care","Child","Cup","Cry","Cruel","Culprit","Danger","Discipline","Defence","Defeat","Decision","Dislike","Decide","Develop","Discourage","Duty","Delay","Dictator","Differ","Death","Dark","Deteriorate","Disagree","Doubt","Desire","Diversity","Darling","Dialogue","Difficult","Demand","Earn","Escape","Elder","Extraordinary","Examination","Enjoy","Encourage","Efficiency","Enemy","Excuse.","GROUP – 02 (F to J Alphabets)","Earn","Escape","Elder","Extraordinary","Examination","Enjoy","Encourage","Efficiency","Enemy","Excuse","Fight","Fear","Future","Failure","Fair","Fellow","Follow","Friend","Foe","First","Finish","Faith","Forest","Film","Flexible","Favorite","Flowers","Family","Gun","God","Guts","Gay","Gold","Group","Guide","Guard","Girl","Gallant","Happy","Honest","Haste","Help","Height","Humorous","Holidayn","Hesitation","Home","Habit","Headmaster","Hate","Hardwork","Hand","Illiterate","Impossible","Insult","Imagination","Initiative","India","Influence","Insist","Injury","Injustice","Identity","Jump","Joke","Jungle","Joy","Jealous"};
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