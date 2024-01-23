import java.util.Scanner;

public class Main2 {
    public Main2() {
    }

    public static void main(String[] args) {
        double r_total = 0.0;
        Throwable var7 = null;
        Object var8 = null;

        try {
            Scanner file = new Scanner(System.in);

            try {
                System.out.print("Digite o valor de R1: ");
                int r1 = file.nextInt();
                System.out.print("Digite o valor de R2: ");
                int r2 = file.nextInt();
                System.out.print("Digite o valor de R3: ");
                int r3 = file.nextInt();
                System.out.print("Digite o valor de R4: ");
                int r4 = file.nextInt();
                System.out.println("Estes dois estão em:\nSerie (S)\nParalelo (P)\n");
                String tipo = file.next();
                if (tipo.equals("S")) {
                    r_total = (double)(r1 + r2 + r3 + r4);
                    System.out.println("Série (S)");
                } else {
                    r_total = 1.0 / (1.0 / (double)r1 + 1.0 / (double)r2 + 1.0 / (double)r3 + 1.0 / (double)r4);
                    System.out.println("Paralelo (P)");
                }

                System.out.println("R_total: " + r_total);
            } finally {
                if (file != null) {
                    file.close();
                }

            }

        } catch (Throwable var16) {
            if (var7 == null) {
                var7 = var16;
            } else if (var7 != var16) {
                var7.addSuppressed(var16);
            }

            try {
                throw var7;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }
}
