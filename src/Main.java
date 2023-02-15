import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();

    }
    private static void start(){
        Tele tv = new Tele(1);
        while (true){
            menu();
            applySelect(tv, selectChanel() );
        }
    }
    private static void menu(){
        System.out.println("Выберите действиe:");
        System.out.println("1 - что бы переключится на следующий канал");
        System.out.println("2 - что бы переключиться на предыдущий канал");
        System.out.println("3 - что бы переключиться на канал по номеру ");
    }
    private static void printChannel(){
        System.out.println("select channel");
    }
    public static int selectChanel() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();


    }
    private static void applySelect(Tele tv, int select){
        switch (select){
            case 1:
                tv.next();
                System.out.println(tv.getCurrnetChannel());
                break;
            case 2:
                tv.prev();
                System.out.println(tv.getCurrnetChannel());
                break;
            case 3:
                printChannel();
                tv.toChannel(selectChanel());
                System.out.println(tv.getCurrnetChannel());
        }
    }
}