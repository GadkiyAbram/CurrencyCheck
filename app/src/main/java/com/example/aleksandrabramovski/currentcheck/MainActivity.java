package com.example.aleksandrabramovski.currentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button mButtonTransferToDollar;
    public EditText mEditTextDollars;
    public TextView mTextViewResult;
    public String Summ;
    public String Res;
    public double mDollar;
    public int mCourse = 65;
    double mResult = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonTransferToDollar = (Button)findViewById(R.id.buttonTransferToRoubles);
        mTextViewResult = (TextView)findViewById(R.id.textViewResult);
        mEditTextDollars = (EditText)findViewById(R.id.editTextDollars);
    }


    public void onClick(View view) {
        Summ = mEditTextDollars.getText().toString();
        mDollar = Double.parseDouble(Summ);
        mResult = mDollar*mCourse;
        Res = Double.toString(mResult);
        mTextViewResult.setText("" + Res);
    }
}
