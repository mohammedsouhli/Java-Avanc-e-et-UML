import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientHandler implements Runnable {

    private Socket clientSocket;

    public ClientHandler(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        String clientIP = clientSocket.getInetAddress().toString();
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " traite le client");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String message;
            while ((message = in.readLine()) != null) {
                System.out.println("Message recu : " + message);

                switch (message.trim().toLowerCase()) {
                    case "hello":
                        out.println("Bonjour client !");
                        break;

                    case "time":
                        String maintenant = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
                        out.println("Date et heure actuelles : " + maintenant);
                        break;

                    case "bye":
                        out.println("Connexion fermee");
                        clientSocket.close();
                        return;

                    default:
                        out.println("Message recu : " + message);
                }
            }
        } catch (IOException e) {
            System.out.println("Erreur avec le client " + clientIP + " : " + e.getMessage());
        }
    }
}
