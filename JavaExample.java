import java.util.Arrays;

public class JavaExample {

    public static void main(String[] args) {
        Puppy p1 = new Puppy("Fido", "BROWN", 5);
        Puppy p2 = new Puppy("Rosco", "BLACK", 2);
        Puppy p3 = new Puppy("Spot", "BROWN", 3);
        Puppy p4 = new Puppy("Stella", "WHITE", 10);
        Puppy p5 = new Puppy("Rover", "BROWN", 8);
        Puppy puppiesArray[] = {p1, p2, p3, p4, p5};

        // any/some
        System.out.println("Any puppies with brown hair? " + anyBrownHair(puppiesArray));

        // all/every
        System.out.println("All puppies with brown hair? " + allBrownHair(puppiesArray));

        // reduce
        String words[] = {"How", "Now", "Dark", "Cloud"};
        System.out.println("Message: " + createMessage(words));

        // map
        int intArray[] = {1,2,3};
        System.out.println("Times 100: " + Arrays.toString(times100(intArray)));

        // filter
        System.out.print("Find all brown hair: " + Arrays.toString(findBrownHair(puppiesArray)));
    }

    static boolean anyBrownHair(Puppy[] puppiesArray) {
        return Arrays.stream(puppiesArray).anyMatch(puppy -> puppy.getHairColor().equals("BROWN"));
    }

    static boolean allBrownHair(Puppy[] puppiesArray) {
        return Arrays.stream(puppiesArray).allMatch(puppy -> puppy.getHairColor().equals("BROWN"));
    }

    static String createMessage(String[] words) {
        return Arrays.stream(words).reduce("", (message, word) -> message + word);
    }

    static int[] times100(int[] intArray) {
        return Arrays.stream(intArray).map(i -> i * 100).toArray();
    }

    static Puppy[] findBrownHair(Puppy[] puppiesArray) {
        return Arrays.stream(puppiesArray).filter(puppy -> puppy.getHairColor().equals("BROWN")).toArray(Puppy[]::new);
    }
}

class Puppy {
    private String name;
    private String hairColor;
    private int squirrelsChased;

    public Puppy(String name, String hairColor, int squirrelsChased) {
        this.name = name;
        this.hairColor = hairColor;
        this.squirrelsChased = squirrelsChased;
    }

    public String getName() {
        return name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getSquirrelsChased() {
        return squirrelsChased;
    }

    public String toString() {
        return name;
    }
}
