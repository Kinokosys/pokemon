class PokemonFeu {
    var nom = ""
    var hp = 0
    var atk = 0.0

    constructor(nom: String, hp: Int, atk: Double) {
        this.nom = nom
        this.hp = hp
        this.atk = atk
    }

    fun isDead(): Boolean {
        if (this.hp == 0) {
            return true
        } else {
            return false
        }
    }

    fun attaquer(p = PokemonEau() || PokemonFeu() || PokemonPlante(+)) {
        if (p == PokemonPlante()) {
            this.atk *= 2.0
        } else if (p == PokemonEau() || PokemonFeu()) {
            this.atk *= 0.5
        }
    }
}