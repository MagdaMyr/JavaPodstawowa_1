public class KlasaString {
    public static void main(String[] args) {
        String hello = "Witaj";
        String world = " Swiecie!";
        String powitanie = hello + world;
        String czesc = powitanie.substring(0,6) + "uczniu";
        System.out.println(czesc);
    }
}