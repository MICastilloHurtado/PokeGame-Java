
package com.mycompany.pokegame;

public abstract class Pokemon {
    
    protected int num_pokedex;
    protected String nombrePokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporadaQueAparece;
    protected String tipo;
    
    abstract void atacarPlacaje();
    abstract void atacarArañazo();
    abstract void atacarMordisco();    
}
