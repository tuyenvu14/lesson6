package lesson6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        ArrayList<InformasionTechnology> arrInformasionTechnology = new ArrayList<>();
        ArrayList<LifeScience> arrLifeScience = new ArrayList<>();
        ArrayList<LiteratureArt> arrLiteratuArt = new ArrayList<>();
        int totalbookInfo;
        int totalBookLife;
        int totaBookLite;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("___MENU___");
            System.out.println("0.Exit");
            System.out.println("1.Informasion_Technology.");
            System.out.println("2.Life_Science.");
            System.out.println("3.Liteture_Art.");

            int choice = sc.nextInt();
            switch (choice) {
                case 0 : {
                    break;
                }
                case 1 : {
                    System.out.println("Enter the total number of books");
                    totalbookInfo = sc.nextInt();
                    System.out.println("Enter book information : ");

                    for (int i = 0; i < totalbookInfo; i++) {
                        System.out.println("Enter the information for the second book " + (i + 1) + " : " );
                        InformasionTechnology informasionTechnology = new InformasionTechnology();
                        informasionTechnology.enterBook();
                        arrInformasionTechnology.add(informasionTechnology);
                    }

                    System.out.println("------Information book information technology------");

                    for (int i = 0; i < arrInformasionTechnology.size(); i++) {
                        System.out.println(arrInformasionTechnology.get(i).toString());
                    }

                    break;
                }

                case 2 : {
                    System.out.println("Enter the total number of books");
                    totalBookLife = sc.nextInt();
                    System.out.println("Enter book information : ");

                    for (int i = 0; i < totalBookLife; i++) {
                        System.out.println("Enter the information for the second book " + (i + 1) + " : " );
                        LifeScience lifeScience = new LifeScience();
                        lifeScience.enterBook();
                        arrLifeScience.add(lifeScience);
                    }

                    System.out.println("------Information book LifeScience------");

                    for (int i = 0; i < arrLifeScience.size(); i++) {
                        System.out.println(arrLifeScience.get(i).toString());
                    }

                    break;

                }

                case 3 : {
                    System.out.println("Enter the total number of books");
                    totaBookLite = sc.nextInt();
                    System.out.println("Enter book information : ");

                    for (int i = 0; i < totaBookLite; i++) {
                        System.out.println("Enter the information for the second book " + i + 1 + " : " );
                        LiteratureArt literatureArt = new LiteratureArt();
                        literatureArt.enterBook();
                        arrLiteratuArt.add(literatureArt);
                    }

                    System.out.println("------Information book information technology------");

                    for (int i = 0; i < arrLiteratuArt.size(); i++) {
                        System.out.println(arrLiteratuArt.get(i).toString());
                    }

                    break;
                }
            }
        }
    }
}
