package array

class RemoveDuplicatesTest extends GroovyTestCase {

  void testRemoveDuplicates() {
    def testArray = [1, 1, 3, 4, 5, 6, 7] as int[]
    assert RemoveDuplicates.removeDuplicates(testArray) == 6
    assert testArray[0..5] == [1, 3, 4, 5, 6, 7]

    testArray = [0,0,1,1,1,2,2,3,3,4] as int[]
    assert RemoveDuplicates.removeDuplicates(testArray) == 5
    assert testArray[0..4] == [0, 1, 2, 3, 4]

    testArray = [2,2,3,4,5,5,0,0,1,3,2,2,3,3,4] as int[]
    assert RemoveDuplicates.removeDuplicates(testArray) == 6
    assert testArray[0..5] == [2, 3, 4, 5, 0, 1]

    testArray = [1, 1, 3, 4, 5, 6, 7] as int[]
    assert RemoveDuplicates.removeDuplicatesSorted(testArray) == 6
    assert testArray[0..5] == [1, 3, 4, 5, 6, 7]

    testArray = [0,0,1,1,1,2,2,3,3,4] as int[]
    assert RemoveDuplicates.removeDuplicatesSorted(testArray) == 5
    assert testArray[0..4] == [0, 1, 2, 3, 4]
  }
}
