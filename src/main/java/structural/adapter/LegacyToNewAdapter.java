package structural.adapter;

/**
 * Created by drdas on 27/10/16.
 */
public class LegacyToNewAdapter implements InterfaceNew{

    //using composition for holding the interfaceLegacy object
    private InterfaceLegacy instance;

    public LegacyToNewAdapter(InterfaceLegacy instance) {
        this.instance = instance;
    }

    public String getFirstName() {
        return instance.getFname();
    }

    public void setFirstName(String firstName) {
        instance.setFname(firstName);
    }

    public String getLastName() {
        return instance.getLname();
    }

    public void setLastName(String lastName) {
        instance.setLname(lastName);
    }

    @Override
    public String toString() {
        return "LegacyToNewAdapter{" +
                "instance=" + instance +
                '}';
    }
}
