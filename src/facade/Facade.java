package facade;

class Facade {
    private Guitar guitar;
    private Amp amp;
    private Cable cable;

    Facade(Guitar guitar, Amp amp, Cable cable) {
        this.guitar = guitar;
        this.amp = amp;
        this.cable = cable;
    }

    @SuppressWarnings("SameParameterValue")
    void playGuitar(String songName){
        guitar.on();
        amp.on();
        cable.connectTo(guitar);
        cable.connectTo(amp);
        guitar.play(songName);
    }
}