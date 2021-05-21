package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        //throw NotImplementedError("Not implemented")
        var happy = false
        var arraySize: Int = sadArray.size
        while(!happy) {
            happy = true
            for (i in 0 until arraySize) {
                if (i > 0 && i < arraySize - 1) { //don't check the extreme(border) elements
                    if (sadArray[i] > sadArray[i - 1] + sadArray[i + 1]) { //if not happy
                        happy = false
                        for (j in i..arraySize - 2) {// shift the elements of array
                            sadArray[j] = sadArray[j + 1]
                        }
                        arraySize-- // size of new happy array will by less
                    }
                }
            }
        }
        var happyArray: IntArray = intArrayOf()
        for (i in 0 until arraySize)
            happyArray += sadArray[i]
        return happyArray
    }
}
