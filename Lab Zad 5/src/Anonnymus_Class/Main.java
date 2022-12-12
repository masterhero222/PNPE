package Anonnymus_Class;

// Java program to demonstrate Need for
// Anonymous Inner class
 
// Interface
interface Age {
 
    // Defining variables and methods
    int x = 21;
    void getAge();
}
 
// Class 1
// Helper class implementing methods of Age Interface
class MyClass implements Age {
 
    // Overriding getAge() method
    @Override public void getAge()
    {
        // Print statement
        System.out.print("Age is " + x);
    }
}
 
// Class 2
// Main class
// AnonymousDemo
class GFG {
    // Main driver method
    public static void main(String[] args)
    {
        // Class 1 is implementation class of Age interface
        MyClass obj = new MyClass();
 
        // calling getage() method implemented at Class1
        // inside main() method
        obj.getAge();
    }
}