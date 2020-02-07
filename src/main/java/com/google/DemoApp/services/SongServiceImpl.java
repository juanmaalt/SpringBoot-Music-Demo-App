package com.google.DemoApp.services;

import com.google.DemoApp.model.AllTimeSongs;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class SongServiceImpl implements SongService {

    private final AllTimeSongs allTimeSongs;

    public SongServiceImpl() {
        this.allTimeSongs = new AllTimeSongs();
    }

    @Override
    public String getSong() {
        return allTimeSongs.getRandomSong();
    }
}
