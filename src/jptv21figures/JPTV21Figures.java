/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21figures;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JPTV21Figures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OUTER:
        do {
            System.out.println("Выберите номер функции: ");
            System.out.println("1.Заполненый квадрат: ");
            System.out.println("2.Не заполненый квадрат: ");
            System.out.println("3.Найти указаную подстроку в тексте: ");
            System.out.println("4.Заменить указанную подстроку на другую подстроку: ");
            int numberFunction = scanner.nextInt();
            Scanner first = new Scanner(System.in);
            Scanner second = new Scanner(System.in);
            int firs = first.nextInt();
            int sec = second.nextInt();
            String [][] figures = new String [firs][sec];
            switch (numberFunction) {
                case 0:
                    System.out.println("goodbye");
                    break OUTER;
                case 1:
                    System.out.println("Вы выбрали функцию 1");
                    for (int i = 0; i < firs; i++){
                        for (int j = 0; j < firs; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Вы выбрали функцию 2");         
                    break;
                default:
                    break;
                }
            } while (true);
            
    } 
//        figures[firs][sec] = "1";
}
    

