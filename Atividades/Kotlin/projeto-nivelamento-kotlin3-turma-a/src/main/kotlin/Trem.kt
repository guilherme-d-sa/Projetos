/*
Uma 'data class' é quase uma classe comum, porém:
- Ela tem um "toString()" automático/implícito
- Ela tem "equals()" e "hashCode()" automáticos, por isso que
  ao comparar 2 objetos com os mesmos valores de atributos, temos 'true'
 */
data class Trem(val fabricante:String, val modelo:String, var passageiros:Int)