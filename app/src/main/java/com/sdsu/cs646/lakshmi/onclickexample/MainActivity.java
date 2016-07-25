package com.sdsu.cs646.lakshmi.onclickexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
      int  count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView text = (TextView)findViewById(R.id.textView);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);



        Button button_sum = (Button)findViewById(R.id.button2);
        button_sum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
        EditText text1 = (EditText)findViewById(R.id.editText);
        EditText text2 = (EditText)findViewById(R.id.editText2);

         TextView text_sum = (TextView)findViewById(R.id.textView_sum);

        int number1 = Integer.parseInt((text1.getText().toString()));
        int number2 = Integer.parseInt((text2.getText().toString()));

        int result = addition(number1, number2);


        text_sum.setText(""+result);

            }
        });


    }

    @Override
    public void onClick(View view)
    {
        count();
        TextView text = (TextView)findViewById(R.id.textView_count);
        text.setText("The counter is clicked" +count+" times");



    }



    public int count()
    {
        int countedValue =0;
        countedValue = count++;
        System.out.println("The count is"+countedValue);
        return countedValue;

    }

   public int addition(int arg1, int arg2)
    {
        return arg1+arg2;
    }

}
