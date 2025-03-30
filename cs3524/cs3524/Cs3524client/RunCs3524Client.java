package cs3524example.cs3524client;

public class RunCs3524Client {
    public static void main(String[] args) {
        Cs3524Client client = new Cs3524Client("localhost", 50000);
        client.run();
    }
}
