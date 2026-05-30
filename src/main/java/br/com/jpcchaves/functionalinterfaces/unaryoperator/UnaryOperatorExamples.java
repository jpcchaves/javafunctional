package br.com.jpcchaves.functionalinterfaces.unaryoperator;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class UnaryOperatorExamples {

    public static void main(String[] args) {
        Consumer<String> PRINT = System.out::println;
        var userRegisterList = getUserList();

        UnaryOperator<UserRegister> fillUUID = userRegister -> {
            userRegister.setUUID(UUID.randomUUID().toString());
            return userRegister;
        };

        userRegisterList.forEach(ur -> {
            fillUUID.apply(ur);
            PRINT.accept(ur.toString());
        });
    }

    public static List<UserRegister> getUserList() {
        return IntStream.range(0, 100).mapToObj(idx -> new UserRegister()).toList();
    }

    public static class UserRegister {
        private String UUID;

        public UserRegister() {
        }

        public UserRegister(String UUID) {
            this.UUID = UUID;
        }

        public String getUUID() {
            return UUID;
        }

        public void setUUID(String UUID) {
            this.UUID = UUID;
        }

        @Override
        public String toString() {
            return "UserRegister{" +
                    "UUID='" + UUID + '\'' +
                    '}';
        }
    }
}
