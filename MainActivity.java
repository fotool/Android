package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    TextView tvResult1;       //tvResult1 : a팀 득점화면
    TextView tvResult2;       //tvResult2 : b팀 득점화면

    int A = 0;      // a팀 점수
    int suma = 0;   // a팀 점수 누계
    int B = 0;      // b팀 점수
    int sumb = 0;   // b팀 점수 누계


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult1 = findViewById(R.id.tvResult1);        //a팀 득점화면
        tvResult2 = findViewById(R.id.tvResult2);        //b팀 득점화면
    }

    public void onBtnClick(View view){
        switch (view.getId()) {
            case R.id.btnA:
                A ++;
                if((A<0) || (A>=16)){
                    A = 0;
                    }
                tvResult1.setText(Integer.toString(A));
                    break;

            case R.id.btna:
                A --;
                if((A<0) || (A>=16)){
                    A = 0;
                }
                    tvResult1.setText(Integer.toString(A));
                    break;
                    case R.id.btnB:
                B ++;
                if((B<0) || (B>=16)){
                    B = 0;
                }
                tvResult2.setText(Integer.toString(B));
                break;

            case R.id.btnb:
                B --;
                if((B<0) || (B>=16)){
                    B = 0;
                }
                    tvResult2.setText(Integer.toString(B));
                break;
        }
    }
}

