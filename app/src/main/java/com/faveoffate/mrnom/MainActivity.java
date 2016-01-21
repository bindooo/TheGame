package com.faveoffate.mrnom;

import com.faveoffate.framework.Screen;
import com.faveoffate.thegame.AndroidGame;

public class MainActivity extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}