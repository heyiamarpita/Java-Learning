class pen {
    String colour;
    String type;

    public void write() {
        System.out.println("writing something");
    }
}

public class oop {
    public static void main(String args[]) {

        pen pen1 = new pen();

        pen1.colour = "blue";
        pen1.type = "gel";

        pen1.write();
    }
}

