public class Student {
    String name;
    int roll=0;
    public int getRoll()
    {
        return roll;
    }
    public static void printName(String name)
    {
        System.out.printf(name);
    }

    public static void main(String[] args) {
        printName("Shubham");
    }

}
