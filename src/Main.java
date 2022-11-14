import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Shark shark = new Shark("Baby-shark");
//        Tirtle tirtle = new Tirtle("Sam");
//        Eagle eagle = new Eagle("Sky");
//        Animal [] animals = {shark, tirtle, eagle};
//        System.out.println(Arrays.toString(animals));

        Animal[] animal = {
                new Shark("Baby-shark"),
                new Shark("Sam"),
                new Shark("Tim"),
                new Shark("Daisy"),
                new Tirtle("Tom"),
                new Tirtle("jhon"),
                new Tirtle("Puth"),
                new Tirtle("Selena"),
                new Eagle("Owl"),
                new Eagle("Rita"),
                new Eagle("Linda")
        };
        int counterShark = 0;
        int counterTitle = 0;
        int counterEagle = 0;
        for (Animal animal1 : animal) {
            if (animal1 instanceof Shark) {
                ((Shark) animal1).attack();
                counterShark++;
            } else if (animal1 instanceof Tirtle) {
                ((Tirtle) animal1).swim();
                counterTitle++;
            } else if (animal1 instanceof Eagle) {
                ((Eagle) animal1).fly();
                counterEagle++;
            }


        }


        Shark[] shark = new Shark[counterShark];
        Tirtle[] title = new Tirtle[counterTitle];
        Eagle[] eagles= new Eagle[counterEagle];

        for (int i = 0; i < animal.length; i++) {
            for (int t = 0; t < title.length; t++) {
                if (animal[i] instanceof Tirtle)
                    title[t] = (Tirtle) animal[i];


                for (int s = 0; s < shark.length; s++) {
                    if(animal[i] instanceof Shark)
                    shark[i] = (Shark) animal[i];


                    for (int e = 0; i < eagles.length; e++) {
                        if(animal[i] instanceof Eagle)
                        eagles[e] = (Eagle) animal[i];
                    }
                }
            }
        }

        System.out.println(Arrays.toString(eagles));
        System.out.println(Arrays.toString(shark));
        System.out.println(Arrays.toString(title));
    }
}