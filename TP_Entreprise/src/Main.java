public class Main
{
    public static void main(String[] args) {
    // Création des adresses
    Adress adOrange = new Adress("44300", "Nantes");
    Adress adGo = new Adress("29820", "Bohars");
    Adress adNext = new Adress("29770", "Cléden Cap Sizun");

    // Création d'une entreprise avec un libellé et une adresse
    Company orange = new Company("Orange", adOrange);
    Company gogo = new Company("GoGoDev", adGo);
    Company next = new Company("NextDigital", adNext);

    // Création des salariés
    Employee emp1 = new Employee("Natacha", "Grieeman", 32);
    Employee emp2 = new Employee("Jean-Luc", "Dupont", 37);
    Employee emp3 = new Employee("Stéphane", "Brechet", 29);
    Employee emp4 = new Employee("Sasha", "Lemoine", 24);
    Employee emp5 = new Employee("Esteban", "Durand", 31);
    Employee emp6 = new Employee("Mélanie", "Laporte", 34);

    System.out.println(orange.getLibelle() + " " + adOrange.formatAddress() + " \n Salarié 1 : " + emp1.getFirstName()
            + " "  + emp1.getLastName() + " " + emp1.getAge() + " ans\n Salarié 2 : " + emp2.getFirstName()
            + " "  + emp2.getLastName() + " " + emp2.getAge() + " ans" );

    System.out.println(gogo.getLibelle() + " " + adGo.formatAddress() + " \n Salarié 1 : " + emp3.getFirstName()
            + " "  + emp1.getLastName() + " " + emp1.getAge() + " ans");

    System.out.println(next.getLibelle() + " " + adNext.formatAddress() + " \n Salarié 1 : " + emp4.getFirstName()
            + " "  + emp4.getLastName() + " " + emp4.getAge() + " ans\n Salarié 2 : " + emp5.getFirstName()
            + " "  + emp5.getLastName() + " " + emp5.getAge() + " ans \n Salarié 3 : " + emp6.getFirstName()
            + " "  + emp6.getLastName() + " " + emp6.getAge() + " ans" );
    }
}

