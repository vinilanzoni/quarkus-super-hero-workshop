package br.com.tokenlab.fight.client;

import javax.validation.constraints.NotNull;

public class Villain {

    @NotNull
    public String name;
    @NotNull
    public int level;
    @NotNull
    public String picture;
    public String powers;

}