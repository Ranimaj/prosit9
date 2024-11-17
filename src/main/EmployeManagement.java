package main;

import entities.Employe;
import entities.SocieteArrayList;

public class EmployeManagement {

    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "El_Jazi", "Amal", "IT", 5);
        Employe e2 = new Employe(2, "Touil", "Samar", "HR", 3);
        Employe e3 = new Employe(3, "Ajlani", "Ranim", "IT", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        System.out.println("Liste des employés:");
        societe.displayEmploye();

        System.out.println("Recherche par nom (El_Jazi): " + societe.rechercherEmploye("El_Jazi"));
        System.out.println("Recherche par employé (e1): " + societe.rechercherEmploye(e1));

        System.out.println("Tri par ID:");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("Tri par département et grade:");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();
    }
}
