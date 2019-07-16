package array

class RotateRightTest extends GroovyTestCase {

  void testRotateRightArray() {
    def testArray = [1, 2, 3, 4, 5, 6, 7] as int[]
    RotateRight.rotateArray(testArray, 3)
    assertArrayEquals(
        testArray as Integer[],
        [5, 6, 7, 1, 2, 3, 4] as Integer[]
    )

    testArray = [-1, -100, 3, 99] as int[]
    RotateRight.rotateArray(testArray, 2)
    assertArrayEquals(
        testArray as Integer[],
        [3, 99, -1, -100] as Integer[]
    )

    testArray = [] as int[]
    RotateRight.rotateArray(testArray, 3)
    assertArrayEquals(
        testArray as Integer[],
        [] as Integer[]
    )
  }
}
