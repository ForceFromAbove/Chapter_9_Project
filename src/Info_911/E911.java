package Info_911;

public class E911 extends nine_one_one {

    String getName() {
        return this.Name;
    }

    String getAddress() {
        return Address;
    }

    String getPhone_Number() {
        return Phone_Number;
    }

    double getLatitude() {
        return Latitude;
    }

    double getLongitude() {
        return Longitude;
    }

    String getNature() {
        return Nature;
    }

    boolean getAccidental_Call() {
        return Accidental_Call;
    }

    String getText_Log() {
        return Text_Log;
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
        super.setName(Name);
    }

    void setAddress(String Address) {
        this.Address = Address;
    }

    void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    void setLatitude(double Latitude) {
        this.Latitude = Latitude;
    }

    void setLongitude(double Longitude) {
        this.Longitude = Longitude;
    }

    void setNature(String Nature) {
        this.Nature = Nature;
    }

    void setAccidental_Call(boolean Accidental_Call) {
        this.Accidental_Call = Accidental_Call;
    }

    void setText_Log(String Text_Log) {
        this.Text_Log = Text_Log;
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


/**
 * Created by aaronewing on 9/22/2016.
 */