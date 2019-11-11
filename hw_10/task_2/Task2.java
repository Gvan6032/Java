package hw_10.task_2;

import java.io.File;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Есть папка с файлами, которые нужно переименовать.
Реализуйте паттерн "стратегия" при помощи Enum для переименования файлов:
- имя файла маленькими буквами
- первая бука в имени файла с большой буквы, а остальные маленькие
- имя файла написано кэпс локом (все буквы большие)
Напишите класс, у которого будет метод принимающий текущее имя файла и стратегию для переименования.*/
        try {
            String fileName = getFileName();
            int choice = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Please choice file rename strategy: 1 - Low letters, 2 - The first letter is upper, 3 - Upper letters: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    Strategy strategy = Strategy.strategyFirst;
                    fileName = strategy.action(fileName);
                    renameFileName(fileName);
                    break;
                case 2:
                    strategy = Strategy.StrategySecond;
                    fileName = strategy.action(fileName);
                    renameFileName(fileName);
                    break;
                case 3:
                    strategy = Strategy.strategyThierd;
                    fileName = strategy.action(fileName);
                    renameFileName(fileName);
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getFileName() {
        File[] filesList;
        String fileName = " ";
        String filePath = "E:\\Java\\Java_homework\\Gvan6032\\src\\hw_10\\task_2\\";
        File file = new File(filePath);//создаем объект в папке (файл)
        filesList = file.listFiles();//записываем файлы из папки в массив объектов типа File
        for (int i = 0; i < filesList.length; i++) {
            String buffer = filesList[i].getName();
            if (buffer.endsWith(".txt")) {
                fileName = buffer;
            }
        }
        return fileName;
    }

    public static void renameFileName(String fileName) {
        File[] filesList;
        String filePath = "E:\\Java\\Java_homework\\Gvan6032\\src\\hw_10\\task_2\\";
        File file = new File(filePath);//создаем объект в папке (файл)
        filesList = file.listFiles();//записываем файлы из папки в массив объектов типа File
        for (int i = 0; i < filesList.length; i++) {
            String buffer = filesList[i].getName();
            if (buffer.endsWith(".txt") || buffer.endsWith(".TXT")) {
                filesList[i].renameTo(new File("E:\\Java\\Java_homework\\Gvan6032\\src\\hw_10\\task_2\\" + fileName));
            }
        }
    }

    enum Strategy {
        strategyFirst {
            public String action(String fileName) {
                fileName = fileName.toLowerCase();
                System.out.println("New file name: " + fileName);
                return fileName;
            }
        },
        StrategySecond {
            public String action(String fileName) {
                fileName = fileName.substring(0, 1).toUpperCase() + fileName.substring(1).toLowerCase();
                System.out.println("New file name: " + fileName);
                return fileName;
            }
        },
        strategyThierd {
            public String action(String fileName) {
                fileName = fileName.toUpperCase();
                System.out.println("New file name: " + fileName);
                return fileName;
            }
        };

        public abstract String action(String fileName);

    }
}

