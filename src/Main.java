public class Main {
    public static void main(String[] args)
    {
        Car21 Tavriya1 = new Car21 ();
        Car21 Tavriya2 = new Car21 ();

        System.out.println(Tavriya1.getAge());
        System.out.println(Tavriya1.calculateIndex());
        System.out.println(Tavriya2.power);
        System.out.println(Tavriya2.upgradePower(10));
        System.out.println(Tavriya2.calculateIndex());

    }
}