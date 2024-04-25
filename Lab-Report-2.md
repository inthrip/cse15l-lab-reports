# Lab Report 2 - Servers and SSH Keys 
Derrick Burton

## Part 1:
### The code for ChatServer.java:
~~~
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String str = "";
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format(str);
        } 
         else {
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("&");
                String[] msgpart = parameters[0].split("=");
                String msg = msgpart[1];
                String[] userpart = parameters[1].split("=");
                String user = userpart[1];
                str  += user + ": " + msg + "\n";
                return str;
                }
            }
            return "404 Not Found!";
        }
    }


class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
~~~
