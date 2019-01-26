package player

import org.academiadecodigo.bootcamp.Prompt
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner

class Hero : PlayerHero {
    private val prompt = Prompt(System.`in`, System.out)
    private val inputScanner = StringInputScanner()
    override fun promptName() {
        inputScanner.setMessage("Who are you, stranger?")
        prompt.getUserInput(inputScanner)
        println()
    }

    override fun open(door: Any) {

    }

    override fun pick(key: Any) {

    }

    override fun use(key: Any) {

    }
}
