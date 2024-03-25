package Tugas1;

public class Main {
    public static class Mahasiswa {
        String nama;
        int nim;
        String prodi;
        int tahunmasuk;
        Transkrip[] transkrip;
    }

    public static class Kursus {
        String nama;
        int kodematkul;
        int sks;
    }

    public static class Transkrip {
        Mahasiswa mhs;
        Kursus kursus;
        int nilai;
    }

    public static void addTranscript(Mahasiswa mahasiswa, Transkrip transkrip, Transkrip[] transkrips) {
        Transkrip[] transkripBaru = new Transkrip[transkrips.length + 1];
        for (int i = 0; i < transkrips.length; i++) {
            transkripBaru[i] = transkrips[i];
        }
        transkripBaru[transkrips.length] = transkrip;
        mahasiswa.transkrip = transkripBaru;
    }

    public static void title(Mahasiswa mhs, Transkrip[] transkrips) {
        System.out.println("Transkrip nilai untuk " + mhs.nama + ":");
        for (Transkrip transcript : transkrips) {
            if (transcript != null && transcript.mhs == mhs) {
                cetakTranscript(transcript);
            }
        }
    }

    public static void cetakTranscript(Transkrip transcript) {
        System.out.println(transcript.kursus.nama + ": " + transcript.nilai);
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        //LENGKAPI CODE DISINI (5)

        Mahasiswa mhs2 = new Mahasiswa();
        //LENGKAPI CODE DISINI (2.5)

        Kursus mk1 = new Kursus();
        //LENGKAPI CODE DISINI (5)

        Kursus mk2 = new Kursus();
        //LENGKAPI CODE DISINI (2.5)

        Transkrip[] transcripts = new Transkrip[4];

        Transkrip t1 = new Transkrip();
        //LENGKAPI CODE DISINI (7.5)

        Transkrip t2 = new Transkrip();
        //LENGKAPI CODE DISINI (2.5)

        Transkrip t3 = new Transkrip();
        //LENGKAPI CODE DISINI (2.5)

        Transkrip t4 = new Transkrip();
        //LENGKAPI CODE DISINI (2.5)

        // addTranscript(/*LENGKAPI CODE DISINI (5)*/);
        // addTranscript(/*LENGKAPI CODE DISINI (2)*/);
        // title(/*LENGKAPI CODE DISINI (3)*/);
        // addTranscript(/*LENGKAPI CODE DISINI (5)*/);
        // addTranscript(/*LENGKAPI CODE DISINI (2)*/);
        // title(/*LENGKAPI CODE DISINI (3)*/);
    }
}
