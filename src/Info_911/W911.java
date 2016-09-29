package Info_911;

public class W911 extends nine_one_one {
    private Double Latitude;
    private Double Longitude;

    // reverse geo code & % of reliability <hardcode>

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }
}


/**
 * Created by aaronewing on 9/22/2016.
 */