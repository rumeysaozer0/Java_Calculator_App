package com.rumeysaozer.javacalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.rumeysaozer.javacalculatorapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.bolme.setOnClickListener(v->{
            bolme();
        });
        binding.toplama.setOnClickListener(v->{
            toplama();
        });
        binding.carpma.setOnClickListener(v->{
            carpma();
        });
        binding.cikarma.setOnClickListener(v->{
            cikarma();
        });
    }
    public void toplama(){
        if(binding.number1.getText().toString().matches("")|| binding.number2.getText().toString().matches("")){
            binding.textView.setText("Enter number!!");
        }
        else{
            int number1 =   Integer.parseInt(binding.number1.getText().toString());
            int number2 = Integer.parseInt(binding.number2.getText().toString());
            int result = number1 + number2;
            binding.textView.setText("Result = "+result);
        }
    }
    public void cikarma(){
        if(binding.number1.getText().toString().matches("")|| binding.number2.getText().toString().matches("")){
            binding.textView.setText("Enter number!!");
        }
        else{
            int number1 =   Integer.parseInt(binding.number1.getText().toString());
            int number2 = Integer.parseInt(binding.number2.getText().toString());
            int result = number1 - number2;
            binding.textView.setText("Result = "+result);
        }
    }
    public void carpma(){
        if(binding.number1.getText().toString().matches("")|| binding.number2.getText().toString().matches("")){
            binding.textView.setText("Enter number!!");
        }
        else{
            int number1 =   Integer.parseInt(binding.number1.getText().toString());
            int number2 = Integer.parseInt(binding.number2.getText().toString());
            int result = number1 * number2;
            binding.textView.setText("Result = "+result);
        }
    }
    public void bolme(){
        if(binding.number1.getText().toString().matches("")|| binding.number2.getText().toString().matches("")){
            binding.textView.setText("Enter number!!");
        }
        else{
            int number1 =   Integer.parseInt(binding.number1.getText().toString());
            int number2 = Integer.parseInt(binding.number2.getText().toString());
            int result = number1 / number2;
            binding.textView.setText("Result = "+result);
        }
    }

}