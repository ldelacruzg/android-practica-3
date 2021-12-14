package app.smty.practica3.Services;

import app.smty.practica3.Models.RadioStationsResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface RadioStationsService {
    @Headers({
        "x-rapidapi-host: 50k-radio-stations.p.rapidapi.com",
        "x-rapidapi-key: 4d517ebdfdmsh69d7d78b64f0d38p1c6d11jsn9cf794f55fc0"
    })
    @GET("get/channels")
    Call<RadioStationsResponse> getChannels();
}
