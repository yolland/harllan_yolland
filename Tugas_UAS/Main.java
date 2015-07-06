import Tugas_UAS.Divisi;
import Tugas_UAS.Klub;
import Tugas_UAS.Liga;

public class Main {

        public static void main(String[] args) {

            //Liga
            Liga italy = new Liga("Italy");
            Liga spanyol = new Liga("Spanyol");

            //Divisi
            Divisi serieA = new Divisi("Serie A",italy);
            Divisi serieB = new Divisi("Serie B",italy);
            Divisi divisi1 = new Divisi("Divisi1",spanyol);
            Divisi divisi2 = new Divisi("Divisi2",spanyol);

            //Klub
            Klub Persebaya = new Klub("Persebaya Arema",serieA,italy);
            Klub Arema = new Klub("Ac Arema",serieA,italy);
            Klub Persiba = new Klub("AS Roma",serieB,italy);
            Klub Persipura = new Klub("Persipura",serieB,italy);
            Klub Persija = new Klub("Persija Madrid",divisi1,spanyol);
            Klub PSG = new Klub("Barcelona",divisi1,spanyol);
            Klub Man_City = new Klub("Man_CityPersija",divisi2,spanyol);
            Klub Barcelona = new Klub("Barcelona",divisi2,spanyol);

            italy.setDaftarDivisi(serieA);
            italy.setDaftarDivisi(serieB);
            spanyol.setDaftarDivisi(divisi1);
            spanyol.setDaftarDivisi(divisi2);

            serieA.setDaftarKlub(Persebaya);
            serieA.setDaftarKlub(Arema);
            serieB.setDaftarKlub(Persiba);
            serieB.setDaftarKlub(Persipura);
            divisi1.setDaftarKlub(Persija);
            divisi1.setDaftarKlub(PSG);
            divisi2.setDaftarKlub(Man_City);
            divisi2.setDaftarKlub(Barcelona);

            //1. Get daftar divisi by nama liga

            System.out.println("Soal Nomer 1 :");
            System.out.println("Divisi Liga Italy : ");
            italy.getDaftarDivisi("Italy");
            System.out.println();

            //2. Get Daftar Klub by nama liga

            System.out.println("Soal Nomer 2 :");
            System.out.println("Klub Liga Italy : ");
            serieA.getDaftarKlubLiga("Italy");
            System.out.println("Liga Spanyol : ");
            divisi1.getDaftarKlubLiga("Spanyol");
            System.out.println();

            //3. Get Daftar Klub by nama Divisi

            System.out.println("Soal Nomer 3 :");
            System.out.println("Serie A : ");
            serieA.getDaftarKlubDivisi("Serie A");
            System.out.println("Serie B : ");
            serieB.getDaftarKlubDivisi("Serie B");
            System.out.println();

            //4. Get Klub ini berada di divisi mana by nama Klub

            System.out.println("Soal Nomer 4 :");
            Persebaya.getDivisi("Persebaya Arema");
            Persija.getDivisi("Persija Madrid");
            System.out.println();

            //5. Get Klub ini berada di liga apa by nama Klub

            System.out.println("Soal Nomer 5 :");
            Persija.getLiga("Persija Madrid");
        }
    }
