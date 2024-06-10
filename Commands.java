import java.util.Scanner;

public class Commands {
    public void Commands(){
        String command = "";

        while (command != "Закрыть"){
            System.out.println("Введите команду\n");
            Scanner sc = new Scanner(System.in);
            System.out.println(sc);
            switch(command){
                case "Read":
                    System.out.println("Read is right");
                    break;
                case "Write":
                    System.out.println("Write is good");
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        }
    }
}
