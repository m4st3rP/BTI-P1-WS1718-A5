package resistanceNet;

public class MyTestFrame {

    public static void main(String[] args) {
        test1();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        test2();
    }

    public static void test1() {
        Resistor r1 = new Resistor("r1", 100);
        Resistor r2 = new Resistor("r2", 200);
        Resistor r3 = new Resistor("r3", 300);
        Resistor r4 = new Resistor("r4", 400);
        Resistor r5 = new Resistor("r5", 500);
        Resistor r6 = new Resistor("r6", 600);

        ParallelResistor r13 = new ParallelResistor(r1, r3);
        SeriesResistor r132 = new SeriesResistor(r13, r2);

        SeriesResistor r45 = new SeriesResistor(r4, r5);

        ParallelResistor r132456 = new ParallelResistor(r132, r45, r6);

        System.out.println("Gesamtwiderstand: " + r132456.getResistance());
        System.out.println("Sollte: 155.91");
        System.out.println();
        System.out.println("Anzahl Widerstände: " + r132456.getNumberOfResistors());
        System.out.println("Sollte: 6");
        System.out.println();
        System.out.println(r132456.getCircuit());
        System.out.println("Sollte: (((R1|R3)+R2)|(R4+R5)|R6)");
    }

    public static void test2() {
        Resistor r1 = new Resistor("r1", 100);
        Resistor r2 = new Resistor("r2", 200);
        Resistor r3 = new Resistor("r3", 300);
        Potentiometer r4 = new Potentiometer("r4");
        Resistor r5 = new Resistor("r5", 500);
        Resistor r6 = new Resistor("r6", 600);

        ParallelResistor r13 = new ParallelResistor(r1, r3);
        SeriesResistor r132 = new SeriesResistor(r13, r2);

        SeriesResistor r45 = new SeriesResistor(r4, r5);

        ParallelResistor r132456 = new ParallelResistor(r132, r45, r6);

        for (int i = 0; i <= 4000; i += 400) {
            r4.setResistance(i);
            System.out.println("Gesamtwiderstand(" + i + "): " + r132456.getResistance());
        }
    }
}
