package bhavesh.marvelhub.app.util

import java.math.BigInteger
import java.security.MessageDigest
import java.sql.Timestamp

object Constants {
    const val BASE_URL = "https://gateway.marvel.com/v1/public/"
    val timeStamp = Timestamp(System.currentTimeMillis()).time.toString()
    const val API_KEY = "981784cfa05a26fbeecc1770a2404166"
    const val PRIVATE_KEY = "8df9052739994b1ae83a9d89f4b04f3a0473a455"
    const val LIMIT = 10
    fun hash():String {
        val input = "$timeStamp$PRIVATE_KEY$API_KEY"
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1,md.digest(input.toByteArray())).toString(16).padStart(32,'0')
    }
}