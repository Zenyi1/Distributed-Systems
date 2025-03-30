package cs3524example.cs3524server;

public class RunCs3524Server {
    public static void main(String[] args) {
        // java cs3524example.cs3524server.RunServer --no-attach --port=50000
        // String[] args = ["--no-attach", "--port=50000"];

        Cs3524Server server = new Cs3524Server(50000);
        server.run();
    }
}
