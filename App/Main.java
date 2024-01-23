

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Throwable {
        Throwable var6 = null;
        Object var7 = null;

        int r1;
        int r2;
        int r3;
        int r4;
        try {
            Scanner file = new Scanner(System.in);

            try {
                System.out.print("Digite o valor de R1: ");
                r1 = file.nextInt();
                System.out.print("Digite o valor de R2: ");
                r2 = file.nextInt();
                System.out.print("Digite o valor de R3: ");
                r3 = file.nextInt();
                System.out.print("Digite o valor de R4: ");
                r4 = file.nextInt();
            } finally {
                if (file != null) {
                    file.close();
                }

            }
        } catch (Throwable var14) {
            if (var6 == null) {
                var6 = var14;
            } else if (var6 != var14) {
                var6.addSuppressed(var14);
            }

            throw var6;
        }

        int r_total = r1 + r2 + r3 + 4 + r4;
        System.out.println("R_toral " + r_total);
    }
}
