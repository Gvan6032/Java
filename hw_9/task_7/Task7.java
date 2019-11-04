package hw_9.task_7;

import java.io.IOException;
import java.nio.file.*;

public class Task7 {
    public static void main (String [] args) throws IOException {

        Files.walk(Paths.get("E://Java//Java_homework//Gvan6032//src//hw_9", new String[]{}),
                new FileVisitOption[]{FileVisitOption.FOLLOW_LINKS})
                .map(Path::toFile)
                .forEach(f -> {
                    System.out.println(f.getAbsolutePath() + (f.isDirectory() ? " каталог" : " файл"));
                });
    }
}
