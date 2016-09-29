package Info_911;

public class W911 extends nine_one_one {
    private Double Latitude;
    private Double Longitude;

    // reverse geo code & % of reliability <hardcode>

    String getName() {
        return super.getName();
    }

    String getPhone_Number() {
        return super.getPhone_Number();
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    String getNature() {
        return super.getNature();
    }

    boolean getAccidental_Call() {
        return super.getAccidental_Call();
    }

    String getDescription() {
        return super.getDescription();
    }

    String getResponding_Units() {
        return super.getResponding_Units();
    }

    String getStatus() {
        return super.getStatus();
    }

    void setName(String Name) {
        super.setName(Name);
    }

    void setPhone_Number(String Phone_Number) {
        super.setPhone_Number(Phone_Number);
    }

    public void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    public void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    void setNature(String Nature) {
        super.setNature(Nature);
    }

    void setAccidental_Call(boolean Accidental_Call) {
        super.setAccidental_Call(Accidental_Call);
    }

    void setDescription(String Description) {
        super.setDescription(Description);
    }

    void setResponding_Units(String Responding_Units) {
        super.setResponding_Units(Responding_Units);
    }

    void setStatus(String Status) {
        super.setStatus(Status);
    }
}


/**
 * Created by aaronewing on 9/22/2016.
 */