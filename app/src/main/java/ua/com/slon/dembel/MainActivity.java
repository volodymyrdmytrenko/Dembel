package ua.com.slon.dembel;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Calendar;
import java.util.Date;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long dmbTimeMillis = new Date(2024 - 1900, Calendar.MAY, 23).getTime();
        long currentTimeMillis = new Date().getTime();
        int days = (int) ((dmbTimeMillis - currentTimeMillis) / (1000 * 60 * 60 * 24));

        TextView daysView = findViewById(R.id.daysView);
        daysView.setText(String.valueOf(days));

    }
}