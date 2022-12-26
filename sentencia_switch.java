public class sentencia_switch {
    public static void main(String[] args) {
        var station = "verano";

        switch (station) {
            case "verano":
                System.out.println("La estacion corresponde a: verano");
                break;
            case "invierno":
                System.out.println("La estacion corresponde a: invierno");
                break;
            case "primavera":
                System.out.println("La estacion corresponde a: primavera");
                break;
            case "otoño":
                System.out.println("La estacion corresponde: otoño");
                break;
            default:
                System.out.println("No corresponde a ninguna estacion");
        }
    }
}
