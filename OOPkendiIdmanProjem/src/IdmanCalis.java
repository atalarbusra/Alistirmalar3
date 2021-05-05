
import java.util.Scanner;


public class IdmanCalis {
     public void calis()
     {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman programına hoş geldin....");
                
        String idmanlar="Geçerli Hareketler :\n"+
                        "Burpee\n"+
                        "Pushup\n"+
                        "Situp\n"+
                        "Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir idman programı oluşturun....");
        
        System.out.println("Burpee Sayısı :");
        int burpee=scanner.nextInt();
        System.out.println("Pushu Sayısı :");
        int pushup=scanner.nextInt();
        System.out.println("Situp Sayısı :");
        int situp=scanner.nextInt();
        System.out.println("Squat Sayısı :");
        int squat=scanner.nextInt();
        scanner.nextLine();
        
        Idman idman =new Idman(burpee,pushup,situp,squat);
        
        while(idman.IdmanBittiMİ()==false)
        {
            System.out.println("Hareket türünü yazın...");
            String tur=scanner.nextLine();
            System.out.println("Ne kadar yapacaksınız ...");
            int sayi =scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketYap(tur, sayi);
            
        }
     }
    
}
