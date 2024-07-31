import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.1");

        int[] solarSystems = new int[3];
        solarSystems[0] = 1;
        int venus = solarSystems[0];
        solarSystems[1] = 2;
        int jupiter = solarSystems[1];
        solarSystems[2] = 3;
        int earth = solarSystems[2];

        System.out.println("Задача 1.2");

        double[] solarSystems1 = {1.57, 7.654, 9.986};

        System.out.println("Задача 1.3");

        int[] solarSystems2 = {19, 45, 198};

        System.out.println("Задача 2");
        for (int i = 0; i < solarSystems.length - 1; i++) {
            System.out.print(solarSystems[i] + ", ");
        }
        System.out.print(solarSystems[solarSystems.length - 1]);
        System.out.println();
        for (int i = 0; i < solarSystems1.length - 1; i++) {
            System.out.print(solarSystems1[i] + ", ");
        }
        System.out.print(solarSystems1[solarSystems1.length - 1]);
        System.out.println();
        for (int i = 0; i < solarSystems2.length - 1; i++) {
            System.out.print(solarSystems2[i] + ", ");
        }
        System.out.print(solarSystems2[solarSystems2.length - 1]);
        System.out.println();

        System.out.println("Задача 3");
        for (int i = solarSystems.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(solarSystems[i]);
                break;
            }
            System.out.print(solarSystems[i]+", ");
        }
        for (int i = solarSystems1.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.println(solarSystems1[i]);
                break;
            }
            System.out.print(solarSystems1[i]+", ");
        }
        for (int i = 0; i < solarSystems2.length; i++) {
            if (i == solarSystems2.length - 1) {
                System.out.println(solarSystems2[solarSystems2.length - 1 - i]);
                break;
            }
            System.out.print(solarSystems2[solarSystems2.length - 1 - i] + ", ");
        }
        System.out.println("Задача 4");
        for (int t = 0; t < solarSystems.length; t++) {
            if (solarSystems[t] % 2 != 0) {
                solarSystems[t] = solarSystems[t] + 1;
            }
        }
        System.out.println(Arrays.toString(solarSystems));
    }
}
