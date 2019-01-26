package mansion

import objects.Door
import objects.Key

import java.util.HashMap

class Hall {
    private val doors = HashMap<Door, Key>()

    fun initHall() {
        doors[Door(1)] = Key(1)
        doors[Door(2)] = Key(2)

    }
}
