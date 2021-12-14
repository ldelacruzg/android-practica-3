package app.smty.practica3.Models;

import java.util.List;

public class RadioStationsResponse {
    List<Channel> data;

    public RadioStationsResponse() {
    }

    public RadioStationsResponse(List<Channel> data) {
        this.data = data;
    }

    public List<Channel> getData() {
        return data;
    }

    public void setData(List<Channel> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RadioStationsResponse{" +
                "data=" + data +
                '}';
    }
}
