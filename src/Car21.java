public class Car21 {

    int age = 25;

    int power = 10;

    int turbo = 40;


    int getAge () {
        return age;

    }

    int calculateIndex () { return power * 10 + turbo; }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }

}
