package Info_911;

import com.sun.org.apache.regexp.internal.RE;

public class nine_one_one {
    private String Name; //done
    private String Time; //<new>
    private String Phone_Number; //does period work? yeah it should. Done
    private String Nature; // done
    private boolean Accidental_Call; // done
    private String Description[] = new String[100]; //<list>
    private String Responding_Units[] = new String[100]; //<list>
    private String Status; //list not bool, so array <different> can be bool
    private boolean cell_Phone;

    private int des_Count = 0;
    private int units_Count = 0;

    public String getName() {
        return Name;
    }

    public Boolean getcell_Phone() {
        return cell_Phone;
    }

    public void setCell_Phone(boolean cell_Phone) {
        this.cell_Phone = cell_Phone;
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

 /*   public String getDescription() {
        des_Count++;
        return Description[des_Count];
    } */

    public String[] getDescription() { // returns entire array of strings
    //    this.Description[0] = "none";
        return Description;
    }

    public int getDes_Count() {        // returns count
        return des_Count;
    }

    public String[] getResponding_Units() { // returns entire array of strings
        //    this.Description[0] = "none";
        return Responding_Units;
    }

    public int getUnits_Count() {        // returns count
        return units_Count;
    }

   // public String getResponding_Units() {
    //    j++;
   //     return Responding_Units[j];

   // }

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

 /*   public void setDescription(String Description) {
        this.Description = Description;
    } */

/*    public void setDescription(String Description[]) {
        this.Description[i] = Description;
    } */

    public void addDescription(String Description) {
        this.Description[des_Count] = Description;
        ++des_Count;
    }

    public void setResponding_Units(String Responding_Units[]) {
  //      this.Responding_Units[j] = Responding_Units[j];
     //   this.Responding_Units = Responding_Units.copyOf(Responding_Units, Responding_Units.length);
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}