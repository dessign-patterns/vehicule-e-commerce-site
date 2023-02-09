import java.util.Scanner;

import java.sql.Connection;

import java.sql.SQLException;
import AbstractFactory.*;
import BuilderP.*;
import TemplateMethod.*;
import FactoryMethod.*;
import java.sql.Statement;
public class Main{
    public static void main(String[] args) {
        DBConnection db = new DBConnection();
        db.connect();
        int choice = 0;
		Scanner number = new Scanner(System.in);
		Liasse liasseUnique = null;
		
		double i; 
		try{
			Statement s = db.getConnection().createStatement();
			for (int j = 1; j <5; j++) {
				i = Math.random() * ( 5 - 1 );
				s.executeUpdate("INSERT INTO catalogue (id, nom)"+" VALUES("+j+", 'Catalogue"+j+"');");
			}
		}catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.out.println("Erreur de connection");
		}

		do {
			System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+ vehicles e-commerce site +-+-+-+-+-+-+-+-+-+-+-+- ");
			System.out.println("1. Creer un vehicule (automobile / scooter) ");
			System.out.println("2. Construire les liasses de documents necessaires ");
			System.out.println("3. Passer une commande ");
			System.out.println("4. Creer la liasse vierge de documents ");
			System.out.println("5. Gerer les documents PDF");
			System.out.println("6. Implanter des formulaires HTML a l'aide de widgets");
			System.out.println("7. representer les societes ");
			System.out.println("8. Afficher les vehicules du catalogue ");
			System.out.println("9. Retrouver sequentiellement les vehicules d'un catalogue ");			
			System.out.println("10. Sortir ");

			do {
				System.out.print("\n[Request] >  ");
				choice = number.nextInt();
				if (choice < 1 || choice >10)
					System.out.println("Your choice should be between 1 and 10");
			} while (choice < 1 || choice > 10);
			switch (choice) {
				case 1: {
					System.out.println(":================: Creer d'un vehicule :===============:");
					createVehicle(db.getConnection());
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				case 2: {
					System.out.println(":================:Construire les liasses de documents necessaires:===============:");
					construireLiasse(liasseUnique);
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				case 3: {
					System.out.println(":================: Passer une commande :===============:");
					passerCommande(db.getConnection());
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				case 4: {
					System.out.println(":================: Creer la liasse vierge de documents :===============:");
					liasseUnique = creerLiasse();
					liasseUnique.imprime();
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				default:
					break;

			}

		} while (choice != 10);
        
        db.disconnect();
    }
    public static void createVehicle(Connection c){
        int choice = 0;
		Scanner number = new Scanner(System.in);

		do {
			System.out.println("-+-+-+-+-+-+ Quel vehicle voulez vous creer? +-+-+-+-+-+- ");
			System.out.println("1. Automobile ");
			System.out.println("2. Scooter ");
			System.out.println("3. Retour ");

			do {
				System.out.print("\n[Request] >  ");
				choice = number.nextInt();
				if (choice < 1 || choice > 3)
					System.out.println("Your choice should be between 1 and 3");
			} while (choice < 1 || choice > 3);
			switch (choice) {
				case 1: {
					System.out.println(":================: Automobile :===============:");
					createAutomobile(c);
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				case 2: {
					System.out.println(":================: Scooter :===============:");
					createScooter(c);
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				default:
					break;

			}

		} while (choice != 3);
    }

    public static void createAutomobile(Connection c){
        FabriqueVehicule f1,f2;
        f1 = new FabriqueVehiculeElectrique();
        f2 = new FabriqueVehiculeEssence();

        int puissance, choice = 0;
		double espace;
		Scanner entry = new Scanner(System.in);
		String modele, couleur;
		Statement s;

		do {
			System.out.println("-+--+-+ Quel type d'automobile voulez vous creer? +-+--+- ");
			System.out.println("1. Electrique ");
			System.out.println("2. Essence ");
			System.out.println("3. Retour ");

			do {
				System.out.print("\n[Request] >  ");
				choice = entry.nextInt();
				if (choice < 1 || choice > 3)
					System.out.println("Your choice should be between 1 and 3");
			} while (choice < 1 || choice > 3);
			switch (choice) {
				case 1: {
					System.out.println(":================: Electrique :===============:");
					f1.creerAutomobile("Peugeot 307", "gris", 320, 5.0).afficheCarracteristiques();
					
					try{
						double id = Math.random() * ( 100000000 - 1 );
						double i = Math.random() * (5-1);
						s = c.createStatement();
						s.executeUpdate("INSERT INTO AUTOMOBILE (id, modele, couleur, puissance, espace, type, catalogue)"+" VALUES("+id+", 'Peugeot 307', 'gris', 320, 5, 'electrique',"+((int)i)+");");
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					} catch (SQLException sqlException) {
						sqlException.printStackTrace();
						System.out.println("Erreur de connection");
					}
						break;
					
					}
				case 2: {
					System.out.println(":================: Essence :===============:");
					f1.creerAutomobile("Peugeot 307", "gris", 320, 5.0).afficheCarracteristiques();
					
					try{
						double id = Math.random() * ( 100000000 - 1 );
						double i = Math.random() * (5-1);
						s = c.createStatement();
						s.executeUpdate("INSERT INTO AUTOMOBILE (id, modele, couleur, puissance, espace, type, catalogue)"+" VALUES("+id+", 'Peugeot 307', 'gris', 320, 5, 'essence',"+((int)i)+");");
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					}catch (SQLException sqlException) {
						sqlException.printStackTrace();
						System.out.println("Erreur de connection");
					}
					
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				default:
					break;

			}

		} while (choice != 3);
    }public static void createScooter(Connection c){
        FabriqueVehicule f1,f2;
        f1 = new FabriqueVehiculeElectrique();
        f2 = new FabriqueVehiculeEssence();

        int choice = 0;
		Scanner number = new Scanner(System.in);
		Statement s;

		do {
			System.out.println("-+--+-+ Quel type de scooter voulez vous creer? +-+--+- ");
			System.out.println("1. Electrique ");
			System.out.println("2. Essence ");
			System.out.println("3. Retour ");

			do {
				System.out.print("\n[Request] >  ");
				choice = number.nextInt();
				if (choice < 1 || choice > 3)
					System.out.println("Your choice should be between 1 and 3");
			} while (choice < 1 || choice > 3);
			switch (choice) {
				case 1: {
					System.out.println(":================: Electrique :===============:");
					f1.creerScooter("Toyota v4", "Jaune", 320).afficheCarracteristiques();
					
					try{
						double id = Math.random() * ( 100000000 - 1 );
						double i = Math.random() * ( 5 - 1 );
						s = c.createStatement();
						s.executeUpdate("INSERT INTO Scooter (id, modele, couleur, puissance, type, catalogue)"+" VALUES("+id+", 'Toyota v4', 'Jaune', 210, 'electrique', "+((int)i)+");");
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					}catch (SQLException sqlException) {
						sqlException.printStackTrace();
						System.out.println("Erreur de connection");
					}

					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				case 2: {
					System.out.println(":================: Essence :===============:");
					f2.creerScooter("Toyota v4", "Rouge", 210).afficheCarracteristiques();
					
					try{
						double id = Math.random() * ( 100000000 - 1 );
						double i = Math.random() * ( 5 - 1 );
						s = c.createStatement();
						s.executeUpdate("INSERT INTO SCOOTER (id, modele, couleur, puissance, type, catalogue)"+" VALUES("+id+", 'Toyota v4', 'Rouge', 210, 'essence',"+((int)i)+");");
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					}catch (SQLException sqlException) {
						sqlException.printStackTrace();
						System.out.println("Erreur de connection");
					}
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				default:
					break;

			}

		} while (choice != 3);
    }
	public static Liasse creerLiasse(){
		Liasse l = Liasse.getInstance();
		return l;
	}
	public static void construireLiasse(Liasse l){
		ConstructeurLiasse cL1, cL2 ;
		int choice = 0;
		Scanner number = new Scanner(System.in);

		do {
			System.out.println("-+-+-+-+-+-+ Quel format desirez vous ? +-+-+-+-+-+- ");
			System.out.println("1. HTML ");
			System.out.println("2. PDF ");
			System.out.println("3. Retour ");

			do {
				System.out.print("\n[Request] >  ");
				choice = number.nextInt();
				if (choice < 1 || choice > 3)
					System.out.println("Your choice should be between 1 and 3");
			} while (choice < 1 || choice > 3);
			switch (choice) {
				case 1: {
					System.out.println(":================: HTML :===============:");
					cL1 = new ConstructeurLiasseHtml(l);
					cL1.construireBonCommande("Essi");
					cL1.construireCertificatCession("Bla bla");
					cL1.construireDemandeImmatriculation("Le Doyen");
					cL1.resultat().imprime();
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				case 2: {
					System.out.println(":================: PDF :===============:");
					cL2 = new ConstructeurLiasseHtml(l);
					cL2.construireBonCommande("Slema");
					cL2.construireCertificatCession("Bla bla");
					cL2.construireDemandeImmatriculation("Bacha");
					cL2.resultat().imprime();
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				default:
					break;

			}

		} while (choice != 3);
	}
	public static void passerCommande(Connection c){
		FabriqueCommande f1, f2;
		int choice = 0;
		Scanner number = new Scanner(System.in);
		String name;
		do {
			System.out.println("-+-+-+-+-+-+ Quel type de commande desirez vous passer ? +-+-+-+-+-+- ");
			System.out.println("1. Comptant ");
			System.out.println("2. Credit ");
			System.out.println("3. Retour ");

			do {
				System.out.print("\n[Request] >  ");
				choice = number.nextInt();
				if (choice < 1 || choice > 3)
					System.out.println("Your choice should be between 1 and 3");
			} while (choice < 1 || choice > 3);
			switch (choice) {
				case 1: {
					System.out.println(":================: Comptant :===============:");
					f1 = new FabriqueCommandeComptant();
					double mttc, montant = 1000.0;
					int id = 34343434;
					try{
						Statement s = c.createStatement();
						int res = s.executeUpdate("SELECT modele FROM automobile WHERE id = "+id);

						if (res > 0){
							name="Peugeot 307";
						}
						f1.creerCommande(montant, id);
						mttc = calculerMontant(montant);
						s.executeUpdate("INSERT INTO COMMANDE (id, vehicule, montant, etat)"+" VALUES("+id+", 'Toyota v4', "+mttc+",'valide');");

					}catch (SQLException sqlException) {
						sqlException.printStackTrace();
						System.out.println("Erreur de connection");
					}
					
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				case 2: {
					System.out.println(":================: Credit :===============:");
					f2 = new FabriqueCommandeCredit();
					double mttc, montant = 1000.0;
					int id = 34343434;
					try{
						Statement s = c.createStatement();
						int res = s.executeUpdate("SELECT modele FROM automobile WHERE id = "+id);

						if (res > 0){
							name="Toyota v4";
						}
						f2.creerCommande(montant, id);
						mttc = calculerMontant(montant);
						s.executeUpdate("INSERT INTO COMMANDE (id, vehicule, montant, etat)"+" VALUES("+id+", 'Toyota v4', "+mttc+",'en cours');");

					}catch (SQLException sqlException) {
						sqlException.printStackTrace();
						System.out.println("Erreur de connection");
					}
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					break;
				}
				default:
					break;

			}

		} while (choice != 3);
	}
	public static double calculerMontant(double m){
		int choice = 0;
		double montant;
		Scanner number = new Scanner(System.in);
		String name;
		CommandeC cC,cS;
		do {
			System.out.println("-+-+-+-+-+-+ Quel est votre pays de residence ? +-+-+-+-+-+- ");
			System.out.println("1. Cameroun ");
			System.out.println("2. Senegal ");
			System.out.println("3. Retour ");

			do {
				System.out.print("\n[Request] >  ");
				choice = number.nextInt();
				if (choice < 1 || choice > 3)
					System.out.println("Your choice should be between 1 and 3");
			} while (choice < 1 || choice > 3);
			switch (choice) {
				case 1: {
					System.out.println(":================: Cameroun :===============:");

					cC = new CommandeCameroun();
					cC.setMontantHt(m);
					montant = cC.calculMontantTtc();
					cC.affiche();
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					return montant;
				}
				case 2: {
					System.out.println(":================: Senegal :===============:");
					cC = new CommandeSenegal();
					cC.setMontantHt(m);
					montant = cC.calculMontantTtc();
					cC.affiche();
					System.out.println(":================: +-+-+-+-+-+-+-+-+ :===============:\n");
					return montant;
				}
				default:
					break;

			}

		} while (choice != 3);
		return 0.0;
	}
}
