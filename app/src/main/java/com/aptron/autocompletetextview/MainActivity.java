package com.aptron.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
        AutoCompleteTextView atv;
        MultiAutoCompleteTextView mtv;
    String[] city={"Select your city","Delhi","Jaipur","Agra","Noida"};
    String[] technology={"java","python","c","c++","android"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        atv= findViewById(R.id.autoCompleteTextView);
        mtv= findViewById(R.id.multiAutoCompleteTextView);
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, city);
        atv.setAdapter(arrayAdapter);
        atv.setThreshold(1);
        ArrayAdapter<String> arrAd= new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, technology);
        mtv.setAdapter(arrAd);
        mtv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        mtv.setThreshold(1);
    }
}
