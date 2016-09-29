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

    public String getName() {
        return Name;
    }

    public String getTime() {
        return Time;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getNature() {
        return Nature;
    }

    public boolean getAccidental_Call() {
        return Accidental_Call;
    }

    public String getDescription() {
        return Description;
    }

    public String getResponding_Units() {
        return Responding_Units;
    }

    public String getStatus() {
        return Status;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setTime (String Time) {
        this.Time = Time;
    }

    public void setPhone_Number(String Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public void setNature(String Nature) {
        this.Nature = Nature;
    }

    public void setAccidental_Call(boolean Accidental_Call) {
        this.Accidental_Call = Accidental_Call;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setResponding_Units(String Responding_Units) {
        this.Responding_Units = Responding_Units;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}