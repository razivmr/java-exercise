class KenaikanGaji{
    //deklarasi variabel
    private double gajiPokok;
    private double persenNaik;
    private String jabatan;
    private String noPegawai;
    //method inisialiasasi variabel
    public KenaikanGaji(String noPegawai, String jabatan, double gajiPokok, double persenNaik){
        this.noPegawai = noPegawai;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.persenNaik = persenNaik;
    }
    //method return besar nilai gaji baru
    public double getGajiBaru(){
        double gajiBaru = gajiPokok + (persenNaik/100) * gajiPokok;
        return gajiBaru;
    }
    //method return no id pegawai
    public String getNoPegawai(){
        return noPegawai;
    }
    //method return jabatan
    public String getJabatan(){
        return jabatan;
    }
}

public class KenaikanGajiTest {
    public static void main(String[]args){
        KenaikanGaji Santi = new KenaikanGaji("SBY0001", "Manager", 4000000, 5);
        KenaikanGaji Ronny = new KenaikanGaji("BDG0317", "Staff", 2000000, 7.5);
        KenaikanGaji Indra = new KenaikanGaji("JKT0189", "Direktur", 8000000, 3);
        
        double gajiSanti = Santi.getGajiBaru();
        double gajiRonny = Ronny.getGajiBaru();
        double gajiIndra = Indra.getGajiBaru();

        String idSanti = Santi.getNoPegawai();
        String idRonny = Ronny.getNoPegawai();
        String idIndra = Indra.getNoPegawai();

        String jbSanti = Santi.getJabatan();
        String jbRonny = Ronny.getJabatan();
        String jbIndra = Indra.getJabatan();

        //cetak informasi
        System.out.println("\nPROGRAM MENGHITUNG KENAIKAN GAJI");
        System.out.println("___________________________________");

        System.out.println("Santi");
        System.out.println("No Pegawai" + " : " + idSanti);
        System.out.println("Jabatan" + " : " + jbSanti);
        System.out.println("Gaji Baru" + " : " + gajiSanti + "\n");

        System.out.println("Ronny");
        System.out.println("No Pegawai" + " : " + idRonny);
        System.out.println("Jabatan" + " : " + jbRonny);
        System.out.println("Gaji Baru" + " : " + gajiRonny + "\n");

        System.out.println("Indra");
        System.out.println("No Pegawai" + " : " + idIndra);
        System.out.println("Jabatan" + " : " + jbIndra);
        System.out.println("Gaji Baru" + " : " + gajiIndra + "\n");

    }
}
