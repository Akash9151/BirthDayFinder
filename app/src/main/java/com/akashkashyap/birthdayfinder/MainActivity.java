package com.akashkashyap.birthdayfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt;
    private EditText day,month,year;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = findViewById(R.id.getresult);
        day = findViewById(R.id.editText2);
        month = findViewById(R.id.editText3);
        year = findViewById(R.id.editText4);
        result = findViewById(R.id.result);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final int d = Integer.parseInt(day.getText().toString());
                final int m = Integer.parseInt(month.getText().toString());
                final int y = Integer.parseInt(year.getText().toString());
                int ycode = yearCode(y);
                int mcode = monthCode(m);
                int ccode = centuryCode(y);
                int lcode = leapCode(y, m);

                int day = (ycode + mcode + ccode + d) -lcode;
                result.setText(getDay(day % 7));
            }
        });
    }

    public static int yearCode(int year){
        int y = year % 100;
        y = y + y / 4;
        return y%7;
    }

    public static int monthCode(int month){
        switch (month){
            case 1:
                return 0;
            case 2:
                return 3;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 6;
            case 8:
                return 2;
            case 9:
                return 5;
            case 10:
                return 0;
            case 11:
                return 3;
            case 12:
                return 5;
            default:
                return 0;
        }

    }

    public static int centuryCode(int year){
        int y = year / 100;
        switch(y % 4){
            case 0:
                return 6;
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                return 0;
        }
    }

    public static int leapCode(int year , int month){
        boolean check = checkLeapYear(year);
        if(check){
            if(month == 1 || month == 2){
                return 1;
            }
        }else
            return 0;
        return 0;
    }

    public static boolean checkLeapYear(int y){
        if(y % 4 == 0 ){
            if(y%100 ==0){
                if(y%400 == 0){
                    return true;
                }
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }

    public static String getDay(int c){
        switch(c){
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "null";
        }
    }
}
