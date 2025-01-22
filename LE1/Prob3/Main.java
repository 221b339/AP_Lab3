
class Main {
    public static void main(String[] args) {
     
        System.out.println("Polymorphism with non-static show():");
        Mother m1 = new Child(); 
        m1.show();
        
        System.out.println("\n Static method show() in Mother class:");
        Mother.show();        
        
        System.out.println("\n Static method show() in Child class:");
        Child.show();
        
        System.out.println("\n Static method show() with reference of type Mother:");
        Mother m2 = new Child();
        m2.show();

        System.out.println("\n Calling static methods directly:");
        Mother.show(); 
        Child.show();
    }
}
