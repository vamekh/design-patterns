package ge.edu.ug.solid.dip.bulbswitch;

import org.junit.jupiter.api.Test;

class BulbSwitchTest {
    @Test
    public void testSwitch() {
        LightBulb bulb = new LightBulb();
        BulbSwitch bulbSwitcher = new BulbSwitch(bulb, true);
        bulbSwitcher.flip();

        Vent vent = new Vent();
        VentSwitch ventSwitcher = new VentSwitch(vent, true);
        ventSwitcher.flip();
    }

}
