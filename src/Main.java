public class Main {
    public static void main(String[] args) {
        printInformation("hellp wprsl");
        printInformation("");
        printInformation("\t   \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of Wolrd = %d %n", helloWorld.indexOf("World"));
    }

    public static void printInformation (String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("last char = %c %n", string.charAt(length - 1));
    }
}
