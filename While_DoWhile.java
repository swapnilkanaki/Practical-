package controlStatPack;

public class While_DoWhile {
    public static void main(String[] args) {
        int i=0;
        // While Loop
        System.out.println("\n\n While Loop");
        while(i<5)
            System.out.println("i'th = "+i++);

        
        i=0;
        // DoWhile Loop
        System.out.println("\n\n Do While Loop");
        do{
            System.out.println("i'th = "+i++);
        }while(i<5);

    }
}
