package com.example.conversiondhyeydavev1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    private EditText milesEditText;
    private Button convertButton;
    private TextView kilometersTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milesEditText = findViewById(R.id.edit_text_miles);
        convertButton = findViewById(R.id.button_convert);
        kilometersTextView = findViewById(R.id.text_view_kilometers);
        Button convertButton = findViewById(R.id.button_convert);
        convertButton.setBackgroundColor(getResources().getColor(R.color.my_yellow_color));

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertMilesToKilometers();
            }
        });
    }

    private void convertMilesToKilometers() {
        double miles = Double.parseDouble(milesEditText.getText().toString());
        double kilometers = miles * 1.60934;
        String result = String.format("%.2f kilometers", kilometers);
        kilometersTextView.setText(result);

        Animation slideInAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_in_from_left);
        kilometersTextView.startAnimation(slideInAnimation);
    }
}
