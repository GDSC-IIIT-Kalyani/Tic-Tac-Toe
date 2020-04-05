package com.vs.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Random;

import hotchemi.android.rate.AppRate;

public class SinglePlayerActivity extends AppCompatActivity {
    public ImageButton btnreset;
    public Button btnclear;
    public TextView txt1;
    public TextView txt2;
    public boolean P1, P2;
    public int count = 0;
    public int num;
    public int X, Y = 0;
    public String p, comp;
    public String initp, initcomp;
    public String stat1, stat2;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);

        AppRate.with(this)
                .setInstallDays(3)
                .setLaunchTimes(3)
                .setRemindInterval(3)
                .monitor();
        AppRate.showRateDialogIfMeetsConditions(this);

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn1 = findViewById(R.id.bt1);
        btn2 = findViewById(R.id.bt2);
        btn3 = findViewById(R.id.bt3);
        btn4 = findViewById(R.id.bt4);
        btn5 = findViewById(R.id.bt5);
        btn6 = findViewById(R.id.bt6);
        btn7 = findViewById(R.id.bt7);
        btn8 = findViewById(R.id.bt8);
        btn9 = findViewById(R.id.bt9);
        txt1 = findViewById(R.id.text_view_p1);
        txt2 = findViewById(R.id.text_view_p2);
        btnreset = findViewById(R.id.btnreset);
        btnclear = findViewById(R.id.btnclear);
        P1 = true;
        p = PlayerNameActivity.p.getText().toString();
        if (p.equals("") || p.equals("Player")) {
            p = "Player ";
        }
        comp = "Computer ";
        initp = p + ": 0";
        initcomp = comp + ": 0";
        txt1.setText(initp);
        txt2.setText(initcomp);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn1.getText().equals("")) {
                    btn1.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn2.getText().equals("")) {
                    btn2.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn3.getText().equals("")) {
                    btn3.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn4.getText().equals("")) {
                    btn4.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn5.getText().equals("")) {
                    btn5.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn6.getText().equals("")) {
                    btn6.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn7.getText().equals("")) {
                    btn7.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn8.getText().equals("")) {
                    btn8.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (P1 && btn9.getText().equals("")) {
                    btn9.setText("X");
                    P1 = false;
                    P2 = true;
                    count++;
                    computer();
                }
                win();
                Draw();
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear();
            }
        });
    }

    private void computer() {
        if (P2) {
            rand();
            switch (num) {
                case 1:
                    if (btn1.getText().equals("")) {
                        btn1.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 2:
                    if (btn2.getText().equals("")) {
                        btn2.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 3:
                    if (btn3.getText().equals("")) {
                        btn3.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 4:
                    if (btn4.getText().equals("")) {
                        btn4.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 5:
                    if (btn5.getText().equals("")) {
                        btn5.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 6:
                    if (btn6.getText().equals("")) {
                        btn6.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 7:
                    if (btn7.getText().equals("")) {
                        btn7.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 8:
                    if (btn8.getText().equals("")) {
                        btn8.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
                case 9:
                    if (btn9.getText().equals("")) {
                        btn9.setText("O");
                        P1 = true;
                        count++;
                    } else if (count < 9) {
                        computer();
                    }
                    break;
            }
        }
    }

    private void rand() {
        Random random = new Random();
        num = random.nextInt(9) + 1;
    }

    private void Draw() {
        if (count == 9) {
            Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
            Clear();
        }
    }

    private void win() {
        if ((btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && btn3.getText().equals("X")) || (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && btn6.getText().equals("X")) || (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && btn9.getText().equals("X")) || (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && btn7.getText().equals("X")) || (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && btn8.getText().equals("X")) || (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText()) && btn9.getText().equals("X")) || (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && btn9.getText().equals("X")) || (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) && btn7.getText().equals("X"))) {
            X++;
            Toast.makeText(this, p + " Won!", Toast.LENGTH_SHORT).show();
            stat1 = p + ": " + X;
            txt1.setText(stat1);
            Clear();
        }
        if ((btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText()) && btn3.getText().equals("O")) || (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText()) && btn6.getText().equals("O")) || (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText()) && btn9.getText().equals("O")) || (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText()) && btn7.getText().equals("O")) || (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText()) && btn8.getText().equals("O")) || (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText()) && btn9.getText().equals("O")) || (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText()) && btn9.getText().equals("O")) || (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText()) && btn7.getText().equals("O"))) {
            Y++;
            Toast.makeText(this, "Computer" + " Won!", Toast.LENGTH_SHORT).show();
            stat2 = "Computer : " + Y;
            txt2.setText(stat2);
            Clear();
        }
    }

    private void Reset() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        txt1.setText(initp);
        txt2.setText(initcomp);
        P1 = true;
        X = 0;
        Y = 0;
    }

    private void Clear() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        count = 0;
        P1 = true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SinglePlayerActivity.this, PlayerNameActivity.class);
        startActivity(intent);
        finish();
    }
}