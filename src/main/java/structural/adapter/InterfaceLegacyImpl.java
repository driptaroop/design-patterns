package structural.adapter;

/**
 * Created by drdas on 26/10/16.
 */
public class InterfaceLegacyImpl implements InterfaceLegacy {

    private String fname;
    private String lname;

    public InterfaceLegacyImpl(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "InterfaceLegacyImpl{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
