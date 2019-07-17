package dinamicProgramming

class MaximizeProfitTest extends GroovyTestCase {

  void testMaxProfit1() {
    def testArray = [7, 1, 5, 3, 6, 4] as int[]
    assert MaximizeProfit.maxProfit1(testArray) == 5

    testArray = [7, 6, 4, 3, 1] as int[]
    assert MaximizeProfit.maxProfit1(testArray) == 0
  }

  void testMaxProfitN() {
    def testArray = [7, 1, 5, 3, 6, 4] as int[]
    assert MaximizeProfit.maxProfitN(testArray) == 7

    testArray = [1, 2, 3, 4, 5] as int[]
    assert MaximizeProfit.maxProfitN(testArray) == 4

    testArray = [7, 6, 4, 3, 1] as int[]
    assert MaximizeProfit.maxProfitN(testArray) == 0
  }
}
