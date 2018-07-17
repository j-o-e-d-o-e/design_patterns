package adapter;

class Adapter {
    private Server server;

    Adapter() {
        this.server = new Server();
    }

    void infoFromServer() {
        server.serverInfo();
    }
}