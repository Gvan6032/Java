package hw_14.task_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    /*Åñòü òåêñòîâûé ôàéë. Íóæíî ñêîïèðîâàòü èç íåãî òîëüêî òå ñòðîêè, êîòîðûå ñîäåðæàò ñëîâî pancakes è çàïèñàòü èõ â äðóãîé ôàéë*/
    public static void main(String[] args) throws IOException {
        String text = "E://Java//Java_homework//Gvan6032//src//hw_14//task_2//Text.txt"; // константа
        String regex = "pancakes"; // константа
        String newText = "E://Java//Java_homework//Gvan6032//src//hw_14//task_2//TextNew.txt"; //константа
        Path path = Paths.get(text);
        Path pathNew = Paths.get(newText);
        searchForMatches(path, pathNew, regex);
    }

    public static void searchForMatches(Path path, Path pathNew, String regex) throws IOException {
        Stream<String> allFileText = Files.lines(Paths.get(String.valueOf(path)));
        List<String> line = allFileText
                .filter(l -> l.contains(regex))
                .collect(Collectors.toList());
        
        System.out.println(line);
        
        try (FileOutputStream fos = new FileOutputStream(String.valueOf(pathNew))) {
            for (int i = 0; i < line.size(); i++) {
                fos.write(line.get(i).getBytes());
            }
            fos.flush();
            fos.close();
        }
    }
}

