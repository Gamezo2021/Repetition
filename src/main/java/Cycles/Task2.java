package Cycles;

import java.io.IOException;
/**
 *  Напишите программу, которая читает символы с клавиатуры до тех пор,
 * пока не будет получена точка. Программа должна подсчитывать количество пробелов и в конце сообщать итог
 */
public class Task2 {
    public static void main(String[] args) throws IOException {

        int numberOfSpaces = 0;

        System.out.print("Задуман какой то символ, попробуй его угадать: ");

        while (true){
            char a = (char) System.in.read();
            if (a == '.'){
                System.out.println("Вы угадали !");
                break;
            }
            if (a == ' '){
                numberOfSpaces++;
            }
        }
        System.out.println("Колличество пробелов = " + numberOfSpaces);
    }
}
