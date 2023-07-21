package com.example.remidnerslibrary

import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

// Taking in a Unix time and formatting it to a date as String
fun Long.tbx_fromUnixToFormatted(): String {
    val sdf = SimpleDateFormat("dd/MM/yy HH:mm", Locale.getDefault())
    sdf.timeZone = TimeZone.getTimeZone("Asia/Jerusalem")
    val netDate = Date(this*1000)
    return sdf.format(netDate)
}

fun Double.tbx_toOneDecimal(): String {
    val df = DecimalFormat("#.#")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}

fun Double.tbx_toTwoDecimal(): String{
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.DOWN
    return df.format(this)
}