class Mitarbeiter {

    var id = 2304
    var name = "Sam"
    var position = "Angestellter"
    var gehalt = 2000
    var artDerBeschaeftigung = "Vollzeit"
    var mutterschaftsUrlaub = false


    fun gehaltAusgeben(){
        println("Name des Mitarbeiter:$name und Gehalt:$gehalt€.")
    }

    fun befoerdern(){
        println("Gewünschten Betrag eingeben:")
        gehalt = readln().toInt()
        println("Die Position:$position und neues Gehalt:$gehalt €.")
    }

    fun istVerfuegbar(){
        if (!mutterschaftsUrlaub) {
            println("Der Mitarbeiter kann zurzeit arbeiten.")
        } else {
            println("Die Mitarbeiterin befindet sich momentan im Mutterschaftsurlaub.")
        }
    }
}

