package echoexample.echoclient;

public class RunEchoClient {
    public static void main(String[] args) {
        EchoClient client = new EchoClient("localhost", 50000);
        client.run();
    }
}
