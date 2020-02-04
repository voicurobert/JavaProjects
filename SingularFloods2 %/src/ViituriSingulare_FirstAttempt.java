

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ViituriSingulare_FirstAttempt{
        static int T9;
        static int T0;
        static int L1;
        static int T2 = 0;
        static int L0 = 0;
        int I;
        static int G;
        static int h;
        static double L02;
        static double T;
        static double K;
        static double R1;
        static double R2;
        static double R3;
        static double R4;
        static double A0;
        static double R0;
        static double W;
        static double W1;
        static double B0;
        static double C0;
        static double P3;
        static double T4;
        static double T5;
        static double P4;
        static double P5;
        static double P6;
        static double G1;
        static double R5;
        static double R6;
        static double E1;
        static double F1;
        static double T3;
        static double W2;
        static double P7;
        static double P8;
        static double Q1;
        static double G0;
        static double T1;
        double GRAV;
        double H4;
        double C2;
        double W3;
        double Q3;
        double H5;
        static boolean e1w1 = true;
        static boolean choice = true;
        static boolean choice2 = true;
        static List<Double> list = new ArrayList<>();

        public static void L4680() throws IOException {
            A0 = L1;
            L4740();
        }

        public static void L4620() throws IOException {
            T4 = F1;
            T5 = G1;
        }

        public static void L4720() throws IOException {
            A0 = F1;
            L4740();
        }

        public static void L4740() throws IOException {
            B0 = T1 - 2 - 2 * A0;
            C0 = A0 + 1;
            K = 0;
            W2 = 0;
        }

        public static void L4200() {
            T2 = L1;
            T3 = E1;
        }

        public static void L4560() throws IOException {
            R0 = ((F1 - T4) * (T5 - W1)) / (T5 - G1);
            A0 = T4 + R0;
            L4740();
        }

        public static void main(String[] args) throws IOException {
            Path path = Paths.get("aquaproiect.txt");
            File file = new File(path.toString());
            file.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            System.out.println(" Dati durata totala a viiturii: ");
            Scanner scanner = new Scanner(System.in);
            T9 = scanner.nextInt();
            System.out.println(" Dati durata de crestere a hidrografului in ore: ");
            T0 = scanner.nextInt();
            System.out.println(" Dati debitul maxim al hidrografului: ");
            Q1 = scanner.nextDouble();
            System.out.println(" Dati coeficientul de forma al hidrografului GAMA: ");
            G0 = scanner.nextDouble();
            W = G0 * Q1 * T9;
            System.out.println(" Dati pasul de calcul al debitelor: ");
            T = scanner.nextDouble();
            scanner.close();

            T1 = T9 / T0;
            W1 = G0 * T1;
            First_LOOP: for (L1 = 1; L1 <= 60; L1++) {
                R1 = T1 - 1;
                R2 = 4 * L1 * R1 - (R1 - 1) * (R1 - 1);
                if (R2 >= 0) {
                    R3 = Math.sqrt(R2);
                    R4 = ((L1 + 1) * (R1 - 1) * Math.log(R1)) / (L1 * L1);
                    R5 = ((L1 + 1) * (R2 - 2 * L1 * R1)) / ((L1 * L1) * R3);
                    R6 = Math.atan((2 * L1 * R1 + R1 - 1) / R3) - Math.atan((R1 - 1 - 2 * L1) / R3);
                    E1 = R4 + R5 * R6 - T1 / L1;
                    if (E1 == W1) {
                        e1w1 = false;
                        L4680();
                        break First_LOOP;
                    }
                    if (E1 > W1) {
                        System.out.println("am ajuns aici");
                        e1w1 = true;
                        L4200();
                        break First_LOOP;
                    }
                }
            }
            if (e1w1) {
                Outer_LOOP: for (L0 = 1; L0 <= 500; L0++) {
                    choice = true;
                    F1 = T2 + 0.01 * L0;
                    P7 = T1 - 1;
                    P8 = 4 * F1 * P7 - (P7 - 1) * (P7 - 1);
                    P3 = Math.sqrt(P8);
                    P4 = ((F1 + 1) * (P7 - 1) * (Math.log(P7))) / (F1 * F1);
                    P5 = ((F1 + 1) * (P8 - 2 * F1 * P7)) / ((F1 * F1) * P3);
                    P6 = Math.atan((2 * F1 * P7 + P7 - 1) / P3) - Math.atan((P7 - 1 - 2 * F1) / P3);
                    G1 = P4 + P5 * P6 - T1 / F1;
                    if (G1 == W1) {
                        System.out.println("g1 = w1");
                        L4720();
                        break Outer_LOOP;
                    }
                    if (G1 > W1) {
                        System.out.println("g1 > w1");
                        L4620();
                        choice = false;
                    }
                    if (choice) {
                        if (L0 != 1) {
                            System.out.println("l0 != 1");
                            L4560();
                            choice2 = false;
                            break Outer_LOOP;
                        }
                        R0 = ((F1 - T2) * (T3 - W1)) / (T3 - G1);
                        A0 = T2 + R0;
                        L4740();
                    }
                }
            } else {
                System.out.println("Nu am executat al doilea for");
            }
            if (choice2) {
                L4680();
            }
            L0 = 0;
            System.out.println("Hidrograful undei de viitura: ");
            G = 1;
            h = 0;
            do {
                L0 = L0 + 1;
                h = h + 1;
                if ((h - 1) % 8 == 0) {
                    System.out.println("h = " + h);
                    writer.write(String.valueOf(h));
                    writer.newLine();
                }
                L02 = (K * (T9 - K)) / ((A0 * K * K + B0 * T0 * K + C0 * T0 * T0) * Q1);
                W2 = W2 + L02 * T;
                System.out.println("k=" + K + " , " + "L02= " + L02);
                writer.write(String.valueOf(L02));
                writer.newLine();
                K = K + T;
                System.out.println("k = " + K);
                System.out.println("t = " + T);
            } while (K <= T9);
            writer.flush();
            writer.close();
            System.out.println("VERIFICARE : ");
            System.out.println("V = " + W + " mc");
            System.out.println("Vcalc = " + W2 + " mc");

        }

    }


