/*
Kita kembali kepada class Kucing untuk menambah sesuatu pada class tersebut, 
iaitu constructor, setter, dan getter. 
Kita juga akan melihat pengenalan kepada parameter.
*/

//Constructor

/*
Constructor ialah method yang mempunyai nama yang sama dengan nama class. 
Tujuannya adalah untuk melaksanakan sesuatu code 
sebaik sahaja kita create object daripada class tersebut. 
Kebiasaannya kita letak proses untuk memasukkan data ke 
dalam fields di dalam constructor, contohnya:
*/

package kucing;

public class Kucing {

    String nama;
    int umur;

    public Kucing() {
        nama = "Tiada nama";
        umur = 0;
    }

    public void mengiau() {
        System.out.println("Meow");
    }

    public void minum() {
        System.out.println("Slrrp, slrrp");
    }
}

/*
Ini untuk mengelakkan error, 
contohnya jika kita mengakses 
fields walaupun fields tersebut tidak 
mempunyai data.
*/

//Untuk melihat fungsi constructor, kita boleh create object daripada class Kucing:

package kucing;

public class Main {
    public static void main(String[] args) {
        Kucing kucingSaya = new Kucing();

        System.out.println(kucingSaya.nama);
    }
}

/*
Lihat, kita tidak perlu memasukkan 
data ke dalam fields seperti sebelum ini. 
Program secara automatik akan memasukkan 
data ke dalam fields bergantung kepada apa 
yang kita tentukan di dalam constructor.
*/

//Setter
//Setter ialah method yang digunakan untuk memasukkan data ke dalam fields.

package kucing;

public class Kucing {

    String nama;
    int umur;

    public Kucing() {
        nama = "Tiada nama";
        umur = 0;
    }

    public void setNama(String n) {
        nama = n;
    }

    public void mengiau() {
        System.out.println("Meow");
    }

    public void minum() {
        System.out.println("Slrrp, slrrp");
    }
}

/*
String n yang berada di dalam kurungan setNama() ialah parameter. 
Parameter ialah data yang diperlukan untuk menggunakan method tersebut. 
Contoh kegunaan setter adalah seperti berikut:
*/

package kucing;

public class Main {
    public static void main(String[] args) {
        Kucing kucingSaya = newKucing();
        kucingSaya.setNama("Tompok");
    }
}

/*
Antara kelebihan menggunakan setter ialah kita dapat 
memastikan data yang dimasukkan adalah data yang betul. 
Contohnya umur tidak boleh menjadi negatif, 
jadi kita boleh pastikan nombor yang dimasukkan 
bukan nombor negatif seperti berikut:
*/

package kucing;

public class Kucing {

    String nama;
    int umur;

    public Kucing() {
        nama = "Tiada nama";
        umur = 0;
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setUmur(int u) {
        if (u < 0) {
            System.out.println("Error, umur tidak boleh negatif!");
        } else {
            umur = u;
        }
    }

    public void mengiau() {
        System.out.println("Meow");
    }

    public void minum() {
        System.out.println("Slrrp, slrrp");
    }

}

//Getter

/*
Getter pula ialah method untuk mengakses data. 
Berbeza dengan methods sebelum ini yang menggunakan keyword void, 
untuk mengakses data, kita perlu tukar keyword void 
kepada jenis data yang kita ingin akses. Contohnya, 
jika kita mahu mengakses data dari field nama, 
kita perlu tukar void kepada String:
*/

package kucing;

public class Kucing {

    String nama;
    int umur;

    public Kucing() {
        nama = "Tiada nama";
        umur = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setNama(String n) {
        nama = n;
    }

    public void setUmur(int u) {
        if (u < 0) {
            System.out.println("Error, umur tidak boleh negatif!");
        } else {
            umur = u;
        }
    }

    public void mengiau() {
        System.out.println("Meow");
    }

    public void minum() {
        System.out.println("Slrrp, slrrp");
    }
}

/*
Kita gunakan keyword return untuk akses data tersebut atau dalam 
erti kata lain memulangkan data tersebut.
*/

//Kita boleh menggunakan getter seperti berikut:

package kucing;

public class Main {
    public static void main(String[] args) {
        Kucing kucingSaya = new Kucing();
        System.out.println(kucingSaya.getNama());
    }
}
