//Создать 5 зергов, 3 протосса и 4 террана.
//        Дать им всем уникальные имена.
//
//        Требования:
//        •	Нельзя изменять классы Zerg, Protoss и Terran.
//        •	Нужно создать 5 объектов типа Zerg и каждому из них дать свое имя.
//        •	Нужно создать 3 объекта типа Protoss и каждому из них дать свое имя.
//        •	Нужно создать 4 объекта типа Terran и каждому из них дать свое имя.

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg z1 = new Zerg();
        Zerg z2 = new Zerg();
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();
        z1.name = "Zerg1";
        z2.name = "Zerg2";
        z3.name = "Zerg3";
        z4.name = "Zerg4";
        z5.name = "Zerg5";

        Protoss p1 = new Protoss();
        Protoss p2 = new Protoss();
        Protoss p3 = new Protoss();
        p1.name = "Protoss1";
        p2.name = "Protoss2";
        p3.name = "Protoss3";

        Terran t1 = new Terran();
        Terran t2 = new Terran();
        Terran t3 = new Terran();
        Terran t4 = new Terran();
        t1.name = "Terran1";
        t2.name = "Terran2";
        t3.name = "Terran3";
        t4.name = "Terran4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
