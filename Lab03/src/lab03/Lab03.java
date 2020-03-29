package lab03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author wm41547
 */
public class Lab03 {

    //http://mkramarczyk.zut.edu.pl/?cat=TPSI
    
    public static void main(String[] args) {
        //lab3zad1();
        //lab3zad2a();
        //lab3zad2b();
        //lab3zad3();
    }
    
    
    public static void lab3zad1(){
        
        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("Poniedzialek");
        zbiorDni.add("Wtorek");
        zbiorDni.add("Sroda");
        zbiorDni.add("Czwartek");
        zbiorDni.add("Piatek");
        zbiorDni.add("Sobota");
        zbiorDni.add("Niedziela");
        /*
        HashSet - hashuje dane, przydziela swoja kolejnosc
        TreeSet - umieszczane dane są sortowane 
        
        TreeSet użyjemy w momencie gdy chcemy aby nasze dane były posortowane w momencie dodania 
        HashSet użyjemy gdy mieć szybki dostęp do poszczególnych danych 
        
        Nie wymagano zmiany więcej linii kodu, TreeSet i HashSet mają tą samą implementację Set
        */
        System.out.println(zbiorDni);
    }
    
    public static void lab3zad2a(){
        Teacher t1 = new Teacher("Jan", "Kowalski", "jk@teach.pl", "PO");
        Teacher t2 = new Teacher("Marek", "Nowak", "mn@stud.pl", "MISS");
        Teacher t3 = new Teacher("Bartek", "Terak", "bt@teach.pl", "AISI");
        Teacher t4 = new Teacher("Radek", "Torba", "rt@teach.pl", "MO");
        
        Map<String, Teacher> lesson = new HashMap<>();
        lesson.put("PO", t1);
        lesson.put("MISS", t2);
        lesson.put("AISI", t3);
        lesson.put("MO", t4);
        
        for(String ser : lesson.keySet()){
            if("PO".equals(ser))
                System.out.println(lesson.get(ser) + " " + ser);
        }
    }
    
    public static void lab3zad2b(){
        Student s1 = new Student("Jan",     "Kowalski", "jk@stud.pl", "32");
        Student s2 = new Student("Marek",   "Kowalski", "jk@stud.pl", "33");
        Student s3 = new Student("Michal",  "Kowalski", "jk@stud.pl", "32");
        Student s4 = new Student("Mateusz", "Kowalski", "jk@stud.pl", "31");
        Student s5 = new Student("Igor",    "Kowalski", "jk@stud.pl", "31");
        Student s6 = new Student("Kuba",    "Kowalski", "jk@stud.pl", "33");
        
        List<Student> students31 = new ArrayList<>();
        
        students31.add(s4);
        students31.add(s5);
        
        List<Student> students32 = new ArrayList<>();
        
        students32.add(s1);
        students32.add(s3);
        
        List<Student> students33 = new ArrayList<>();
        
        students33.add(s2);
        students33.add(s6);
        
        Map<String, List<Student>> groups = new HashMap<>();
        
        groups.put("31", students31);
        groups.put("32", students32);
        groups.put("33", students33);
                
        for(String stud : groups.keySet()){
            if(stud == "32"){
                for(int i=0; i<groups.get(stud).size(); i++){
                    
                    System.out.println(groups.get(stud).get(i).getFirstName() + " "
                            + groups.get(stud).get(i).getLastName() + " "
                            + groups.get(stud).get(i).getGroupId());
                }
            }
        }
    }
    public static void lab3zad3(){
        /*
        Odczytywanie pliku
        Tworzenie klasy i obiektu produkt 
        Pakowanie do list i do map po <id, Produkt> i <category, List<Products>
        */
        List<Product> listProducts = new ArrayList<>();
        Map<Integer, Product> mapProduct = new HashMap<>();
        Map<String, List<Product>> mapList = new HashMap<>();
        
        try(BufferedReader in = new BufferedReader(new FileReader("plik.txt"))){
            
            String s = in.readLine();
            String[] pola;

            while(s != null){
                
                pola = s.split(";");
                int id = Integer.parseInt(pola[0]);
                double price = Double.parseDouble(pola[3]);
                
                Product product = new Product(id, pola[1], pola[2], price);
                
                listProducts.add(product);
                
                mapProduct.put(id, product);
                mapList.put(pola[2], listProducts);

                s = in.readLine();
            }
            
        }catch(IOException ex){
            ex.printStackTrace();
        }

        for(int i : mapProduct.keySet()){
            System.out.println( i + " " + mapProduct.get(i).getName() );
        }
        
        System.out.println("\nKategorie: ");
        for(String s : mapList.keySet()){
            System.out.println( s );
        }
    }
}
