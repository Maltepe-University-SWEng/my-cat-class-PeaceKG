package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {


        private String name;
        private int age;

        // Constructor
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age
        public void setAge(int age) {
            this.age = age;
        }

        // Meow method to play a cat sound
        public void meow() {
            System.out.println(name + " (" + name + ") miyavlıyor!");
            try {
                File soundFile = new File("C:\\Users\\kemal\\IdeaProjects\\cat\\meow.wav"); // Ses dosyası proje klasöründe olmalı
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
                Clip clip = AudioSystem.getClip();
                clip.open(audioStream);
                clip.start();
            } catch (Exception e) {
                System.out.println("Ses çalınamadı: " + e.getMessage());
            }
        }
    }
