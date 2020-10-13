package br.com.tokenlab.fight;

import br.com.tokenlab.fight.client.Hero;
import br.com.tokenlab.fight.client.Villain;

import javax.validation.constraints.NotNull;

public class Fighters {

    @NotNull
    public Hero hero;
    @NotNull
    public Villain villain;
}
