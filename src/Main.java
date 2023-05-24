public class Main {
    public static void main(String[] args){
    System.out.println("Hello programming!");

       byte b = 8;
       short s= 16;
       int i; // declaring variable
        i = 32; // initializing variable
        long l = 64;

        System.out.println("Variable of type byte store" + b + "bits.\nDiapason: from -128 to 127");
        System.out.println("Variable of type byte store" + s + "bits.\nDiapason: from -32 768 to 32 767");
        System.out.println("Variable of type byte store" + i + "bits.\nDiapason: from -2 147 483 648 to 2 147 483 647");
        System.out.println("Variable of type byte store" + l + "bits.\nDiapason: from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");

        System.out.println("Floating point primitives:");

        float f = 0.6F;
        double d = 0.5;

        System.out.println("\nVariables of type 'float' store 32 bits.");
        System.out.println("\nVariables of type 'double' store 64 bits.");

        char c;
        c = 'X';

        System.out.println("Variable c contains" + c);

    }

}