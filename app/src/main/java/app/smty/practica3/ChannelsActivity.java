package app.smty.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

public class ChannelsActivity extends AppCompatActivity {
    TextView textViewChannels;
    String result = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channels);

        // inicializar componentes de la UI
        textViewChannels = findViewById(R.id.textViewChannels);

        // Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://50k-radio-stations.p.rapidapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RadioStationsService service = retrofit.create(RadioStationsService.class);
        Call<RadioStationsResponse> channels = service.getChannels();
        channels.enqueue(new Callback<RadioStationsResponse>() {
            @Override
            public void onResponse(Call<RadioStationsResponse> call, Response<RadioStationsResponse> response) {
                RadioStationsResponse body = response.body();
                List<Channel> data = body.getData();
                data.forEach(item -> {
                    result += item.toString() + "\n\n";
                });
                textViewChannels.setText(result);
            }

            @Override
            public void onFailure(Call<RadioStationsResponse> call, Throwable t) {

            }
        });
    }
}