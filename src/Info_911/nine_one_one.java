package Info_911;

public class nine_one_one {
    private String Name;
    private String Time;
    private String Phone_Number;
    private String Nature;
    private boolean Accidental_Call;
    private String Description;
    private String Responding_Units;
    private boolean Status; //list not bool
    private boolean Users_Fate;

    String getName() {
        return Name;
    }

    String getTime() {
        return Time;
    }

/*    String getAddress() {
        return Address;
    } */

    String getPhone_Number() {
        return Phone_Number;
    }

 /*   double getLatitude() {
        return Latitude;
    }

    double getLongitude() {
        return Longitude;
    } */

    String getNature() {
        return Nature;
    }

    boolean getAccidental_Call() {
        return Accidental_Call;
    }

    String getDescription() {
        return Description;
    }

    String getResponding_Units() {
        return Responding_Units;
    }

    boolean getStatus() {
        return Status;
    }

    boolean getUsers_Fate() {
        return Users_Fate;
    }

    void setName(String Name) {
        this.Name = Name;
    }

/*    void setAddress(String Address) {
        this.Address = Address;
    } */

    void setTime (String Time) {
        this.Time = Time;
    }

    void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

/*    void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    } */

    void setNature(String Nature) {
        this.Nature = Nature;
    }

    void setAccidental_Call(boolean Accidental_Call) {
        this.Accidental_Call = Accidental_Call;
    }

    void setDescription(String Description) {
        this.Description = Description;
    }

    void setResponding_Units(String Responding_Units) {
        this.Responding_Units = Responding_Units;
    }

    void setStatus(boolean Status) {
        this.Status = Status;
    }

    void setUsers_Fate(boolean Users_Fate) {
        this.Users_Fate = Users_Fate;
    }
}