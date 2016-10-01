package Info_911;

public class W911 extends nine_one_one {
    private Double Latitude;
    private Double Longitude;

    private String reverse_geo_code = "Dale's House";
    private int reliability = 75;

    // reverse geo code & % of reliability <hardcode>

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public int getReliability() {
        return reliability;
    }

    public String getReverse_geo_code() {
        return reverse_geo_code;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    public void setReliability(int reliability) {
        this.reliability = reliability;
    }

    public void setReverse_geo_code(String reverse_geo_code) {
        this.reverse_geo_code = reverse_geo_code;
    }
}


/**
 * Created by aaronewing on 9/22/2016.
 *
 * 5 accuracy
 * geoloaction
 *
 */