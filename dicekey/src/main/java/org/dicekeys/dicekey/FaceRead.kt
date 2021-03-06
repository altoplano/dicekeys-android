package org.dicekeys.dicekey

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

@JsonClass(generateAdapter = true)
class Point(
        val x: Float,
        val y: Float
)

@JsonClass(generateAdapter = true)
class Line(
        val start: Point,
        val end: Point
)

@JsonClass(generateAdapter = true)
class Undoverline(
        val line: Line,
        val code: Int
)


@JsonClass(generateAdapter = true)
class FaceRead constructor(
        val underline: Undoverline?,
        val overline: Undoverline?,
        override val orientationAsLowercaseLetterTrbl: Char,
        val ocrLetterCharsFromMostToLeastLikely: String,
        val ocrDigitCharsFromMostToLeastLikely: String,
        val center: Point
): Face(
        majorityOfThree(
                underline?.let { decodeUndoverlineByte(false, it.code).letter }
                        ?: '?',
                overline?.let { decodeUndoverlineByte(true, it.code).letter }
                        ?: '?',
                ocrLetterCharsFromMostToLeastLikely[0]),
        majorityOfThree(
                underline?.let { decodeUndoverlineByte(false, it.code).digit }
                        ?: '?',
                overline?.let { decodeUndoverlineByte(true, it.code).digit }
                        ?: '?',
                ocrDigitCharsFromMostToLeastLikely[0]),
        orientationAsLowercaseLetterTrbl
)
 {

    companion object {
        val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
        val faceReadJsonAdapter: JsonAdapter<List<FaceRead>> =
                moshi.adapter(Types.newParameterizedType(List::class.java, FaceRead::class.java))


        fun diceKeyFromListOfFacesRead(facesRead: List<FaceRead>): DiceKey<FaceRead> {
            return DiceKey<FaceRead>(facesRead)
        }

        fun diceKeyFromJsonFacesRead(json: String): DiceKey<FaceRead>? {
            try {

                if (json == "null" || json[0] != '[')
                    return null
                val faces = faceReadJsonAdapter.fromJson(json)
                return if (faces == null) null else diceKeyFromListOfFacesRead(faces)
            } catch (e: Exception) {
                return null
            }
        }


        fun majorityOfThree(a: Char, b: Char, c: Char): Char {
            return when {
                (a == b || a == c) -> a
                (b == c) -> b
                else -> '?'
            }
        }
    }

    val underlineLetter: Char
        get() {
            return if (underline == null)
                '?'
            else
                decodeUndoverlineByte(false, underline.code).letter
        }
    val underlineDigit: Char
        get() {
            return if (underline == null)
                '?'
            else
                decodeUndoverlineByte(false, underline.code).digit
        }
    val overlineLetter: Char
        get() {
            return if (overline == null)
                '?'
            else
                decodeUndoverlineByte(true, overline.code).letter
        }
    val overlineDigit: Char
        get() {
            return if (overline == null)
                '?'
            else
                decodeUndoverlineByte(true, overline.code).digit
        }

    override val underlineCode: Short?
        get() {
            return underline?.code?.toShort()
        }
    override val overlineCode: Short?
        get() {
            return overline?.code?.toShort()
        }
 }
