package OOP1.builder;

public class Main {
    public static void main(String[] args) {
        final Person person = Person.builder()
                .firstName("Andrew")
                .lastName("Antonov")
                .middleName("Ivanovich")
                .country("Russia")
                .address("Moscow")
                .phone("8-915-201-01-01")
                .age(35)
                .gender("male")
                .build();
        System.out.println(person);
    }
}
