package com.hillel.dolhunin.homeworks.homework14;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new ClassicMusic(),
                new PopMusic(),
                new RockMusic()
        };

        for (MusicStyles music: musicStyles) {
            music.playMusic();
        }
    }
}
