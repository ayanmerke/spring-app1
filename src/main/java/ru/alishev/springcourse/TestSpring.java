package ru.alishev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());

//         Music music = context.getBean("rockMusic", Music.class);
//         MusicPlayer musicPlayer = new MusicPlayer(music);
//         musicPlayer.playMusic();
//
//         Music music2 = context.getBean("classicalMusic", Music.class);
//         MusicPlayer classicalMusicPlayer2 = new MusicPlayer(music2);
//         classicalMusicPlayer2.playMusic();

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Computor computor = context.getBean("computor", Computor.class);
        System.out.println(computor);

        // для гит проверка
        // для гит проверка 2
        // ручного создания объета уже нет
//
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//        //System.out.println(musicPlayer.getName());
//        //System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
