package org.example;

import java.util.Scanner;

public class PharmacieVente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Les informations sur le produit pharmaceutique

    // Nom du produit
        System.out.print("Nom du produit : ");
        String nomProduit = scanner.nextLine();

    // PU (Prix Unitaire)
        System.out.print("Prix unitaire du produit (en FCFA) : ");
        double prixUnitaire = scanner.nextDouble();

    // Quantité du produit à vendre
        System.out.print("Quantité à vendre : ");
        int quantite = scanner.nextInt();

    // Le taux de TVA
        System.out.print("Taux de TVA (%) : ");
        double tauxTVA = scanner.nextDouble();

    // Autres taxes
        System.out.print("Autres taxes (%) (0 si aucune) : ");
        double autresTaxes = scanner.nextDouble();

    // Confirmation de la vente
        scanner.nextLine(); // nettoyage du buffer
        System.out.print("Confirmer la vente ? (oui/non) : ");
        String confirmation = scanner.nextLine();

        if (!confirmation.equalsIgnoreCase("oui")) {
            System.out.println("Vente annulée.");
            return;
        }

    // Calculs de la vente
        double montantBrut = prixUnitaire * quantite;
        double montantTVA = montantBrut * (tauxTVA / 100);
        double montantAutresTaxes = montantBrut * (autresTaxes / 100);
        double montantTotal = montantBrut + montantTVA + montantAutresTaxes;

    //  Affichage de la facture
        System.out.println("\n================= FACTURE DE VENTE ====================");
        System.out.printf("| %-20s : %-30s |\n", "Produit", nomProduit);
        System.out.printf("| %-20s : %-30.2f |\n", "Prix unitaire", prixUnitaire);
        System.out.printf("| %-20s : %-30d |\n", "Quantité", quantite);
        System.out.printf("| %-20s : %-30.2f |\n", "Montant brut", montantBrut);
        System.out.printf("| %-20s : %-30.2f %% |\n", "TVA", tauxTVA);
        System.out.printf("| %-20s : %-30.2f |\n", "Montant TVA", montantTVA);
        System.out.printf("| %-20s : %-30.2f %% |\n", "Autres taxes", autresTaxes);
        System.out.printf("| %-20s : %-30.2f |\n", "Montant autres taxes", montantAutresTaxes);
        System.out.printf("| %-20s : %-30.2f |\n", "Total à payer", montantTotal);
        System.out.println("========================================================");
    }
}
