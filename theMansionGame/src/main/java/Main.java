import mansion.Hall
import player.Hero

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val hero = Hero()
        val mansionHall = Hall()
        hero.promptName()
    }
}
