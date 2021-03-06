package com.example.josh.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private  Button btnSubtraction;
    private  Button btnMultiplication;
    private Button btnDivision;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.input1);
        operand2 = (EditText) findViewById(R.id.input2);

        btnAddition       = (Button) findViewById(R.id.btnAddition);
        btnSubtraction    = (Button) findViewById(R.id.btnSubtraction);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision       = (Button) findViewById(R.id.btnDivision);
        textResult        = (TextView) findViewById(R.id.textResult);

        btnAddition.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());
                double result = op1 + op2;
                textResult.setText(Double.toString(result));
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());
                double result = op1 - op2;
                textResult.setText(Double.toString(result));
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());
                double result = op1 * op2;
                textResult.setText(Double.toString(result));
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                double op1 = Double.parseDouble(operand1.getText().toString());
                double op2 = Double.parseDouble(operand2.getText().toString());
                if(op2 != 0)
                {
                    double result = op1 / op2;
                    textResult.setText(Double.toString(result));
                }
                else
                {
                    textResult.setText("0.0");
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
