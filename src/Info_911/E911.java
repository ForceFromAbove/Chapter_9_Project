package Info_911;

public class E911 extends nine_one_one {
    private String Address;

    String getName() {
        return super.getName();
    }

    String getTime() {
        return super.getTime();
    }

    String getAddress() {
        return super.getResponding_Units();
    }

    public String getPhone_Number() {
        return Address;
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

    void setTime (String Time) {
        super.setTime(Time);
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    void setPhone_Number(String Phone_Number) {
        super.setPhone_Number(Phone_Number);
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