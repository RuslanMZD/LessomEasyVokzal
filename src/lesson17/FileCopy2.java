package lesson17;

import java.io.*;

public class FileCopy2 {
    public static void main(String[] args) {
        try {
            // Создаем буферизованный  символьный входной поток
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            // Используем класс PrintWriter для вывода
            PrintWriter out = new PrintWriter (new FileWriter("data.txt"));
            // Записываем строки, пока не введем строку "stop"
            while (true) {
                String s = in.readLine();
                if (s.equals("stop"))
                    break;
                out.println(s); // поток вывода как System.out печатает в файл, есть принт принтлн и принтф
                //wtite пишет как байты

            }
            out.close();
        } catch (IOException ex) {
            // Обработать исключение
        }
    }
}
