package com.faveoffate.mrnom;

import com.faveoffate.framework.Screen;
import com.faveoffate.thegame.AndroidGame;

public class MrNomGame extends AndroidGame {
    @Override
    public Screen getStartScreen() {
        return new LoadingScreen(this);
    }
}
