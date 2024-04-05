class PokemonEau {
    var nom = ""
    var hp = 0
    var atk = 0

    constructor(nom: String, hp: Int, atk: Int) {
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
}