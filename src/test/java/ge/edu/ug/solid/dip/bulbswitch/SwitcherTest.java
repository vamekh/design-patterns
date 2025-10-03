package ge.edu.ug.solid.dip.bulbswitch;

import org.junit.jupiter.api.Test;

class SwitcherTest {
    @Test
    public void testSwitch() {
        Switcher bulbSwitcher = new Switcher(new LightBulb(), false);
        Switcher ventSwitcher = new Switcher(new Vent(), false);

        bulbSwitcher.flip();
        ventSwitcher.flip();
    }

}
