class ParentClass {
    public void display() {
        System.out.println("This is the parent class.");
    }
}

class ChildClass extends ParentClass {
    public void display() {
        super.display();
        System.out.println("This is the child class.");
    }
}
 class Main {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();
        child.display();
    }
}
