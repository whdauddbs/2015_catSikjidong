package com.yjm.catsikjidong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    boolean check = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox chk1 = findViewById(R.id.chk1);
        CheckBox chk2 = findViewById(R.id.chk2);
        CheckBox chk3 = findViewById(R.id.chk3);
        CheckBox chk4 = findViewById(R.id.chk4);
        CheckBox chk5 = findViewById(R.id.chk5);
        CheckBox chk6 = findViewById(R.id.chk6);
        CheckBox chk7 = findViewById(R.id.chk7);
        CheckBox chk8 = findViewById(R.id.chk8);
        CheckBox chk9 = findViewById(R.id.chk9);
        CheckBox chk10 = findViewById(R.id.chk10);

        ((Button)findViewById(R.id.btn1)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                int j = (int)(Math.random() * 5.0D);
                int k = (int)(Math.random() * 5.0D);
                int i = 0;
                MainActivity.this.check = false;
                while (i < 5) {
                    int m = 0;
                    if (chk1.isChecked() == true) {
                        m = 0 + 1;
                        if (chk2.isChecked() == true) {
                            m++;
                            if (chk3.isChecked() == true) {
                                m++;
                                if (chk4.isChecked() == true) {
                                    m++;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 1;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 3 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk3.isChecked()) {
                                if (chk4.isChecked() == true) {
                                    m++;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 2) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 2 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 2 || j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 2 || j == 3 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                }
                            }
                            continue;
                        }
                        i = m;
                        if (!chk2.isChecked()) {
                            if (chk3.isChecked() == true) {
                                m++;
                                if (chk4.isChecked() == true) {
                                    m++;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 1) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 1 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 1 || j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 1 || j == 3 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk3.isChecked()) {
                                if (chk4.isChecked() == true) {
                                    m++;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 1 || j == 2) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 1 || j == 2 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 1 || j == 2 || j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 1 || j == 2 || j == 3 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                }
                            }
                        }
                        continue;
                    }
                    i = m;
                    if (!chk1.isChecked()) {
                        if (chk2.isChecked() == true) {
                            m = 0 + 1;
                            if (chk3.isChecked() == true) {
                                m++;
                                if (chk4.isChecked() == true) {
                                    m++;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 0) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 0 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 0 || j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 0 || j == 3 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk3.isChecked()) {
                                if (chk4.isChecked() == true) {
                                    m++;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 0 || j == 2) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 0 || j == 2 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 0 || j == 2 || j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 0 || j == 2 || j == 3 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                }
                            }
                            continue;
                        }
                        i = m;
                        if (!chk2.isChecked()) {
                            if (chk3.isChecked() == true) {
                                m = 0 + 1;
                                if (chk4.isChecked() == true) {
                                    m++;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 0 || j == 1) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 0 || j == 1 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 0 || j == 1 || j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 0 || j == 1 || j == 3 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk3.isChecked()) {
                                if (chk4.isChecked() == true) {
                                    m = 0 + 1;
                                    if (chk5.isChecked() == true) {
                                        i = m + 1;
                                        if (j == 0 || j == 1 || j == 2) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        if (j == 0 || j == 1 || j == 2 || j == 4) {
                                            j = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk4.isChecked()) {
                                    if (chk5.isChecked() == true) {
                                        i = 0 + 1;
                                        if (j == 0 || j == 1 || j == 2 || j == 3) {
                                            j = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 4;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk5.isChecked()) {
                                        MainActivity.this.check = true;
                                        Toast.makeText(MainActivity.this.getApplicationContext(), "음식종류 최소 하나를 선택해주세요.", Toast.LENGTH_SHORT).show();
                                                i = 0 + 5;
                                    }
                                }
                            }
                        }
                    }
                }
                i = 0;
                while (i < 5) {
                    int m = 0;
                    if (chk6.isChecked() == true) {
                        m = 0 + 1;
                        if (chk7.isChecked() == true) {
                            m++;
                            if (chk8.isChecked() == true) {
                                m++;
                                if (chk9.isChecked() == true) {
                                    m++;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 1;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 3 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk8.isChecked()) {
                                if (chk9.isChecked() == true) {
                                    m++;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 2) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 2 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 2 || k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 2 || k == 3 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                }
                            }
                            continue;
                        }
                        i = m;
                        if (!chk7.isChecked()) {
                            if (chk8.isChecked() == true) {
                                m++;
                                if (chk9.isChecked() == true) {
                                    m++;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 1) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 1 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 1 || k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 1 || k == 3 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk8.isChecked()) {
                                if (chk9.isChecked() == true) {
                                    m++;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 1 || k == 2) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 1 || k == 2 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 1 || k == 2 || k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 1 || k == 2 || k == 3 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                }
                            }
                        }
                        continue;
                    }
                    i = m;
                    if (!chk6.isChecked()) {
                        if (chk7.isChecked() == true) {
                            m = 0 + 1;
                            if (chk8.isChecked() == true) {
                                m++;
                                if (chk9.isChecked() == true) {
                                    m++;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 0) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i++;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 0 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 2;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 0 || k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 0 || k == 3 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk8.isChecked()) {
                                if (chk9.isChecked() == true) {
                                    m++;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 0 || k == 2) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 0 || k == 2 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 0 || k == 2 || k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 0 || k == 2 || k == 3 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                }
                            }
                            continue;
                        }
                        i = m;
                        if (!chk7.isChecked()) {
                            if (chk8.isChecked() == true) {
                                m = 0 + 1;
                                if (chk9.isChecked() == true) {
                                    m++;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 0 || k == 1) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 2;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 0 || k == 1 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 3;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 0 || k == 1 || k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 0 || k == 1 || k == 3 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                }
                                continue;
                            }
                            i = m;
                            if (!chk8.isChecked()) {
                                if (chk9.isChecked() == true) {
                                    m = 0 + 1;
                                    if (chk10.isChecked() == true) {
                                        i = m + 1;
                                        if (k == 0 || k == 1 || k == 2) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 3;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        if (k == 0 || k == 1 || k == 2 || k == 4) {
                                            k = (int)(Math.random() * 5.0D);
                                            i = m;
                                            continue;
                                        }
                                        i = m + 4;
                                    }
                                    continue;
                                }
                                i = m;
                                if (!chk9.isChecked()) {
                                    if (chk10.isChecked() == true) {
                                        i = 0 + 1;
                                        if (k == 0 || k == 1 || k == 2 || k == 3) {
                                            k = (int)(Math.random() * 5.0D);
                                            continue;
                                        }
                                        i += 4;
                                        continue;
                                    }
                                    i = m;
                                    if (!chk10.isChecked()) {
                                        Toast.makeText(MainActivity.this.getApplicationContext(), "가격을 최소 하나 선택해주세요.", Toast.LENGTH_SHORT).show();
                                                MainActivity.this.check = true;
                                        i = 0 + 5;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!MainActivity.this.check) {
                    Intent intent = new Intent(MainActivity.this.getApplicationContext(), SecondActivity.class);
                    intent.putExtra("food", j);
                    intent.putExtra("price", k);
                    MainActivity.this.startActivity(intent);
                }
            }
        });
    }
}
