package controlStatPack;

class Lools{
    public static void main(String args[]){
        int i;  // Local Variable int i

        // For loop print 0 to 5
        for(i=0;i<5;i++){
            System.out.println(" i'th no = "+i);
        }

        // 'Break' Statament trigar when i==3
        System.out.println("\n\n Break Statament trigar when i==3");
        for(i=0;i<5;i++){
            if(i==3)
                break;
                System.out.println(" i'th no = "+i);
        }

        // Continue Statament trigar when i==3
        System.out.println("\n\n Continue Statament trigar when i==3");
        for(i=0;i<5;i++){
            if(i==3)
                continue;
            System.out.println(" i'th no = "+i);
        }

        // ForEach loop
        String names[]={"Ram","Shri Ram","Jai Shri Ram"};
        System.out.println("\n\n It Display Name using ForEach loop");
        for(String name:names)
            System.out.println(name);




    }
}