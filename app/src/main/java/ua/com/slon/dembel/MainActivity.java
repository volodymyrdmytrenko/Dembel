package ua.com.slon.dembel;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long today = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            today = LocalDate.now().toEpochDay();
        }
        long dmbDate = 0;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            dmbDate = LocalDate.of(2024,5,23).toEpochDay();
        }
        long days = dmbDate-today;

        TextView daysView = findViewById(R.id.daysView);
        daysView.setText(String.valueOf(days));

    }
}