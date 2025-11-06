public class Dog {
    public String name;
    public String color;

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void getDetails(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobby", "black");
        dog1.getDetails();
    }
}
