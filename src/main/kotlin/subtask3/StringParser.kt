package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented}
        var startIndex: Int = 0
        var strArray : ArrayList<String> = arrayListOf<String>()
        var stop: Boolean = false
        var foundBracket: Boolean = false
        val arrayOpenBrackets: Array<Char> = arrayOf('[','(','<')
        val arrayCloseBrackets: Array<Char> = arrayOf(']',')','>')
        var openBracket : Char = ' '
        var bracketsCounter: Int = 0
        var bracketPairNumber: Int = 0

        do{
            foundBracket = false

            for (i in startIndex until inputString.length){
                if (!foundBracket && (inputString[i] in arrayOpenBrackets)){
                    foundBracket = true
                    openBracket = inputString[i]
                    startIndex = i
                    for (n in arrayOpenBrackets.indices){
                        if (openBracket == arrayOpenBrackets[n]){
                            bracketPairNumber = n
                            break
                            }
                    }
                }
                if (inputString[i] in arrayOpenBrackets){
                    if (inputString[i] == openBracket)
                        bracketsCounter++
                }
                if (foundBracket && (inputString[i] == arrayCloseBrackets[bracketPairNumber])){
                    bracketsCounter--
                    if (bracketsCounter == 0 && (i-startIndex > 1) ){
                        strArray.add(inputString.subSequence(startIndex+1,i) as String)
                        break
                    }
                }
            }

            startIndex++
            if (startIndex >= inputString.length - 1)
                stop = true
        }
        while (!stop)

        return strArray.toTypedArray()
    }
}
