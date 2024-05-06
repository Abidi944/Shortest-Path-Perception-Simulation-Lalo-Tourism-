import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Graph data = new Graph();

        //mataram
        data.addVertex("Ampenan", false);
        data.addVertex("Pantai Ampenan", true);
        data.addVertex("Kota Tua", true);
        data.addVertex("Selaparang", false);
        data.addVertex("Taman Udayana", true);
        data.addVertex("Mataram", false);
        data.addVertex("Epicentrum Mall", true);
        data.addVertex("Islamic Center", true);
        data.addVertex("Sekarbela", false);
        data.addVertex("Pantai Selingkuh", true);
        data.addVertex("Pantai Senja", true);
        data.addVertex("Sandubaya", false);
        data.addVertex("Cakranegara", false);
        data.addVertex("Mataram Mall", true);
        data.addVertex("Taman Mayura", true);

        // Lombok Utara
        data.addVertex("Pemenang", false);
        data.addVertex("Gili", true);
        data.addVertex("Pantai Nipah", true);
        data.addVertex("Malaka", true);
        data.addVertex("Tanjung", false);
        data.addVertex("Lombok Wildlife", true);
        data.addVertex("Pantai Sire", true);
        data.addVertex("Gangga", false);
        data.addVertex("Tiu Kerta Gangga", true);
        data.addVertex("Tiu Pupus", true);
        data.addVertex("Tiu Pituq", true);
        data.addVertex("Kayangan", false);
        data.addVertex("Tiu Sekeper", true);
        data.addVertex("Tiu Umbak", true);
        data.addVertex("Pantai Ketapang Kampes", true);
        data.addVertex("Bayan", false);
        data.addVertex("Tiu Kelep", true);
        data.addVertex("Air Terjun Sendang Gile", true);
        data.addVertex("Masjid Kuno Bayan", true);
        
        //lombok barat
        data.addVertex("Batu Layar", false);
        data.addVertex("Pantai Tanjung Bias", true);
        data.addVertex("Tanjungan", true);
        data.addVertex("Makam Batu Layar", true);
        data.addVertex("Tanjungan", true);
        data.addVertex("Pantai Kerandangan 3", true);
        data.addVertex("Gunung Sari", false);
        data.addVertex("Air Terjun Tibu Ijo", true);
        data.addVertex("Bukit elen", true);
        data.addVertex("Air Terjun Geripak", true);
        data.addVertex("Bukit Tembere", true);
        data.addVertex("Lingsar", false);
        data.addVertex("Air Terjun Timponan", true);
        data.addVertex("Dewi Anjani Waterpark", true);
        data.addVertex("Narmada", false);
        data.addVertex("Aiknyet", true);
        data.addVertex("Gunung Jae", true);
        data.addVertex("Bunut Ngengkang", true);
        data.addVertex("Kediri", false);
        data.addVertex("Labuapi", false);
        data.addVertex("Pantai Kuranji", true);
        data.addVertex("Pantai karang Bangket", true);
        data.addVertex("Kuripan", false);
        data.addVertex("Gerung ", false);
        data.addVertex("Pantai induk", true);
        data.addVertex("Palar Indah", true);
        data.addVertex("Lembar", false);
        data.addVertex("Pantai Cemare", true);
        data.addVertex("Pantai Napak Tilas", true);
        data.addVertex("Bunbeleng", true);
        data.addVertex("Sekotong", false);
        data.addVertex("Pantai Elak-Elak", true);
        data.addVertex("Pantai Goa Landak", true);
        data.addVertex("Pantai Batudaeng", true);

        // Lombok Tengah
        data.addVertex("Batukliang", false);
        data.addVertex("Batukliang Utara", false);
        data.addVertex("Janapria", false);
        data.addVertex("Jonggat", false);
        data.addVertex("Kopang", false);
        data.addVertex("Praya", false);
        data.addVertex("Pringgarata", false);
        data.addVertex("Pujut", false);
        data.addVertex("Pantai Selong Belanak", true);
        data.addVertex("Pantai Kuta", true);
        data.addVertex("Air Terjun Benang Kelambu", true);
        data.addVertex("Air Terjun Sesere", true);
        data.addVertex("Aik Bukak",true);
        data.addVertex("Desa Sade", true);
        data.addVertex("Merese", true);
        data.addVertex("Desa Sukarara", true);
        data.addVertex("Praya Barat", false);
        data.addVertex("Praya Barat Daya", false);
        data.addVertex("Praya Tengah", false);
        data.addVertex("Praya Timur", false);

        // Lombok Timur
        data.addVertex("Aikmel", false);
        data.addVertex("Jerowaru", false);
        data.addVertex("Keruak", false);
        data.addVertex("Labuhan Haji", false);
        data.addVertex("Lenek", false);
        data.addVertex("Masbagik", false);
        data.addVertex("Montong Gading", false);
        data.addVertex("Pringgabaya", false);
        data.addVertex("Pringgasela", false);
        data.addVertex("Sakra", false);
        data.addVertex("Sakra Barat", false);
        data.addVertex("Sakra Timur", false);
        data.addVertex("Sambelia", false);
        data.addVertex("Selong", false);
        data.addVertex("Sembalun", false);
        data.addVertex("Sikur", false);
        data.addVertex("Suela", false);
        data.addVertex("Sukamulia", false);
        data.addVertex("Suralaga", false);
        data.addVertex("Terara", false);
        data.addVertex("Wanasaba", false);
        data.addVertex("Kolam Pesanggerahan", true);
        data.addVertex("Pantai Surga", true);
        data.addVertex("Pantai Sungkun", true);
        data.addVertex("Pantai Kaliantan", true);
        data.addVertex("Pantai Cemara", true);
        data.addVertex("Pantai Pink", true);
        data.addVertex("Pantai Ekas", true);
        data.addVertex("Pantai Tanjung Bloam", true);
        data.addVertex("Pantai Penyisok", true);
        data.addVertex("Gili Sunut", true);
        data.addVertex("Tanjung Ringgit", true);
        data.addVertex("Tanjung Perak", true);
        data.addVertex("Pulau Maringkik", true);
        data.addVertex("Kebon Telage", true);
        data.addVertex("Pantai Tajoh", true);
        data.addVertex("Muara Selayar", true);
        data.addVertex("Pantai Lungkak", true);
        data.addVertex("Pantai Labuhan Haji", true);
        data.addVertex("Pantai Sepolong", true);
        data.addVertex("Pemandian Loang Gali", true);
        data.addVertex("Perkemahan Tangkok Adeng", true);
        data.addVertex("Desa Wisata Penakak", true);
        data.addVertex("Air terjun Pancor Kopong", true);
        data.addVertex("Otak Kokok Joben", true);
        data.addVertex("Pantai Tanjung Menangis", true);
        data.addVertex("Bukit Kayangan", true);
        data.addVertex("Goa Biawak", true);
        data.addVertex("Pantai Kerakat", true);
        data.addVertex("Seruni Mumbul Park", true);
        data.addVertex("Pohon Purba", true);
        data.addVertex("Pantai Pidana", true);
        data.addVertex("Air terjun Goa Kopong", true);
        data.addVertex("Sungai Mencerit", true);
        data.addVertex("Air terjun Semporonan", true);
        data.addVertex("Taman Wisata Aik Seleong", true);
        data.addVertex("Gunung Kukus", true);
        data.addVertex("Bendungan Pandan Duri", true);
        data.addVertex("Pengkelak Mas", true);
        data.addVertex("Menange Rambang", true);
        data.addVertex("Gili Lampu", true);
        data.addVertex("Gili Kapal", true);
        data.addVertex("Gili Kondo", true);
        data.addVertex("Gili Bidara", true);
        data.addVertex("Gili Petagan", true);
        data.addVertex("Taman Tugu", true);
        data.addVertex("Taman Rinjani", true);
        data.addVertex("Kedai Sawah", true);
        data.addVertex("Taman Surga Rinjani", true);
        data.addVertex("Wisata Pusuk", true);
        data.addVertex("Sajang Glamping", true);
        data.addVertex("Air terjun Mangku Sakti", true);
        data.addVertex("Air terjun Umar Maya", true);
        data.addVertex("Bukit Selong", true);
        data.addVertex("Bukit Pergasingan", true);
        data.addVertex("Bukit Anak Dara", true);
        data.addVertex("Bukit Savana Propok", true);
        data.addVertex("Bukit Nanggi", true);
        data.addVertex("Air terjun Sarang Walet", true);
        data.addVertex("Air terjun Jeruk Manis", true);
        data.addVertex("Kebon Raya Lemor", true);
        data.addVertex("Kebun Raja Selaparang", true);
        data.addVertex("Bukit Pal Jepang", true);
        data.addVertex("Padamara Grape", true);
        data.addVertex("Everlend Waterpark", true);
        data.addVertex("Kolam Zamzara", true);
        data.addVertex("Kolam Embulan Boroq Dewi Anjani", true);

        // edge klu
        data.insertEdge("Pemenang", "Tanjung", 9);
        data.insertEdge("Tanjung", "Gangga", 12);
        data.insertEdge("Gangga", "Kayangan", 6);
        data.insertEdge("Kayangan", "Bayan", 20);
        data.insertEdge("Bayan", "Sembalun", 24);
        data.insertEdge("Pemenang", "Gili", 2);
        data.insertEdge("Pemenang", "Pantai Nipah", 12);
        data.insertEdge("Pemenang", "Malaka", 12);
        data.insertEdge("Pantai Nipah", "Malaka", 2);
        data.insertEdge("Tanjung", "Lombok Wildlife", 8);
        data.insertEdge("Tanjung", "Pantai Sire", 9);
        data.insertEdge("Gangga", "Tiu Kerta Gangga", 9);
        data.insertEdge("Gangga", "Tiu Pupus", 4);
        data.insertEdge("Gangga", "Tiu Pituq", 4);
        data.insertEdge("Tiu Pupus", "Tiu Pituq", 1);
        data.insertEdge("Kayangan", "Tiu Sekeper", 11);
        data.insertEdge("Kayangan", "Tiu Umbak", 11);
        data.insertEdge("Kayangan", "Pantai Ketapang Kampes", 5);
        data.insertEdge("Tiu Sekeper", "Tiu Umbak", 1);
        data.insertEdge("Bayan", "Tiu Kelep", 11);
        data.insertEdge("Bayan", "Air Terjun Sendang Gile", 11);
        data.insertEdge("Bayan", "Masjid Kuno Bayan", 5);
        data.insertEdge("Tiu Kelep", "Air Terjun Sendang Gile", 5);

        // edge lobar
        data.insertEdge("Batu Layar", "Gunung Sari", 2);
        data.insertEdge("Gunung Sari", "Lingsar", 10);
        data.insertEdge("Lingsar", "Narmada", 6);
        data.insertEdge("Narmada", "Labuapi", 13);
        data.insertEdge("Kuripan", "Labuapi", 10);
        data.insertEdge("Kuripan", "Kediri", 7);
        data.insertEdge("Kuripan", "Gerung", 5);
        data.insertEdge("Narmada", "Kediri", 10);
        data.insertEdge("Kediri", "Labuapi", 5);
        data.insertEdge("Kediri", "Gerung", 8);
        data.insertEdge("labuapi", "Gerung", 7);
        data.insertEdge("Gerung", "Lembar", 4);
        data.insertEdge("Lembar", "Sekotong", 40);

        // edge mataram
        data.insertEdge("Ampenan", "Selaparang", 5);
        data.insertEdge("Ampenan", "Sekarbela", 4);
        data.insertEdge("Selaparang", "Sekarbela", 6);
        data.insertEdge("Selaparang", "Mataram", 2);
        data.insertEdge("Selaparang", "Cakranegara", 4);
        data.insertEdge("Sekarbela", "Mataram", 4);
        data.insertEdge("Mataram", "Cakranegara", 4);
        data.insertEdge("Mataram", "Sandubaya", 7);
        data.insertEdge("Cakranegara", "Sandubaya", 3);
        data.insertEdge("Ampenan", "Pantai Ampenan", 2);
        data.insertEdge("Ampenan", "Kota Tua", 1);
        data.insertEdge("Pantai Ampenan", "Kota Tua", 1);
        data.insertEdge("Selaparang", "Taman Udayana", 3);
        data.insertEdge("Selaparang", "Taman Udayana", 3);
        data.insertEdge("Mataram", "Epicentrum Mall", 3);
        data.insertEdge("Mataram", "Islamic Center", 1);
        data.insertEdge("Sekarbela", "Pantai Selingkuh", 11);
        data.insertEdge("Sekarbela", "Pantai Senja", 2);
        data.insertEdge("Cakranegara", "Mataram Mall", 1);
        data.insertEdge("Cakranegara", "Taman Mayura", 1);

        // edge loteng
        data.insertEdge("Batukliang", "Batukliang Utara", 6);
        data.insertEdge("Kopang", "Batukliang Utara", 11);
        data.insertEdge("Batukliang", "Kopang", 6);
        data.insertEdge("Janapria", "Kopang", 11);
        data.insertEdge("Batukliang", "Praya", 12);
        data.insertEdge("Praya", "Janapria", 18);
        data.insertEdge("Praya", "Jonggat", 5);
        data.insertEdge("Pringgarata", "Jonggat", 9);
        data.insertEdge("Pringgarata", "Jonggat", 9);
        data.insertEdge("Pringgarata", "Batukliang", 8);
        data.insertEdge("Pringgarata", "Batukliang Utara", 8);
        data.insertEdge("Pujut", "Praya", 25);
        data.insertEdge("Pujut", "Janapria", 30);
        data.insertEdge("Praya", "Praya Barat", 26);
        data.insertEdge("Praya Tengah", "Praya Barat", 29);
        data.insertEdge("Pujut", "Praya Barat", 18);
        data.insertEdge("Pujut", "Praya Timur", 24);
        data.insertEdge("Janapria", "Praya Timur", 11);
        data.insertEdge("Praya Barat Daya", "Praya Timur", 23);
        data.insertEdge("Praya Barat Daya", "Jonggat", 14);
        data.insertEdge("Praya Barat", "Pantai Selong Belanak", 1);
        data.insertEdge("Pujut", "Pantai Kuta", 1);
        data.insertEdge("Air Terjun Benang Kelambu", "Air Terjun Sesere", 3);
        data.insertEdge("Batukliang Utara", "Aik Bukak", 10);
        data.insertEdge("Aik Bukak", "Air Terjun Benang Kelambu", 6);
        data.insertEdge("Desa Sade", "Pujut", 6);
        data.insertEdge("Desa Sade", "Pantai Kuta", 7);
        data.insertEdge("Desa Sakurara", "Jonggat", 2);
        data.insertEdge("Pujut", "Merese", 10);
        data.insertEdge("Merese", "Pantai Kuta",9);

        // edge lotim
        data.insertEdge("Aikmel", "Wanasaba", 7);
        data.insertEdge("Aikmel", "Lenek", 3);
        data.insertEdge("Jerowaru", "Keruak", 16);
        data.insertEdge("Keruak", "Sakra Barat", 6);
        data.insertEdge("Labuan Haji", "Selong", 5);
        data.insertEdge("Labuan Haji", "Sikur", 19);
        data.insertEdge("Labuan Haji", "Keruak", 22);
        data.insertEdge("Labuan Haji", "Lenek", 15);
        data.insertEdge("Labuan Haji", "Sakra Timur", 6);
        data.insertEdge("Lenek", "Masbagik", 10);
        data.insertEdge("Lenek", "Suralaga", 2);
        data.insertEdge("Masbagik", "Sukamulia", 8);
        data.insertEdge("Masbagik", "Sikur", 3);
        data.insertEdge("Montong Gading", "Sikur", 1);
        data.insertEdge("Montong Gading", "Terara", 8);
        data.insertEdge("Pringgabaya", "Labuan Haji", 17);
        data.insertEdge("Pringgabaya", "Wanasaba", 14);
        data.insertEdge("Pringgabaya", "Sambelia", 44);
        data.insertEdge("Pringgabaya", "Suela", 8);
        data.insertEdge("Pringgabaya", "Masbagik", 8);
        data.insertEdge("Pringgabaya", "Suralaga", 7);
        data.insertEdge("Pringgabaya", "Montong Gading", 12);
        data.insertEdge("Sakra", "Selong", 8);
        data.insertEdge("Sakra", "Sakra Barat", 7);
        data.insertEdge("Sakra", "Sakra Timur", 9);
        data.insertEdge("Sakra Barat", "Sakra Timur", 10);
        data.insertEdge("Sakra Barat", "Sikur", 19);
        data.insertEdge("Sambelia", "Sembalun", 39);
        data.insertEdge("Selong", "Masbagik", 11);
        data.insertEdge("Selong", "Suralaga", 8);
        data.insertEdge("Sembalun", "Suela", 23);
        data.insertEdge("Sikur", "Terara", 9);
        data.insertEdge("Suela", "Wanasaba", 5);
        data.insertEdge("Sukamulia", "Suralaga", 8);
        data.insertEdge("Aikmel", "Kolam Pesanggerahan", 1);
        data.insertEdge("Jerowaru", "Pantai Surga", 13);
        data.insertEdge("Jerowaru", "Pantai Sungkun", 14);
        data.insertEdge("Jerowaru", "Pantai Kaliantan", 8);
        data.insertEdge("Jerowaru", "Pantai Cemara", 5);
        data.insertEdge("Jerowaru", "Pantai Pink", 11);
        data.insertEdge("Jerowaru", "Gili Sunut", 14);
        data.insertEdge("Jerowaru", "Tanjung Ringgit", 15);
        data.insertEdge("Jerowaru", "Tanjung Perak", 13);
        data.insertEdge("Jerowaru", "Pantai Ekas", 9);
        data.insertEdge("Jerowaru", "Pantai Tanjung Bloam", 13);
        data.insertEdge("Jerowaru", "Pantai Penyisok", 11);
        data.insertEdge("Keruak", "Pulau Maringkik", 28);
        data.insertEdge("Keruak", "Kebon Telage", 17);
        data.insertEdge("Keruak", "Pantai Tajoh", 7);
        data.insertEdge("Keruak", "Muara Selayar", 9);
        data.insertEdge("Keruak", "Pantai Lungkak", 7);
        data.insertEdge("Labuhan Haji", "Pantai Labuhan Haji", 5);
        data.insertEdge("Labuhan Haji", "Pantai Sepolong", 7);
        data.insertEdge("Lenek", "Pemandian Loang Gali", 4);
        data.insertEdge("Lenek", "Perkemahan Tangkok Adeng", 12);
        data.insertEdge("Masbagik", "Desa Wisata Penakak", 6);
        data.insertEdge("Masbagik", "Air terjung Pancor Kopong", 4);
        data.insertEdge("Montong Gading", "Otak Kokok Joben", 7);
        data.insertEdge("Pringgabaya", "Pantai Tanjung Menangis", 4);
        data.insertEdge("Pringgabaya", "Bukit Kayangan", 9);
        data.insertEdge("Pringgabaya", "Pantai Kerakat", 5);
        data.insertEdge("Pringgabaya", "Goa Biawak", 9);
        data.insertEdge("Pringgabaya", "Seruni Mumbul Park", 8);
        data.insertEdge("Pringgabaya", "Pohon Purba", 12);
        data.insertEdge("Pringgabaya", "Pantai Pidana", 13);
        data.insertEdge("Pringgasela", "Air terjung Goa Kopong", 5);
        data.insertEdge("Pringgasela", "Sungai Mencerit", 5);
        data.insertEdge("Pringgasela", "Air terjun Semporonan", 3);
        data.insertEdge("Pringgasela", "Taman Aik Seleong", 6);
        data.insertEdge("Pringgasela", "Gunung Kukus", 7);
        data.insertEdge("Sakra", "Bendungan Pandan Duri", 8);
        data.insertEdge("Sakra Barat", "PengkelakMas", 5);
        data.insertEdge("Sakra Timur", "Menange Rambang", 3);
        data.insertEdge("Sambelia", "Gili Lampu", 32);
        data.insertEdge("Sambelia", "Gili Kapal", 32);
        data.insertEdge("Sambelia", "Gili Kondo", 32);
        data.insertEdge("Sambelia", "Gili Bidara", 23);
        data.insertEdge("Sambelia", "Gili Petagan", 27);
        data.insertEdge("Selong", "Taman Tugu", 1);
        data.insertEdge("Selong", "Taman Rinjani", 3);
        data.insertEdge("Sembalun", "Kedai Sawah", 3);
        data.insertEdge("Sembalun", "Taman Surga Rinjani", 2);
        data.insertEdge("Sembalun", "Wisata Pusuk", 8);
        data.insertEdge("Sembalun", "Air terjun Mangku Sakti", 16);
        data.insertEdge("Sembalun", "Air terjun Umar Maya", 25);
        data.insertEdge("Sembalun", "Bukit Selong", 7);
        data.insertEdge("Sembalun", "Bukit Pergasingan", 3);
        data.insertEdge("Sembalun", "Bukit Anak Dara", 2);
        data.insertEdge("Sembalun", "Bukit Savana Propok", 11);
        data.insertEdge("Sembalun", "Bukit Nanggi", 5);
        data.insertEdge("Sikur", "Air terjun Sarang Walet", 6);
        data.insertEdge("Sikur", "Air terjun Jeruk Manis", 10);
        data.insertEdge("Suela", "Kebun Raya Lemor", 2);
        data.insertEdge("Suela", "Makam Raja Selaparang", 4);
        data.insertEdge("Suela", "Bukit Pal Jepang", 13);
        data.insertEdge("Sukamulia", "Padamara Grape", 4);
        data.insertEdge("Suralaga", "Kolam Embulan Boroq Dewi Anjani", 3);
        data.insertEdge("Terara", "Everlend Waterpark", 2);
        data.insertEdge("Wanasaba", "Kolam Zamzara", 8);

        // lotim klu
        data.insertEdge("Sembalun", "Bayan", 20);

        // lotim loteng
        data.insertEdge("Terara", "Kopang", 8);

        // lobar
        data.insertEdge("Batu Layar", "Ampenan", 5);
        data.insertEdge("Gunung Sari", "Selaparang", 3);
        data.insertEdge("Sandubaya", "Narmada", 7);
        data.insertEdge("Narmada", "Pringgarata", 7);
        data.insertEdge("Batu Layar", "Pemenang",20);
        data.insertEdge("Sandubaya", "Lingsar",5);
        data.insertEdge("Sekarbela", "Labuapi",9);
        data.insertEdge("Batu Layar", "Ampenan", 10);
        data.insertEdge("Batu Layar", "Pantai Tanjung Bias", 3);
        data.insertEdge("Batu Layar", "Makam Batu Layar", 2);
        data.insertEdge("Tanjung Bias", "Makam Batu Layar", 3);
        data.insertEdge("Makam Batu Layar", "Tanjungan", 3);
        data.insertEdge("Tanjungan", "Pantai Kerandangan 3", 4);
        data.insertEdge("Gunung Sari", "Air Terjun Tibu Ijo", 7);
        data.insertEdge("Gunung Sari", "Bukit Elen", 9);
        data.insertEdge("Gunung Sari", "Air Terjun Geripak", 8);
        data.insertEdge("Gunung Sari", "Bukit Tembere", 3);
        data.insertEdge("Lingsar", "Dewi Anjani Waterpark", 5);
        data.insertEdge("Lingsar", "Bukit Tembere", 10);
        data.insertEdge("Narmada", "Aiknyet", 10);
        data.insertEdge("Narmada", "Gunung Jae", 9);
        data.insertEdge("Narmada", "Bunut Ngengkang", 11);
        data.insertEdge("Labuapi", "Pantai Kuranji", 8);
        data.insertEdge("Labuapi", "Pantai Karang Bangket", 8);
        data.insertEdge("Lembar", "Pantai Cemare", 5);
        data.insertEdge("Lembar", "Pantai Napak Tilas", 6);
        data.insertEdge("Lembar", "Bunbeleng", 10);
        data.insertEdge("Gerung", "Pantai induk", 7);
        data.insertEdge("Gerung", "Palar Indah", 8);
        data.insertEdge("Sekotong", "Pantai Elak-Elak", 9);
        data.insertEdge("Sekotong", "Pantai Goa Landak", 20);
        data.insertEdge("Sekotong", "Pantai Batudaeng", 8);
        data.insertEdge("Sekotong", "Praya Barat Daya", 45);
        data.insertEdge("Kediri", "Pringgarata", 12);
        data.insertEdge("Kediri", "Sandubaya", 5);
        data.insertEdge("Labuapi", "Sekarbela", 1);
       
        Scanner sc = new Scanner(System.in);
        String choose2;
        boolean x = true;
        Vertex startVertex = null;
        int totalDistanceTraveled = 0;
        String[] visitedPlaces = new String[100];
        int visitIndex = 0;

        System.out.println();
        System.out.println("=========================================================================== DAFTAR WISATA PULAU LOMBOK ========================================================================");
        data.dfsTraversal();
        System.out.println("\n==============================================================================================================================================================================");
        while (x) {
            if (startVertex == null) {
                System.out.print("Pilih Asal: ");
                choose2 = sc.nextLine();

                startVertex = data.searchVertex(choose2);
                if (startVertex == null) {
                    System.out.println("Asal tidak valid.");
                    continue;
                }
            }
            System.out.println("\n==============================================================================================================================================================================");
            System.out.print("Pilih Tujuan: ");
            choose2 = sc.nextLine();

            Vertex destinationVertex = data.searchVertex(choose2);

            if (destinationVertex != null) {
                data.dijkstra(startVertex, destinationVertex);
                int currentDistance = destinationVertex.distance;

                System.out.println("Jarak dari " + startVertex.daerah + " menuju " + destinationVertex.daerah + ": " + currentDistance);
                totalDistanceTraveled += currentDistance;
                visitedPlaces[visitIndex] = destinationVertex.daerah;
                visitIndex++;
            } else {
                System.out.println("Tujuan tidak valid.");
            }

            startVertex = destinationVertex;
            data.resetDistances();
            data.resetGraph();

            System.out.print("Lanjutkan? (y/n): ");
            String continueChoice = sc.nextLine();
            x = continueChoice.equalsIgnoreCase("y");
        }

        System.out.println("================================================================================== HASIL PERJALANAN =================================================================================");
        System.out.println("Anda telah mengunjungi tempat-tempat berikut:");
        for (int i = 0; i < visitIndex; i++) {
            System.out.println("- " + visitedPlaces[i]);
        }
        System.out.println("Dengan total jarak tempuh : " + totalDistanceTraveled);
        sc.close();
    }
}