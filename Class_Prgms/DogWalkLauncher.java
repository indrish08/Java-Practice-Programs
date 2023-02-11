package Class_Prgms;

class Dog {
    int timeOfDrinking;

    void setDrinkTime(int n) {
        timeOfDrinking = n;
    }
    int getDrinkTime() {
        return timeOfDrinking;
    }
    boolean needsToGo() {
        if (getDrinkTime() >= 4)
            return true;
        else
            return false;
    }
}

class DogOwner {
    boolean takeForWalf(Dog d) {
        return d.needsToGo();
    }
}

public class DogWalkLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.setDrinkTime(4);
        DogOwner person1 = new DogOwner();
        boolean ans = person1.takeForWalf(d1);
        System.out.println(ans);
    }
}
