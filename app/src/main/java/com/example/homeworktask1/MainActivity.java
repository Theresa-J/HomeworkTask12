package com.example.homeworktask1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    private TextView timeDisp;
    private SimpleDateFormat twelveFormat;
    private SimpleDateFormat twentyFormat;
    private Calendar cal;
    private Calendar c;
    private String time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            cal = Calendar.getInstance();
            twelveFormat = new SimpleDateFormat("hh:mm a");
            twentyFormat = new SimpleDateFormat("HH:mm");

//            String time = twelveFormat.format(cal.getTime());
//            //for Sydney's time

        ConstraintLayout button3 =findViewById(R.id.button3);
        Button twentyButton = button3.findViewById(R.id.button);
        twentyButton.setText("24-Hours");

        Button twelveButton = button3.findViewById(R.id.button2);
        twelveButton.setText("12-Hours");

        Button refreshButton = button3.findViewById(R.id.button4);
        refreshButton.setText("Refresh");

        refreshButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                ConstraintLayout bangkok = findViewById(R.id.bangkok);
                String bTime = getTwelveFormat(bTimeZone);
                TextView textBang = bangkok.findViewById(R.id.textView4);
                textBang.setText(bTime);

                ConstraintLayout tokyo = findViewById(R.id.tokyo);
                String tTime = getTwelveFormat(tTimeZone);
                TextView textTok = tokyo.findViewById(R.id.textView4);
                textTok.setText(tTime);

                ConstraintLayout ny = findViewById(R.id.ny);
                String nTime = getTwelveFormat(nTimeZone);
                TextView textNY = ny.findViewById(R.id.textView4);
                textNY.setText(nTime);

                ConstraintLayout sydney = findViewById(R.id.sydney);
                String sTime = getTwelveFormat(sTimeZone);
                TextView textSyd = sydney.findViewById(R.id.textView4);
                textSyd.setText(sTime);

                ConstraintLayout jakarta = findViewById(R.id.jakarta);
                String jTime = getTwelveFormat(jTimeZone);
                TextView textJa = jakarta.findViewById(R.id.textView4);
                textJa.setText(jTime);
            }
        });

        twentyButton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {
               ConstraintLayout bangkok = findViewById(R.id.bangkok);
               String bTime = getTwentyFormat(bTimeZone);
                TextView textBang = bangkok.findViewById(R.id.textView4);
                textBang.setText(bTime);

               ConstraintLayout tokyo = findViewById(R.id.tokyo);
               String tTime = getTwentyFormat(tTimeZone);
               TextView textTok = tokyo.findViewById(R.id.textView4);
               textTok.setText(tTime);

               ConstraintLayout ny = findViewById(R.id.ny);
               String nTime = getTwentyFormat(nTimeZone);
               TextView textNY = ny.findViewById(R.id.textView4);
               textNY.setText(nTime);

               ConstraintLayout sydney = findViewById(R.id.sydney);
               String sTime = getTwentyFormat(sTimeZone);
               TextView textSyd = sydney.findViewById(R.id.textView4);
               textSyd.setText(sTime);
               //incorrect

               ConstraintLayout jakarta = findViewById(R.id.jakarta);
               String jTime = getTwentyFormat(jTimeZone);
               TextView textJa = jakarta.findViewById(R.id.textView4);
               textJa.setText(jTime);
           }
        });

        twelveButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                ConstraintLayout bangkok = findViewById(R.id.bangkok);
                String bTime = getTwelveFormat(bTimeZone);
                TextView textBang = bangkok.findViewById(R.id.textView4);
                textBang.setText(bTime);

                ConstraintLayout tokyo = findViewById(R.id.tokyo);
                String tTime = getTwelveFormat(tTimeZone);
                TextView textTok = tokyo.findViewById(R.id.textView4);
                textTok.setText(tTime);

                ConstraintLayout ny = findViewById(R.id.ny);
                String nTime = getTwelveFormat(nTimeZone);
                TextView textNY = ny.findViewById(R.id.textView4);
                textNY.setText(nTime);

                ConstraintLayout sydney = findViewById(R.id.sydney);
                String sTime = getTwelveFormat(sTimeZone);
                TextView textSyd = sydney.findViewById(R.id.textView4);
                textSyd.setText(sTime);

                ConstraintLayout jakarta = findViewById(R.id.jakarta);
                String jTime = getTwelveFormat(jTimeZone);
                TextView textJa = jakarta.findViewById(R.id.textView4);
                textJa.setText(jTime);
            }
        });


        ConstraintLayout bangkok = findViewById(R.id.bangkok);
        ImageView imageBangkok = bangkok.findViewById(R.id.format);
        imageBangkok.setImageResource(R.drawable.bangkok);
        TextView textBangkok = bangkok.findViewById(R.id.textView);
        textBangkok.setText("Bangkok");
        String bTime = getTwelveFormat(bTimeZone);
        TextView textBang = bangkok.findViewById(R.id.textView4);
        textBang.setText(bTime);
        //correct

        ConstraintLayout tokyo = findViewById(R.id.tokyo);
        ImageView imageTokyo = tokyo.findViewById(R.id.format);
        imageTokyo.setImageResource(R.drawable.tokyo);
        TextView textTokyo = tokyo.findViewById(R.id.textView);
        textTokyo.setText("Tokyo");
        String tTime = getTwelveFormat(tTimeZone);
        TextView textTok = tokyo.findViewById(R.id.textView4);
        textTok.setText(tTime);
        //correct

        ConstraintLayout ny = findViewById(R.id.ny);
        ImageView imageNy = ny.findViewById(R.id.format);
        imageNy.setImageResource(R.drawable.ny);
        TextView textNy = ny.findViewById(R.id.textView);
        textNy.setText("New York");
        String nTime = getTwelveFormat(nTimeZone);
        TextView textNY = ny.findViewById(R.id.textView4);
        textNY.setText(nTime);
        //correct

        ConstraintLayout sydney = findViewById(R.id.sydney);
        ImageView imageSydney = sydney.findViewById(R.id.format);
        imageSydney.setImageResource(R.drawable.sydney);
        TextView textSydney = sydney.findViewById(R.id.textView);
        textSydney.setText("Sydney");
        String sTime = getTwelveFormat(sTimeZone);
        TextView textSyd = sydney.findViewById(R.id.textView4);
        textSyd.setText(sTime);
        //correct

        ConstraintLayout jakarta = findViewById(R.id.jakarta);
        TextView textJar = jakarta.findViewById(R.id.textView);
        textJar.setText("Jakarta");
        String jTime = getTwelveFormat(jTimeZone);
        TextView textJa = jakarta.findViewById(R.id.textView4);
        textJa.setText(jTime);
    }


    TimeZone bTimeZone = TimeZone.getTimeZone("Asia/Bangkok");
    TimeZone tTimeZone = TimeZone.getTimeZone("Asia/Tokyo");
    TimeZone jTimeZone = TimeZone.getTimeZone("Asia/Jakarta");
    TimeZone nTimeZone = TimeZone.getTimeZone("America/New_York");
    TimeZone sTimeZone = TimeZone.getTimeZone("Australia/Sydney");

    public String getTwelveFormat(TimeZone timeZone){
        cal = Calendar.getInstance();
        twelveFormat = new SimpleDateFormat("hh:mm a");
        twelveFormat.setTimeZone(timeZone);
        String time = twelveFormat.format(cal.getTime());
        return time;
    }

    public String getTwentyFormat(TimeZone timeZone){
        cal = Calendar.getInstance();
        twelveFormat = new SimpleDateFormat("HH:mm");
        twelveFormat.setTimeZone(timeZone);
        String time = twelveFormat.format(cal.getTime());
        return time;
    }

}
