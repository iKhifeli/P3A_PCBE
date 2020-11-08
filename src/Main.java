import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Offer o1 = new Offer("Colgate", 133.42, 5);
        Offer o2 = new Offer("BT", 98.32, 5);
        Offer o3 = new Offer("Lenovo", 32.2, 5);
        Offer o4 = new Offer("Redragon", 45.32, 5);
        List<Offer> offers = new ArrayList<Offer>();
        Database db = new Database(offers);
        Server sv = new Server(db);

        Buyer buyer1 = new Buyer("Colgate", 5, sv, "AAA");
        Buyer buyer2 = new Buyer("BT", 5, sv, "BBB");
        Buyer buyer3 = new Buyer("Lenovo", 5, sv, "CCC");
        Buyer buyer4 = new Buyer("Redragon", 5, sv, "DDD");
        Buyer buyer5 = new Buyer("Colgate", 5, sv, "EEE");
        Buyer buyer6 = new Buyer("BT", 5, sv, "FFF");
        Buyer buyer7 = new Buyer("Lenovo", 5, sv, "JJJ");
        Buyer buyer8 = new Buyer("Redragon", 5, sv, "KKK");
        Buyer buyer9 = new Buyer("Colgate", 5, sv, "LLL");
        Seller seller1 = new Seller(o1, sv, "Seller 1");
        Seller seller2 = new Seller(o2, sv, "Seller 2");
        Seller seller3 = new Seller(o3, sv, "Seller 3");
        Seller seller4 = new Seller(o4, sv, "Seller 4");

        Thread thread1 = new Thread(seller1);
        Thread thread2 = new Thread(seller2);
        Thread thread33 = new Thread(seller3);
        Thread thread44 = new Thread(seller4);
        Thread thread3 = new Thread(buyer1);
        Thread thread4 = new Thread(buyer2);
        Thread thread5 = new Thread(buyer3);
        Thread thread6 = new Thread(buyer4);
        Thread thread7 = new Thread(buyer5);
        Thread thread8 = new Thread(buyer6);
        Thread thread9 = new Thread(buyer7);
        Thread thread10 = new Thread(buyer8);
        Thread thread11 = new Thread(buyer9);


        thread1.start();
        thread2.start();
        thread33.start();
        thread44.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();

        /*
        while(thread.isAlive() || thread1.isAlive()){
            // waiting for threads to end their execution
        }
        */
        // or
        try {
            thread1.join();
            thread2.join();
            thread33.join();
            thread44.join();
            thread5.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
            thread10.join();
            thread11.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nBuyers and what the managed to buy :");
        System.out.println(buyer1.getName() + " -> " + buyer1.printAssets());
        System.out.println(buyer2.getName() + " -> " + buyer2.printAssets());
        System.out.println(buyer3.getName() + " -> " + buyer3.printAssets());
        System.out.println(buyer4.getName() + " -> " + buyer4.printAssets());
        System.out.println(buyer5.getName() + " -> " + buyer5.printAssets());
        System.out.println(buyer6.getName() + " -> " + buyer6.printAssets());
        System.out.println(buyer7.getName() + " -> " + buyer7.printAssets());
        System.out.println(buyer8.getName() + " -> " + buyer8.printAssets());
        System.out.println(buyer9.getName() + " -> " + buyer9.printAssets());

        System.out.println("------------------------------------------------");
        System.out.println("\nLeft over offers (they appeared to late in the 'data base' (Empty if none)) : \n");
        System.out.println(db.printOffers());
        System.out.println("------------------------------------------------");

        System.out.println("Sellers budget after they sold their offers: \n");
        System.out.println(seller1.getName() + " " + seller1.getBalance());
        System.out.println(seller2.getName() + " " + seller2.getBalance());
        System.out.println(seller2.getName() + " " + seller3.getBalance());
        System.out.println(seller2.getName() + " " + seller4.getBalance());

    }
}
