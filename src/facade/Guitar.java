package facade;

class Guitar {
    void on() {
        System.out.println("Switch on guitar");
    }

    void play(String songName) {
        System.out.println("Play song '" + songName + "'");
    }
}