fun main() {
//    nilai ujian akhir
    val nilaiujian = listOf(80,85,90,87,70)

//    menghitung rata rata
    val totalnilai= nilaiujian.sum()
    val nilairatarata = totalnilai

//    tampilkan pesan berdasarkan rata-rata
    val pesan = when{
        nilairatarata>= 90->"nilai rata_rata sangat baik"
        nilairatarata>= 85->"nilai rata_rata baik"
        nilairatarata>= 70->"cukup baik"
        else->"nilai rata-rata perlu diperbaiki"
    }
    println("nilai rata-rata:$nilairatarata")
    println(pesan)

}