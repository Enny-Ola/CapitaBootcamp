class Animals {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}
class Buffalo extends Animals {
    public void animalSound() {
        System.out.println("The bufallo says: groo groo");
    }
}
class Pig extends Animals {
    public void animalSound() {
        System.out.println("The pig says wee wee");
    }
}
class Main {
   public static void main(String[] args) {
    Animals newAnimal = new Animals();
    Animals newBuffalo = new Buffalo();
    Animals newPig = new Pig();
    newAnimal.animalSound();
    newBuffalo.animalSound();
    newPig.animalSound();
}
}