public class test {
    public static void main(String[] args) throws Exception {
    ALV Doce = new ALV("12", null, null);
    ALV Veinticuatro = new ALV("24", null, null);
    ALV Setentaydos = new ALV("24", null, null);
    ALV Cuarentayseis = new ALV("24", null, null);
    ALV Ochentaydos = new ALV("24", null, null);
    ALV Veinte = new ALV("85", Veinticuatro, Doce);
    ALV Cincuentayuno = new ALV("79", Setentaydos, Cuarentayseis);
    ALV Treintayuno = new ALV("31", Cincuentayuno, Veinte);
    ALV Ochenta = new ALV("80", Ochentaydos, null);
    ALV SetentayNueve = new ALV("72", Ochenta, Treintayuno);


        System.out.println ("Preordered print\n");
        System.out.println ("----------------------------------\n");
      ALV.print_preordered(SetentayNueve);
        System.out.println ("\n");

      System.out.println ("Preordered left rotated print\n");
      System.out.println ("----------------------------------\n");
        ALV.rightrotation(SetentayNueve);

    }
}
