package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuefen on 2016/10/31.
 */
public class HundredDoors {

    private int doorsCount = 0;

    protected HundredDoors(int nDoors)
    {
        this.doorsCount = nDoors;
    }

    private void StartToggleDoors() {

    }

    public List getOpenDoors() {
        List openDoors = new ArrayList();

        return openDoors;
    }

    public List getCloseDoors() {

        List closeDoors = new ArrayList();


        return closeDoors;
    }

    public int getDoorsCount()
    {
        return this.doorsCount;
    }
}