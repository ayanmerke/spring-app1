package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
//    private ClassicalMusic() {}
//
//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    public void doMyInit() {
//        System.out.println("Doing my initialisation");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("doing my destruction");
//    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
