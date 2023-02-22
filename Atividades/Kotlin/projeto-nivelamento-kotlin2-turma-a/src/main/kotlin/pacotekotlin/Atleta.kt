package pacotekotlin

class Atleta {
    var nome:String? = null
        set(value) {
            if (value != null && value.length >= 3) {
                field = value
            }
        }
        get() {
            return field?.toUpperCase();
        }
        // get() = field?.toUpperCase()

    var peso:Double? = null
        set(value) {
            if (value!=null && value >= 0.0) {
                field = value
            }
        }
}