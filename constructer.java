package classPack;

public class constructer {
    private float radius=5.5f;

    static float pi=3.14f;
    constructer(float radius){
        this.radius=radius;
        
    }

    public float calculateCircleArea() {
		return pi*this.radius*this.radius;
	}
	public float calculateCircumference() {
		return 2*pi*this.radius;
	}

    public static void main(String[] args) {
        constructer Obj=new constructer(12f);
        
        System.out.println(" CalculateCircleArea = "+Obj.calculateCircleArea());
        System.out.println(" calculateCircumference = "+Obj.calculateCircumference());
    }
    
}
