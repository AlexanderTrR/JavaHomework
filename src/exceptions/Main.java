package exceptions;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            Files.write(Paths.get("C:\\Users\\fish3\\IdeaProjects\\HomeworkHomework\\src\\exceptions\\file.txt"),
                    "My name is Sasha".getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
            byte[] array = Files.readAllBytes(Paths.get("C:\\Users\\fish3\\IdeaProjects\\HomeworkHomework\\src\\exceptions\\file.txt"));
            if (array.length == 0) {
                throw new MyZeroArrayException();
            }
        } catch (NoSuchFileException e) {
            System.out.println("File does not exist");
        } catch (MyZeroArrayException e) {
            System.out.println("File is empty");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
