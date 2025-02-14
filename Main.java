// my first branch
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int age = 25;
//         double price = 19.88;
//         char letter = 'A'; 
//         boolean isJava = true;

//         int num = 10;
//         if (num > 0) {
//             System.out.println("Положительное число");
//         } else {
//             System.out.println("Отрицательное число");
//         }
//     }
// }

// public class Main {
//     public int add(int a, int b){
//         return  a + b;
//     }
//     public static void main(String[] args) {
//         Main calc = new Main();
//         System.out.println(calc.add(4, 5));
//     }
// }

public class Main {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Main person = new Main();
        person.setName("Alice"); 
        System.out.println(person.getName()); 
    }
}



