package Info_911;

public class nine_one_one {
    private String Name; //done
    private String Time; //<new>
    private String Phone_Number; //does period work? yeah it should. Done
    private String Nature; // done
    private boolean Accidental_Call; // done
    private String Description; // done
    private String Responding_Units; //done
    private String Status; //list not bool, so array <different>

    String getName() {
        return Name;
    }

    String getTime() {
        return Time;
    }

    String getPhone_Number() {
        return Phone_Number;
    }

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

    String getStatus() {
        return Status;
    }

    void setName(String Name) {
        this.Name = Name;
    }

    void setTime (String Time) {
        this.Time = Time;
    }

    void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

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

    void setStatus(String Status) {
        this.Status = Status;
    }
}