package br.com.jpcchaves.streams.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByAgeExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("João Paulo", 28),
                new User("Ramesh", 30),
                new User("Zezin", 75),
                new User("Aluizio", 20),
                new User("Tripa Seca", 15)
        );

        Comparator<User> userComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {

                // o1.getAge - o2.getAge -> se for negativo = o1 vem antes de o2
                // o1.getAge - o2.getAge -> se for positovo = o1 vem depois de o2
                // o1.getAge - o2.getAge -> se for zero = o1 vem antes de o2

                // Nos casos de o1.getAge e o2.getAge = 0
                /*
                *
                * Desde o Java 7, é utilizado o algoritmo TimSort
                * O que esse algoritmo faz?
                *
                * Elementos com o mesmo valor de comparação mantêm a ordem
                * relativa original que tinham na lista antes do sort.
                *
                * Supondo uma lista assim [João (25), Maria (30), Ana (25), Carlos (20)]
                *
                * O resultado seria assim: [Carlos (20), João (25), Ana (25), Maria (30)]
                *
                * João e Ana tem a mesma idade, mas, João aparece primeiro na lista e Ana em sequência preservando
                * a ordem relativa original
                */
                return o1.getAge() - o2.getAge();
            }
        };

        List<User> usersSortedAscending = users.stream().sorted(Comparator.comparingInt(User::getAge)).toList();

        System.out.println(usersSortedAscending);

        List<User> usersSortedDescending = users.stream().sorted(Comparator.comparingInt(User::getAge).reversed()).toList();

        System.out.println(usersSortedDescending);
    }


    public static class User {
        private String name;
        private int age;

        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
