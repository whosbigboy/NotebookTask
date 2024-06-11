import java.io.*;
import java.util.*;

public class Commands {
    public void Commands() throws IOException {

        Scanner sc = new Scanner(System.in);

        List<String> notes = new ArrayList<>();

        boolean exit = false;

        Read_Write rw = new Read_Write();
        rw.toRead(notes);

        System.out.println("\nЗаписная книжка открыта\n");
        while (!exit){

            System.out.println("Введите команду: ");
            String command = sc.nextLine();

            switch(command){
                case "#read":
                    rw.Read(notes);
                    break;
                case "#write":
                    rw.Write(notes);
                    break;
                case "#close":
                    System.out.println("Записная книжка закрыта\n");
                    exit = true;
                    break;
                default:
                    System.out.println("Нет такой команды");
                    break;
            }
        }
        rw.toWrite(notes);
    }
}
