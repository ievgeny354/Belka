import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Belka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("введите количество деревьев:");
        int qty = input.nextInt();
        System.out.println("Количество орехов под каждым деревом:" + Arrays.toString(NutTree.growGroveNutArray(qty)));
        System.out.println("ИТОГО общий вес:"+Belka.nutHurvest(qty));
    }
}

class Nut {static double weight = 12.5;}
class NutTree {
    public static int[] growGroveNutArray(int qty) {
        int[] groveNuts = new int[qty];
        Random random = new Random();
        for (int i = 0; i < qty; i++) {
            groveNuts[i] = random.nextInt(10);
        }
        return groveNuts;
    }
}

class Belka {
    public static double nutHurvest(int qty) {
        double weight = Nut.weight;
        double nuts=0;
        for (int i = 0; i < NutTree.growGroveNutArray(qty).length; i++) {
            nuts= (nuts+ NutTree.growGroveNutArray(qty)[i]*weight);
            System.out.println(i+" Ура еще орешек! Общий вес орехов:"+nuts);
        }
        return nuts;
    }
}

/*
Создать класс Орешек с полем вес. Все орешки создаются с весом 12.5. Изменить вес ореха нельзя.
Создать класс Дерево, у которого есть метод ВыраститьМассивОрехов. Параметр метода
это количество, результат - массив Орешков.
Создать класс Белочка, у которой есть метод собирания орехов из массива, выращенного деревом.
 Белочка перебирает каждый орешек в массиве, говорит "ура, еще орех!" и суммирует вес всех
 найденных орехов.
В итоге она гордо сообщает, какой общий вес она насобирала.

Продемонстрировать работу системы с 1 объектом класса Белочка, 1 Деревом и массивом из 15 орехов.
 */