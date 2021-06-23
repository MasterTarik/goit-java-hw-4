class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}

class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control() {
        System.out.print(airGauge);
        System.out.println(altimeter);
    }

class Altimeter {
    @Override
    public String toString() {
        return "Measure height";
    }
}

class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}
}
