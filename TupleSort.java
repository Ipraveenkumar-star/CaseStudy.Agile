import java.util.*;

class Record {
    String name;
    int age;
    int score;

    Record(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "('" + name + "', '" + age + "', '" + score + "')";
    }
}

public class TupleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Record> list = new ArrayList<>();
        System.out.println("Enter data (Name,Age,Score). Type 'stop' to finish:");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("stop")) break;
            String[] parts = line.split(",");
            list.add(new Record(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
        }

        list.sort(Comparator.comparing((Record r) -> r.name)
                .thenComparingInt(r -> r.age)
                .thenComparingInt(r -> r.score));

        System.out.println(list);
    }
}