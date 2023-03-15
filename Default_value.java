public class Default_value {

int a;

short b;

long c;

double g;

float h;

char m;

void show(){

System.out.println("short" +b );

System.out.println( "long" +c );
System.out.println("double :"+g );

System.out.println("float"+h );

System.out.println( "char"+m );
}

public static void main(String args[]){

Default_value object = new Default_value();
System.out.println("Default Values");
object.show();


}
}