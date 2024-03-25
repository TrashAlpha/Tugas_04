package LCD;

public class LCD {
    //isi bagian ini
    private String Status;
    private int Volume;
    private int Brightness;
    private String Cable;

    // Status bernilai "Mati" bila method ini dipanggil
    public void turnOff(){
        this.Status = "Mati";
    }

    // Status bernilai "Hidup" bila method ini dipanggil
    public void turnOn(){
        this.Status = "Hidup";
    }

    // Status bernilai "Freeze" bila method ini dipanggil
    public void Freeze(){
        this.Status = "Freeze";
    }
    
    // Volume bertambah 1 apabila method ini diipanggil
    public void volumeUp(){
        this.Volume += 1;
    }

    // Volume berkurang 1 apabila method ini dipanggil
    public void volumeDown(){
        this.Volume -= 1;
    }

    // Volume bernilai vol apabila method ini dipanggil
    public void setVolume(int vol){
        this.Volume = vol;
    }

    // Brightness bertambah 1 apabila method ini dipanggil
    public void brightnessUp(){
        this.Brightness += 1;
    }

    // Brightness berkurang 1 apabila method ini dipanggil
    public void brightnessDown(){
        this.Brightness -= 1;
    }

    // Brightness bernilai bright apabila method ini dipanggil
    public void setBrightness(int bright){
        this.Brightness = bright;
    }
    //buat method yang ada pada soal 

    // Method untuk mengeset cable
    public void setCable(int option) {
        //lengkapi method ini dengan mennggunakan array
        String[] cableOption = new String[]{"VGA", "DVI", "HDMI", "DisplayPort"}; // membuat dan menginisiasi array
        if (option < cableOption.length){ // ini biar kalau option lebih besar dari panjang array, maka tidak terjadi error
            this.Cable = cableOption[option];
        }
    }
   
    // Method untuk menampilkan pesan
    public void displayMessage() {
        //lengkapi method ini
        System.out.println("LCD Status: " + Status);
        System.out.println("Volume: " + Volume);
        System.out.println("Brightness: " + Brightness);
        System.out.println("Cable: " + Cable);
    }
}
