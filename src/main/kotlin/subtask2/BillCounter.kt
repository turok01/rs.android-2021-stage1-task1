package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        //throw NotImplementedError("Not implemented")
        var billAmount: Int = 0;
        for (i in 0..bill.size - 1) {
            billAmount+=bill[i];
        }
        billAmount -= bill[k];
        var difference: Int = b - billAmount/2
        if (difference == 0)
            return "Bon Appetit"
        else
            return difference.toString()
    }
}
