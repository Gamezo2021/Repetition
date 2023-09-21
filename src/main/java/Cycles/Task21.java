package Cycles;

/**
 * Напишите оператор for для цикла, который проходит от 1000 до 0 с шаггом -2.
 */
public class Task21 {
    public static void main(String[] args) {
        for (int i = 1000; i >= 0; i -= 2){
            System.out.println(i);
        }
    }
}
