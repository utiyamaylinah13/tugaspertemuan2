data class biodata(
    val nama: String,
    val tanggallahir: Int,
    val alamat: String,
    val instagram: String
)

fun main() {
 val biodata = biodata(
     nama = "utiya maylinah",
     tanggallahir = 13,
     alamat = "brebes",
     instagram = "tyaya_13"
 )
    println("nama:${biodata.nama}")
    println("tanggallahir:${biodata.tanggallahir}")
    println("alamat${biodata.alamat}")
    println("instagram:${biodata.instagram}")
}