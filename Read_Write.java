import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.io.*;

public class Read_Write {
    String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    Scanner scanner = new Scanner(System.in);

    String FILE_NAME = "C:\\Users\\dimoo\\OneDrive\\Рабочий стол\\Notebook.txt";
    public void Write(List<String> notes){
        System.out.print("Введите новую запись: ");
        String newNote = scanner.nextLine();
        notes.add(LocalDateTime.now().format(DATE_TIME_FORMATTER) + " - " + newNote);
        System.out.println("Новая запись добавлена!\n");
    }
    public void Read(List<String> notes){
        System.out.println("Список записей:");
        for (String note : notes) {
            System.out.println(note);
        }
    }
    public void toWrite(List<String> notes) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String note : notes) {
                writer.write(note);
                writer.newLine();
            }
        }
    }
    public void toRead(List<String> notes) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                notes.add(line);
            }
        }
    }
}
