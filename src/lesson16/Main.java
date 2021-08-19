package lesson16;

public class Main {
    public static void main(String[] args) {

        Sklad sklad  = new Sklad();
        Tovar tovar1 = new Tovar(12323, "Monitor1", 12000);
        Tovar tovar2 = new Tovar(22323, "Mouse2", 499);
        Tovar tovar3 = new Tovar(12323, "MonoBlock3", 39000);
        Tovar tovar4 = new Tovar(434, "Batareika4", 100);
        Tovar tovar5 = new Tovar(1545, "Monitor5", 23000);

        sklad.addTovar(tovar1,500);
        sklad.addTovar(tovar2,200);
        sklad.addTovar(tovar3,700);
        sklad.deleteTovar(tovar1,100);
        sklad.printAllTovar();
        System.out.println(sklad.getMinCountTovar());


        System.out.println();

    }
}
