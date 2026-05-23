package br.com.jpcchaves.functionalinterfaces.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> supplyName = () -> "Teste";
        Supplier<LocalDateTime> currentLocalDateTime = LocalDateTime::now;
        System.out.println(supplyName.get());
        System.out.println(currentLocalDateTime.get());

        Supplier<ConfigurationTest> defaultConfigTest = () -> new ConfigurationTest("http://localhost", "8080");
        var suppliedConfig = defaultConfigTest.get();
        System.out.println("Supplied config: " + suppliedConfig.getHost() + ":" + suppliedConfig.getPort());
    }

    public static class ConfigurationTest {
        private String host;
        private String port;

        public ConfigurationTest() {
        }

        public ConfigurationTest(String host, String port) {
            this.host = host;
            this.port = port;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }
    }
}
