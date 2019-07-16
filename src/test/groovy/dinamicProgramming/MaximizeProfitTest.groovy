package dinamicProgramming

class MaximizeProfitTest extends GroovyTestCase {

  void testMaxProfit() {
    def testArray = [7, 1, 5, 3, 6, 4] as int[]
    assert MaximizeProfit.maxProfit(testArray) == 5

    testArray = [7, 6, 4, 3, 1] as int[]
    assert MaximizeProfit.maxProfit(testArray) == 0
  }
}
