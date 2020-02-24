package es.jmiko.helloworld;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        final LocalTime time = new LocalTime();
        Printer.out("Current local time: " + time);

        final Greeter g = new Greeter();
        Printer.out(g.sayHello("John Doe"));
    }
}