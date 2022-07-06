import java.util.Scanner;

public class AppMenu {
    public static void main(String args[]) {
        printListZone();
        System.out.println("Digite el numero de la zona que desea ver el trafico: ");
        String in = "";
        Scanner inScanner = new Scanner(System.in);
        in = inScanner.nextLine();
        int number = Integer.parseInt(in) - 1;
        System.out.println("Digite la hora inicial: ");
        System.out.println("Recuerde que 6:00 am es igual a 0, 7:00 am es 1...");
        String in2 = "";
        Scanner inScanner2 = new Scanner(System.in);
        in2 = inScanner2.nextLine();
        int number2 = Integer.parseInt(in2) - 1;
        System.out.println("Digite la hora final: ");
        String in3 = "";
        Scanner inScanner3 = new Scanner(System.in);
        in3 = inScanner3.nextLine();
        int number3 = Integer.parseInt(in3) - 1;
        printResults(number, number2, number3);

    }

    public static void printListZone(){
        ZoneRepository listZone = new ZoneRepository();
        listZone.generateZone();
        for (int i = 0; i < listZone.list.size(); i++) {
            System.out.println((i + 1) + " " + listZone.list.get(i));
        }
    }
    public static void printResults(int number, int initial, int end){
        ZoneRepository listZone = new ZoneRepository();
        listZone.generateZone();
        listZone.listZone.get(number).promTraffic(initial, end);

    }
}
