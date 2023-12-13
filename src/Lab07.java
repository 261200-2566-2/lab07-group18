import java.util.Set;
import java.util.HashSet;

public class Lab07 {
    public static void main(String[] args) {
        Myset<String> s = new Myset<>();
        Set<String> m = new HashSet<>();

        System.out.println("--------------------------------");
        System.out.println("s is empty : " + s.isEmpty());

        m.add("a");
        m.add("b");
        m.add("c");
        m.add("c");
        m.add("d");

        s.add("a");
        s.add("c");

        System.out.println("--------------------------------");
        System.out.println("s is empty : " + s.isEmpty());
        System.out.println("size of s : " + s.size());
        System.out.println("size of m : " + m.size());
        System.out.print("s -> ");
        s.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("m -> ");
        m.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("s contain \"a\" : " + s.contains("a"));
        System.out.println("m contain \"x\" : " + s.contains("x"));
        System.out.println("s ⊇ m : " + s.containsAll(m));
        System.out.println("m ⊇ s : " + m.containsAll(s));
        System.out.println("--------------------------------");

        s.add("e");
        m.remove("c");
        System.out.println("size of s : " + s.size());
        System.out.println("size of m : " + m.size());
        System.out.print("s -> ");
        s.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("m -> ");
        m.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------------");

        s.addAll(m);
        System.out.print("s ∪ m : ");
        s.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("size of s : " + s.size());
        System.out.println("size of m : " + m.size());
        System.out.print("s : ");
        s.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("m : ");
        m.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------------");

        s.removeAll(m);
        System.out.print("s − m : ");
        s.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------------");

        s.clear();
        m.clear();
        System.out.println("clear");
        System.out.println("size of s : " + s.size());
        System.out.println("size of m : " + m.size());
        System.out.println("--------------------------------");

        s.add("o");
        s.add("k");
        s.add("t");
        s.add("p");
        m.add("r");
        m.add("k");
        m.add("o");
        System.out.println("size of s : " + s.size());
        System.out.println("size of m : " + m.size());
        System.out.print("s : ");
        s.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("m : ");
        m.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------------");

        s.retainAll(m);
        System.out.print("s ∩ m : ");
        s.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.println("--------------------------------");
    }
}