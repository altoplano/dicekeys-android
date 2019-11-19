//////////////////////////////////////////////////////////
// KeySqr Specification (NOT TO BE MODIFIED DIRECTLY!)
//////////////////////////////////////////////////////////
//
// This c++ header file specifies properties of KeySqr,
// including:
//   -- The set of letters that uniquely identify each element
//      (such as a die or chip)
//   -- the set of digits (1-6) that identify the face of
//      each element
//   -- The encoding of bits into the underlines and overlines
//
// This file is generated automatically by the KeySqr
// specification generator, which is written in TypeScript.
// That program also generates:
//    -- The SVG file that renders the appearance of each face
//    -- The TypeScript version of this specification file
//
// To change the KeySqr specification, you will need to change
// and re-run specification program in TypeScript.
//
// To add additional definitions or help functions, create a new file
// that reads the constants you need from this file.
//
package com.keysqr.FaceSpecification;

const val NumberOfDotsInUndoverline : Int = 11;
const val MinNumberOfBlackDotsInUndoverline : Int = 4;
const val MinNumberOfWhiteDotsInUndoverline : Int = 4;

class FaceWithUnderlineAndOverlineCode(
  val letter: Char,
  val digit: Char,
  val underlineCode: Short,
  val overlineCode: Short
) {};

object FaceDimensionsFractional {
	const val size: Float = 1f;
	const val margin: Float = 0f;
	const val linearSizeOfFace: Float = 1f;
	const val linearSizeOfFacesPrintArea: Float = 1f;
	const val center: Float = 0.5f;
	const val fontSize: Float = 0.741935f;
	const val undoverlineLength: Float = 1f;
	const val undoverlineThickness: Float = 0.177419f;
	const val overlineTop: Float = 0f;
	const val overlineBottom: Float = 0.177419f;
	const val underlineBottom: Float = 1f;
	const val underlineTop: Float = 0.822581f;
	const val undoverlineMarginAtLineStartAndEnd: Float = 0.056452f;
	const val undoverlineMarginAlongLength: Float = 0.048387f;
	const val undoverlineLeftEdge: Float = 0f;
	const val undoverlineFirstDotLeftEdge: Float = 0.056452f;
	const val undoverlineDotWidth: Float = 0.080645f;
	const val undoverlineDotHeight: Float = 0.080645f;
	const val centerOfUndoverlineToCenterOfFace: Float = 0.41129f;
	const val underlineDotTop: Float = 0.870968f;
	const val overlineDotTop: Float = 0.048387f;
	const val textBaselineY: Float = 0.725806f;
	const val charWidth: Float = 0.370968f;
	const val charHeight: Float = 0.488194f;
	const val spaceBetweenLetterAndDigit: Float = 0.04375f;
	const val textRegionWidth: Float = 0.785685f;
	const val textRegionHeight: Float = 0.488194f;
	val dotCentersAsFractionOfUndoverline = listOf<Float>(0.0967745f, 0.1774195f, 0.2580645f, 0.3387095f, 0.41935449999999996f, 0.4999995f, 0.5806445f, 0.6612894999999999f, 0.7419344999999999f, 0.8225795f, 0.9032244999999999f);
};

val FaceLetters: List<Char> = listOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
val FaceDigits: List<Char> = listOf('1', '2', '3', '4', '5', '6')
val FaceRotationLetters: List<Char> = listOf('t', 'r', 'b', 'l')

val NullFaceWithUnderlineAndOverlineCode = FaceWithUnderlineAndOverlineCode(' ', ' ', 0, 0);

val letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes = listOf<FaceWithUnderlineAndOverlineCode>(
	FaceWithUnderlineAndOverlineCode('A', '1', 7, 233),
	FaceWithUnderlineAndOverlineCode('A', '2', 11, 241),
	FaceWithUnderlineAndOverlineCode('A', '3', 13, 224),
	FaceWithUnderlineAndOverlineCode('A', '4', 22, 242),
	FaceWithUnderlineAndOverlineCode('A', '5', 26, 234),
	FaceWithUnderlineAndOverlineCode('A', '6', 30, 225),
	FaceWithUnderlineAndOverlineCode('B', '1', 31, 230),
	FaceWithUnderlineAndOverlineCode('B', '2', 38, 195),
	FaceWithUnderlineAndOverlineCode('B', '3', 39, 196),
	FaceWithUnderlineAndOverlineCode('B', '4', 41, 198),
	FaceWithUnderlineAndOverlineCode('B', '5', 43, 220),
	FaceWithUnderlineAndOverlineCode('B', '6', 44, 202),
	FaceWithUnderlineAndOverlineCode('C', '1', 45, 205),
	FaceWithUnderlineAndOverlineCode('C', '2', 46, 208),
	FaceWithUnderlineAndOverlineCode('C', '3', 49, 201),
	FaceWithUnderlineAndOverlineCode('C', '4', 50, 212),
	FaceWithUnderlineAndOverlineCode('C', '5', 51, 211),
	FaceWithUnderlineAndOverlineCode('C', '6', 52, 197),
	FaceWithUnderlineAndOverlineCode('D', '1', 53, 194),
	FaceWithUnderlineAndOverlineCode('D', '2', 55, 216),
	FaceWithUnderlineAndOverlineCode('D', '3', 57, 218),
	FaceWithUnderlineAndOverlineCode('D', '4', 58, 199),
	FaceWithUnderlineAndOverlineCode('D', '5', 59, 192),
	FaceWithUnderlineAndOverlineCode('D', '6', 60, 214),
	FaceWithUnderlineAndOverlineCode('E', '1', 61, 209),
	FaceWithUnderlineAndOverlineCode('E', '2', 62, 204),
	FaceWithUnderlineAndOverlineCode('E', '3', 63, 203),
	FaceWithUnderlineAndOverlineCode('E', '4', 69, 166),
	FaceWithUnderlineAndOverlineCode('E', '5', 71, 188),
	FaceWithUnderlineAndOverlineCode('E', '6', 74, 163),
	FaceWithUnderlineAndOverlineCode('F', '1', 75, 164),
	FaceWithUnderlineAndOverlineCode('F', '2', 76, 178),
	FaceWithUnderlineAndOverlineCode('F', '3', 77, 181),
	FaceWithUnderlineAndOverlineCode('F', '4', 78, 168),
	FaceWithUnderlineAndOverlineCode('F', '5', 81, 177),
	FaceWithUnderlineAndOverlineCode('F', '6', 82, 172),
	FaceWithUnderlineAndOverlineCode('G', '1', 83, 171),
	FaceWithUnderlineAndOverlineCode('G', '2', 85, 186),
	FaceWithUnderlineAndOverlineCode('G', '3', 86, 167),
	FaceWithUnderlineAndOverlineCode('G', '4', 87, 160),
	FaceWithUnderlineAndOverlineCode('G', '5', 88, 165),
	FaceWithUnderlineAndOverlineCode('G', '6', 89, 162),
	FaceWithUnderlineAndOverlineCode('H', '1', 91, 184),
	FaceWithUnderlineAndOverlineCode('H', '2', 92, 174),
	FaceWithUnderlineAndOverlineCode('H', '3', 93, 169),
	FaceWithUnderlineAndOverlineCode('H', '4', 94, 180),
	FaceWithUnderlineAndOverlineCode('H', '5', 95, 179),
	FaceWithUnderlineAndOverlineCode('H', '6', 98, 157),
	FaceWithUnderlineAndOverlineCode('I', '1', 99, 154),
	FaceWithUnderlineAndOverlineCode('I', '2', 100, 140),
	FaceWithUnderlineAndOverlineCode('I', '3', 101, 139),
	FaceWithUnderlineAndOverlineCode('I', '4', 102, 150),
	FaceWithUnderlineAndOverlineCode('I', '5', 103, 145),
	FaceWithUnderlineAndOverlineCode('I', '6', 104, 148),
	FaceWithUnderlineAndOverlineCode('J', '1', 105, 147),
	FaceWithUnderlineAndOverlineCode('J', '2', 106, 142),
	FaceWithUnderlineAndOverlineCode('J', '3', 107, 137),
	FaceWithUnderlineAndOverlineCode('J', '4', 109, 152),
	FaceWithUnderlineAndOverlineCode('J', '5', 110, 133),
	FaceWithUnderlineAndOverlineCode('J', '6', 111, 130),
	FaceWithUnderlineAndOverlineCode('K', '1', 112, 155),
	FaceWithUnderlineAndOverlineCode('K', '2', 113, 156),
	FaceWithUnderlineAndOverlineCode('K', '3', 114, 129),
	FaceWithUnderlineAndOverlineCode('K', '4', 115, 134),
	FaceWithUnderlineAndOverlineCode('K', '5', 116, 144),
	FaceWithUnderlineAndOverlineCode('K', '6', 117, 151),
	FaceWithUnderlineAndOverlineCode('L', '1', 118, 138),
	FaceWithUnderlineAndOverlineCode('L', '2', 119, 141),
	FaceWithUnderlineAndOverlineCode('L', '3', 120, 136),
	FaceWithUnderlineAndOverlineCode('L', '4', 121, 143),
	FaceWithUnderlineAndOverlineCode('L', '5', 122, 146),
	FaceWithUnderlineAndOverlineCode('L', '6', 123, 149),
	FaceWithUnderlineAndOverlineCode('M', '1', 124, 131),
	FaceWithUnderlineAndOverlineCode('M', '2', 125, 132),
	FaceWithUnderlineAndOverlineCode('M', '3', 126, 153),
	FaceWithUnderlineAndOverlineCode('M', '4', 133, 106),
	FaceWithUnderlineAndOverlineCode('M', '5', 135, 112),
	FaceWithUnderlineAndOverlineCode('M', '6', 137, 114),
	FaceWithUnderlineAndOverlineCode('N', '1', 139, 104),
	FaceWithUnderlineAndOverlineCode('N', '2', 141, 121),
	FaceWithUnderlineAndOverlineCode('N', '3', 142, 100),
	FaceWithUnderlineAndOverlineCode('N', '4', 143, 99),
	FaceWithUnderlineAndOverlineCode('N', '5', 146, 96),
	FaceWithUnderlineAndOverlineCode('N', '6', 147, 103),
	FaceWithUnderlineAndOverlineCode('O', '1', 148, 113),
	FaceWithUnderlineAndOverlineCode('O', '2', 149, 118),
	FaceWithUnderlineAndOverlineCode('O', '3', 150, 107),
	FaceWithUnderlineAndOverlineCode('O', '4', 151, 108),
	FaceWithUnderlineAndOverlineCode('O', '5', 152, 105),
	FaceWithUnderlineAndOverlineCode('O', '6', 153, 110),
	FaceWithUnderlineAndOverlineCode('P', '1', 154, 115),
	FaceWithUnderlineAndOverlineCode('P', '2', 155, 116),
	FaceWithUnderlineAndOverlineCode('P', '3', 156, 98),
	FaceWithUnderlineAndOverlineCode('P', '4', 157, 101),
	FaceWithUnderlineAndOverlineCode('P', '5', 158, 120),
	FaceWithUnderlineAndOverlineCode('P', '6', 161, 76),
	FaceWithUnderlineAndOverlineCode('R', '1', 162, 81),
	FaceWithUnderlineAndOverlineCode('R', '2', 163, 86),
	FaceWithUnderlineAndOverlineCode('R', '3', 165, 71),
	FaceWithUnderlineAndOverlineCode('R', '4', 166, 90),
	FaceWithUnderlineAndOverlineCode('R', '5', 167, 93),
	FaceWithUnderlineAndOverlineCode('R', '6', 168, 88),
	FaceWithUnderlineAndOverlineCode('S', '1', 170, 66),
	FaceWithUnderlineAndOverlineCode('S', '2', 171, 69),
	FaceWithUnderlineAndOverlineCode('S', '3', 172, 83),
	FaceWithUnderlineAndOverlineCode('S', '4', 173, 84),
	FaceWithUnderlineAndOverlineCode('S', '5', 174, 73),
	FaceWithUnderlineAndOverlineCode('S', '6', 175, 78),
	FaceWithUnderlineAndOverlineCode('T', '1', 176, 87),
	FaceWithUnderlineAndOverlineCode('T', '2', 177, 80),
	FaceWithUnderlineAndOverlineCode('T', '3', 178, 77),
	FaceWithUnderlineAndOverlineCode('T', '4', 179, 74),
	FaceWithUnderlineAndOverlineCode('T', '5', 180, 92),
	FaceWithUnderlineAndOverlineCode('T', '6', 181, 91),
	FaceWithUnderlineAndOverlineCode('U', '1', 182, 70),
	FaceWithUnderlineAndOverlineCode('U', '2', 183, 65),
	FaceWithUnderlineAndOverlineCode('U', '3', 184, 68),
	FaceWithUnderlineAndOverlineCode('U', '4', 185, 67),
	FaceWithUnderlineAndOverlineCode('U', '5', 186, 94),
	FaceWithUnderlineAndOverlineCode('U', '6', 187, 89),
	FaceWithUnderlineAndOverlineCode('V', '1', 188, 79),
	FaceWithUnderlineAndOverlineCode('V', '2', 189, 72),
	FaceWithUnderlineAndOverlineCode('V', '3', 190, 85),
	FaceWithUnderlineAndOverlineCode('V', '4', 193, 52),
	FaceWithUnderlineAndOverlineCode('V', '5', 194, 41),
	FaceWithUnderlineAndOverlineCode('V', '6', 195, 46),
	FaceWithUnderlineAndOverlineCode('W', '1', 196, 56),
	FaceWithUnderlineAndOverlineCode('W', '2', 198, 34),
	FaceWithUnderlineAndOverlineCode('W', '3', 199, 37),
	FaceWithUnderlineAndOverlineCode('W', '4', 201, 39),
	FaceWithUnderlineAndOverlineCode('W', '5', 202, 58),
	FaceWithUnderlineAndOverlineCode('W', '6', 203, 61),
	FaceWithUnderlineAndOverlineCode('X', '1', 204, 43),
	FaceWithUnderlineAndOverlineCode('X', '2', 205, 44),
	FaceWithUnderlineAndOverlineCode('X', '3', 206, 49),
	FaceWithUnderlineAndOverlineCode('X', '4', 207, 54),
	FaceWithUnderlineAndOverlineCode('X', '5', 208, 47),
	FaceWithUnderlineAndOverlineCode('X', '6', 209, 40),
	FaceWithUnderlineAndOverlineCode('Y', '1', 210, 53),
	FaceWithUnderlineAndOverlineCode('Y', '2', 211, 50),
	FaceWithUnderlineAndOverlineCode('Y', '3', 212, 36),
	FaceWithUnderlineAndOverlineCode('Y', '4', 213, 35),
	FaceWithUnderlineAndOverlineCode('Y', '5', 214, 62),
	FaceWithUnderlineAndOverlineCode('Y', '6', 215, 57),
	FaceWithUnderlineAndOverlineCode('Z', '1', 216, 60),
	FaceWithUnderlineAndOverlineCode('Z', '2', 217, 59),
	FaceWithUnderlineAndOverlineCode('Z', '3', 218, 38),
	FaceWithUnderlineAndOverlineCode('Z', '4', 219, 33),
	FaceWithUnderlineAndOverlineCode('Z', '5', 220, 55),
	FaceWithUnderlineAndOverlineCode('Z', '6', 221, 48)
);

val underlineCodeToFaceWithUnderlineAndOverlineCode = listOf<FaceWithUnderlineAndOverlineCode>(
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[0],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[1],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[2],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[3],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[4],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[5],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[6],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[7],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[8],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[9],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[10],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[11],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[12],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[13],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[14],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[15],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[16],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[17],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[18],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[19],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[20],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[21],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[22],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[23],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[24],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[25],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[26],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[27],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[28],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[29],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[30],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[31],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[32],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[33],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[34],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[35],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[36],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[37],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[38],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[39],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[40],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[41],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[42],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[43],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[44],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[45],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[46],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[47],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[48],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[49],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[50],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[51],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[52],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[53],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[54],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[55],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[56],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[57],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[58],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[59],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[60],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[61],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[62],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[63],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[64],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[65],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[66],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[67],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[68],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[69],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[70],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[71],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[72],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[73],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[74],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[75],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[76],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[77],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[78],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[79],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[80],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[81],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[82],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[83],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[84],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[85],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[86],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[87],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[88],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[89],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[90],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[91],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[92],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[93],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[94],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[95],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[96],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[97],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[98],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[99],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[100],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[101],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[102],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[103],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[104],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[105],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[106],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[107],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[108],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[109],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[110],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[111],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[112],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[113],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[114],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[115],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[116],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[117],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[118],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[119],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[120],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[121],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[122],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[123],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[124],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[125],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[126],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[127],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[128],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[129],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[130],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[131],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[132],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[133],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[134],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[135],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[136],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[137],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[138],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[139],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[140],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[141],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[142],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[143],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[144],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[145],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[146],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[147],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[148],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[149],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode
);

val overlineCodeToFaceWithUnderlineAndOverlineCode = listOf<FaceWithUnderlineAndOverlineCode>(
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[147],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[127],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[141],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[140],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[128],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[146],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[129],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[137],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[124],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[132],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[133],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[125],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[136],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[149],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[134],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[139],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[123],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[138],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[135],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[148],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[126],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[143],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[130],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[145],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[144],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[131],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[142],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[115],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[102],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[117],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[116],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[103],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[114],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[98],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[121],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[106],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[111],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[95],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[110],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[107],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[120],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[109],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[96],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[104],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[105],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[122],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[97],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[108],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[101],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[119],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[99],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[113],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[112],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[100],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[118],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[82],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[92],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[81],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[80],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[93],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[83],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[78],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[88],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[75],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[86],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[87],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[89],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[76],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[84],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[77],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[90],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[91],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[85],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[94],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[79],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[62],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[59],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[72],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[73],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[58],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[63],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[68],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[56],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[66],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[50],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[49],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[67],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[55],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[69],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[64],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[52],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[70],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[54],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[53],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[71],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[51],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[65],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[57],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[74],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[48],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[60],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[61],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[47],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[39],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[41],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[29],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[30],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[40],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[27],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[38],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[33],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[44],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[36],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[35],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[43],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[34],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[31],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[46],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[45],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[32],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[42],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[37],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[28],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[22],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[18],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[7],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[8],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[17],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[9],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[21],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[14],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[11],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[26],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[25],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[12],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[13],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[24],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[16],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[15],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[23],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[19],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[20],
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[10],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[2],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[5],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[6],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[0],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[4],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[1],
	letterIndexTimesSixPlusDigitIndexFaceWithUndoverlineCodes[3],
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode,
	NullFaceWithUnderlineAndOverlineCode
);

fun decodeUndoverlineByte(isOverline: Boolean, letterDigitEncodingByte: Int): FaceWithUnderlineAndOverlineCode  {
  return if (isOverline)
		overlineCodeToFaceWithUnderlineAndOverlineCode[letterDigitEncodingByte]
	else
		underlineCodeToFaceWithUnderlineAndOverlineCode[letterDigitEncodingByte];
}
