package adapter;

class Adapter { // adapter class
    private Server server;

    Adapter() {
        this.server = new Server();
    }

    void infoFromServer() {
        server.serverInfo();
    }
}