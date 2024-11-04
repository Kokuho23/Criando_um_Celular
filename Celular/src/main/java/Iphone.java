public class Iphone {
    public static void main(String[] args) {
        Iphone iphone = null;

        String app = "NavegadorInternet";

        if (app.equals("NavegadorInternet")) {
            NavegadorInternet.main(args);
        }
        else if (app.equals("ReprodutorMusical")) {
            ReprodutorMusical.main(args);
        }
        else if (app.equals("AparelhoTelefonico")) {
            AparelhoTelefonico.main(args);
        }
    }
}
