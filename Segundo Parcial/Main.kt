fun main() {
    println("Hello, Kotlin/Native!")
    val myPhone = Phone()
    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.getTurn()


    val miVehiculo = Vehiculo()
    miVehiculo.color="Azul"
    miVehiculo.marca="Ferrari"
    miVehiculo.modelo="Roma"
    miVehiculo.placas="IAM-GOD"

    println("El coche esta prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("el coche esta prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.00f)
    println("El tanque tiene ${miVehiculo.gasolina}")

    var mario = Mario()
    mario.collision(collisionObj = "Pipe")

    for (i in 1..5)
        mario.collision("Gomba")
    println("Te quedan ${mario.getlives()}")


}