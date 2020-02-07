package com.google.DemoApp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class AllTimeSongs {
    private List<String> songs = new ArrayList(100);

    public AllTimeSongs() {
        this.songs.add("Hotel California – (Hell Freezes Over) – Eagles ");
        this.songs.add("Blackbird – Paul McCartney ");
        this.songs.add("Angie – Rolling Stones");
        this.songs.add("Heart of gold – Neil Young ");
        this.songs.add("More than words – Extreme ");
        this.songs.add("Wonderwall – Oasis ");
        this.songs.add("Layla (Unplugged) – Eric Clapton ");
        this.songs.add("To be with you – Mr. Big");
        this.songs.add("Under the bridge (acoustic) – Red Hot Chili Peppers ");
        this.songs.add("Working class hero – John Lennon ");
        this.songs.add("Crazy little thing called love – Queen ");
        this.songs.add("The Times They Are A Changin’ – Bob Dylan");
        this.songs.add("Dust In The Wind – Kansas ");
        this.songs.add("Daughters – John Mayer");
        this.songs.add("Everlong (acoustic) – Foo Fighters ");
        this.songs.add("The scientist (acoustic) – Coldplay");
        this.songs.add("The River (acoustic) – Bruce Springsteen");
        this.songs.add("Ain’t No Sunshine – Bill Withers");
        this.songs.add("When the stars go blue – Ryan Adams ");
        this.songs.add("Teach your children – Crosby, Still, Nash & Young ");
        this.songs.add("Cannonball – Damien Rice ");
        this.songs.add("Trouble – Ray La Montagne ");
        this.songs.add("Jolene – Dolly Parton ");
        this.songs.add("Wild horses – The Stones ");
        this.songs.add("Redemption Song – Bob Marley");
        this.songs.add("Free fallin’ – Tom Petty ");
        this.songs.add("She Talks To Angels – Black Crowes");
        this.songs.add("Fire and Rain – James Taylor ");
        this.songs.add("Give a little bit – Supertramp");
        this.songs.add("Pride and joy (acoustic) – Stevie Ray Vaughan ");
        this.songs.add("Sound of silence – Paul Simon");
        this.songs.add("Sweet home Chicago – Robert Johnson ");
        this.songs.add("Patience – Guns N’ Roses ");
        this.songs.add("Country roads – John Denver");
        this.songs.add("Have you ever seen the rain – CCR ");
        this.songs.add("Yellow (acoustic) – Coldplay");
        this.songs.add("The needle and the damage done – Neil Young ");
        this.songs.add("Horse with no name – America");
        this.songs.add("Banana Pancakes – Jack Johnson ");
        this.songs.add("About a girl – Nirvana ");
        this.songs.add("American Pie – Don Mclean");
        this.songs.add("Jack and diane – John Mellencamp ");
        this.songs.add("Iris – Goo goo dolls");
        this.songs.add("Wanted (Dead Or Alive) – Bon Jovi");
        this.songs.add("Both sides now – Joni Mitchell");
        this.songs.add("Tears In Heaven – Eric Clapton ");
        this.songs.add("Maggie May – Rod Stewart ");
        this.songs.add("Good riddance (time of your life) – Greenday ");
        this.songs.add("The A team – Ed Sheeran");
        this.songs.add("I Will Follow You Into The Dark – Death Cab for Cutie");
    }

    public String getRandomSong() {
        return (String)this.songs.get(ThreadLocalRandom.current().nextInt(1, this.songs.size()));
    }
}
