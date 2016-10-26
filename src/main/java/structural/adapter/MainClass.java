package structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by drdas on 27/10/16.
 */
public class MainClass {

    public static void main(String[] args) {
        //This legacy pojo is given. Have to add this to any method that only accept new pojo
        InterfaceLegacy legacy = new InterfaceLegacyImpl("Harry", "Potter");

        List<InterfaceNew> newPojoList = new ArrayList<InterfaceNew>();

        //The following line will show error.
        //newPojoList.add(legacy);

        //The following line shows the adapter pattern when we use
        newPojoList.add(new LegacyToNewAdapter(legacy));

        System.out.println(newPojoList);
    }

}
