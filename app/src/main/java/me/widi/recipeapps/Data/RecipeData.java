package me.widi.recipeapps.Data;

import java.util.ArrayList;

import me.widi.recipeapps.Adapter.RecipeAdapter;

public class RecipeData {
    public static String[][] data = new String[][]{
            {"Saus Bistik", "Masakan Kampung",
                    "https://1.bp.blogspot.com/-YIQPj4mRm88/Vd3LIZFUZhI/AAAAAAAAAgs/j_ghmgqRSEE/s1600/steak%2Bayam%2Bsaus%2Bpedas.jpg",
                    " 1.\tSetelah selesai dengan daging bistik, selajutnya kita akan buat saus kecap manisnya dengan memanaskan minyak dalam wajan kemduian tumis irisan bawang merah hingga tercium aroma harum.\n" +
                            "2.\tSelanjutnya masukkan kuah kaldu sapi kedalam tumisa tersebut dan aduk-aduk hingga menjadi rata.\n" +
                            "3.\tTambahkan lada, kecap manis, garam dan pala secukupnya hingga rasa dan bumbu dirasa pas. Kemudian aduk kembali hingga merata.\n" +
                            "4.\tSelanjutnya masak saus bistik daging hingga mendidih. Angkat dan matikan.\n"
            },
            {
                    "Mie Ayam Ceker", "Makan Siang",
                    "https://selerasa.com/images/mie/Mie_ayam/12-mie-ayam-ceker-pedas-yang-fresh.jpg",
                    "1.\tSiapkan mangkok lalu tambahkan bumbu, yakni 1 sdt minyak ayam dan ½ sdt kecap asin.\n" +
                            "2.\tRebus mie yang telah anda persiapkan bersama dengan sawi hijau ke dalam air.\n" +
                            "3.\tangkat mie tersebut setelah matang, lalu kemudian letakan di dalam mangkok yang telah dipersiapkan.\n" +
                            "4.\tAduk rata mie dan sawi hijau beserta bumbu dalam mangkok.\n" +
                            "5.\tLetakan tumisan ceker, ayam dan jamur di bagian atas, kemudian tata dengan menarik.\n" +
                            "6.\tTambahkan sambal dan pangsit sesuai dengan selera anda masing masing.\n" +
                            "7.\tSajikan selagi hangat kepada keluarga anda.\n"
            },
            {
                    "Sate Madura", "Makan Malam",
                    "https://img-global.cpcdn.com/003_recipes/3cdd2c698200568c/400x400cq70/photo.jpg",
                    "1.\tCuci ayam sampai bersih, potong berbentuk dadu. Lumuri ayam dengan jeruk nipis dan garam. Tusukkan ayam pada tusuk sate.\n" +
                            "2.\tHaluskan semua bahan bumbu(saya bahannya dihaluskan pakai chopper/diulek,trus ditambah air. bisa jg diblender sih, teksturnya lbh halus). Tumis bumbu dengan minyak sambil diaduk hingga mengental. Matikan api.\n" +
                            "\n" +
                            "3.\tAmbil 3 sdm bumbu, tambahkan 1 sdm kecap dan 1 sdm air sebagai bahan celupan sebelum dibakar.biarkan selama minimal 20 menit agar bumbu meresap. (Bisa juga disimpan semalam di kulkas agar lebih meresap)\n" +
                            "4.\tBakar sate hingga berwarna kecoklatan.\n" +
                            "5.\tAngkat, sajikan sate ayam dengan bumbu kacang dan bahan pelengkap.\n" +
                            "\n" +
                            "\n"
            }
    };

    public static ArrayList<RecipeAdapter> getListData() {
        RecipeAdapter bg = null;
        ArrayList<RecipeAdapter> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            bg = new RecipeAdapter();
            bg.setName(data[i][0]);
            bg.setDesc(data[i][1]);
            bg.setPhoto(data[i][2]);
            bg.setRecipe(data[i][3]);


            list.add(bg);
        }

        return list;
    }

}
