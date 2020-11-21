    /*
    -->Toplama Operatörü
    -->Çıkarma Operatörü
    -->Bölme Operatörü
    -->Çarpma Operatörü
    -->Kalan Operatörü
    -->......
    
    
    */
public class Main {
    public static void main(String[] args) {
        System.out.println(3+58.78);
        System.out.println(855-588);
        System.out.println(3-5f);
        System.out.println(10/4);//burada 2 değeri elde etmek bir hata değil 2 verinin int olarak tanımlanmasından kaynaklıdır.
        System.out.println(10/4d);
        System.out.println(58*85);
        System.out.println(58*85.858f);
        //kalan operatörü % ile ifade edilir.
        System.out.println(58%34);
        System.out.println(855%8.58d);
        /*
        Atama ve Arttırma Operatörleri 
        
        */
        int a = 4;
        a = a+2;
        System.out.println(a);
        int b = 6;
        b = b*3;
        System.out.println(b);
        //bu işlemleri kısaltmanın belirli yöntemleri var
        b *=3;
        a -=2;
        System.out.println(a);
        System.out.println(b);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        b--;
        System.out.println(b);
        --b;
        System.out.println(b);
        //posfix ve prefix arasında belirli farklar bulunmaktadır.
        System.out.println(a++);
        //burada değerimiz önceden 6 idi ve direkt 6 yazdırıldı fakat a bir sonraki satıra için 7 değerinde
        System.out.println(a);
        System.out.println(--a);
        //burada ise a hemen eski değeri olan 6 değerine düştü ve son hali ile yazdırıldı.
        //buradaki farklılığın nedeni posfix için önce a yı yazdır sonra arttır şeklinde programın algılıyor olmassından kaynaklanmaktadır.
        //bu tür operatör işlemlerinde karışıklıkları engellemek için parantez kullanmak doğru bir tercihtir.
        
    
    
    
    
    
    
    
    }
    

   
}
