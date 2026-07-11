import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadServer {

    public static void main(String[] args) {
        int port = 5000;
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serveur demarre sur le port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connecte : " + clientSocket.getInetAddress());

                threadPool.submit(new ClientHandler(clientSocket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
