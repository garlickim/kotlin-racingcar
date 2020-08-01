package racing.domain

typealias Cars = List<Car>

class Car(val name: String = "", var distance: Int = 0) {

    fun makeCars(names: List<String>): Cars {
        return names.map { name -> Car(name) }
    }
}
