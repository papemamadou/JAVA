public class ProgPrincipal {
    class Personne {
        String prenom;
        String nom;
        private int age;
        static int nbPersonne = 0;

        public Personne(String p, String n, int a) {
         prenom = p;
         nom = n;
         age = a;
         nbPersonne++;
        }
        public void affichePersonne() {
            System.out.println(prenom + " " + nom + "a"+ age + "ans");
        }
    }
    public class ProgPrincipal {
    
        public static void main(String[] args) {
            Personne p1 = new Personne("Jean", "Durand", 25);
            Personne p2 = new Personne("patrick", "Martin", 30);
            p1.affichePersonne();
            p2.affichePersonne();
            System.out.println(Personne.nbPersonne);
            System.out.println(p1.prenom);
        }
    }
    public class ProgPrincipal {
        public static void main(String[] args) {
            Personne p1 = new Personne("Jean", "Durand", 25);
            System.out.println(p1.prenom);
            System.out.println(p1.nom);
            System.out.println(p1.getAge());
        }
    }
    
}
