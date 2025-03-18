package echoexample.echoserver;

public class RunEchoServer {
    public static void main(String[] args) {
        // java echoexample.echoserver.RunServer --no-attach --port=50000
        // String[] args = ["--no-attach", "--port=50000"];

        EchoServer server = new EchoServer(50000);
        server.run();
    }
}
