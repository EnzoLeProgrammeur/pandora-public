public class PandoraVersion {
    public static void main(String[] args) {
        if (args.length > 0 && args[0].equals("-v")) {
            displayVersion();
        } else {
            System.out.println("Usage: java PandoraVersion [-v]");
        }
    }

    private static void displayVersion() {
        System.out.println("pandora@1.0.1");
    }
}

