package adapter;

class Adapter { // adapter class
    private Server server = new Server();

    void infoFromServer() {
        server.serverInfo();
    }
}