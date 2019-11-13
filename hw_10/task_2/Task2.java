package hw_10.task_2;

import java.io.File;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*Åñòü ïàïêà ñ ôàéëàìè, êîòîðûå íóæíî ïåðåèìåíîâàòü.
Ðåàëèçóéòå ïàòòåðí "ñòðàòåãèÿ" ïðè ïîìîùè Enum äëÿ ïåðåèìåíîâàíèÿ ôàéëîâ:
- èìÿ ôàéëà ìàëåíüêèìè áóêâàìè
- ïåðâàÿ áóêà â èìåíè ôàéëà ñ áîëüøîé áóêâû, à îñòàëüíûå ìàëåíüêèå
- èìÿ ôàéëà íàïèñàíî êýïñ ëîêîì (âñå áóêâû áîëüøèå)
Íàïèøèòå êëàññ, ó êîòîðîãî áóäåò ìåòîä ïðèíèìàþùèé òåêóùåå èìÿ ôàéëà è ñòðàòåãèþ äëÿ ïåðåèìåíîâàíèÿ.*/
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
        File file = new File(filePath);//ñîçäàåì îáúåêò â ïàïêå (ôàéë)
        filesList = file.listFiles();//çàïèñûâàåì ôàéëû èç ïàïêè â ìàññèâ îáúåêòîâ òèïà File
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
        File file = new File(filePath);//ñîçäàåì îáúåêò â ïàïêå (ôàéë)
        filesList = file.listFiles();//çàïèñûâàåì ôàéëû èç ïàïêè â ìàññèâ îáúåêòîâ òèïà File
        for (int i = 0; i < filesList.length; i++) {
            String buffer = filesList[i].getName();
            if (buffer.endsWith(".txt") || buffer.endsWith(".TXT")) {
                filesList[i].renameTo(new File("E:\\Java\\Java_homework\\Gvan6032\\src\\hw_10\\task_2\\" + fileName));
            }
        }
    }

    // enum в отдельный файл
    enum Strategy {
        // strategyFirst -> придумай название, которое отражает суть стратегии, например LOWER_CASE_STRATEGY
        strategyFirst {
            public String action(String fileName) {
                fileName = fileName.toLowerCase();
                System.out.println("New file name: " + fileName);
                return fileName;
            }
        },
        // StrategySecond -> переименуй
        StrategySecond {
            public String action(String fileName) {
                fileName = fileName.substring(0, 1).toUpperCase() + fileName.substring(1).toLowerCase();
                System.out.println("New file name: " + fileName);
                return fileName;
            }
        },
        // strategyThierd -> переименуй
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

