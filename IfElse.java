package controlStatPack;

public class IfElse {
    public static void main(String[] args) {
        
        int a=5;
		int b=3;
        // If Else Statment Example
		if(a+b<10)
			System.out.println("a+b is less than 10");
		else
			System.out.println("a+b is greater than 10");


        String name="Swapnil";
        // If Else Ladder Example
        if(name=="abc")
            System.out.println("Name is abc");
            else if(name=="Kodi")
                System.out.println("Name is Kodi");
            else if(name=="Swapnil")
                System.out.println("Name is Swapnil");
            else
                System.out.println(name);

    }
}
