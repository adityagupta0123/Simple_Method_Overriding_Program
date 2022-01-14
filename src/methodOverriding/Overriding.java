package methodOverriding;

class Super{
    public void display(){
        System.out.println("Super Class Display");
    }
}
class sub extends Super{
    @Override
    public void display() {
        System.out.println("Sub Class Display");
    }
}


public class Overriding {
    public static void main(String[] args) {
        Super s1 = new Super();
        s1.display();
        System.out.println();

        sub s2 = new sub();
        s2.display();
        System.out.println();
        
        Super s3 = new sub();
        s3.display();
    }
}
