package Tugas_UAS;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;

/**
 * Created by Yolland on 6/30/2015.
 */

public class Liga {

        private String namaLiga;

        ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();

        //Constructor
        public Liga(String namaLiga) {

            this.namaLiga = namaLiga;
        }

        //Setter and Getter

        public void setNamaLiga(String namaLiga) {

            this.namaLiga = namaLiga;
        }

        public String getNamaLiga() {

            return namaLiga;
        }

        public void setDaftarDivisi(Divisi divisi)
        {

            this.daftarDivisi.add(divisi);
        }

        public ArrayList<Divisi> getDaftarDivisi() {

            return daftarDivisi;
        }

        //test nomer 1
        public void getDaftarDivisi(String liga)
        {
            if (liga == getNamaLiga())
            {
                for (int a = 0; a <daftarDivisi.size() ; a++)
                {
                    System.out.println(daftarDivisi.get(a));
                }
            }
            else
            {
                System.out.println("Tidak Terdapat Divisi");
            }

        }

        //toString
        @Override
        public String toString() {
            return "Nama Liga = " + namaLiga +
                    "\nDaftar Divisi = " + daftarDivisi ;
        }
    }


