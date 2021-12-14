package app.smty.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import app.smty.practica3.Models.Channel;
import app.smty.practica3.Models.RadioStationsResponse;
import app.smty.practica3.Services.RadioStationsService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    Button buttonRadioStations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializar componentes de la UI
        buttonRadioStations = findViewById(R.id.buttonRadioStations);

        // llamar al evento clic
        buttonRadioStations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChannelsActivity.class);
                startActivity(intent);
            }
        });
    }
}