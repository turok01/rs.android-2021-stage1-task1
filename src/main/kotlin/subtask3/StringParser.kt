package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        //throw NotImplementedError("Not implemented}
        var start_index: Int = 0
        var start_char: Char = ' '
        var words_number: Int = 0
        var strArray : ArrayList<String> = arrayListOf<String>()
        var stop: Boolean = false
        var finded_bracket: Boolean = false
        val array_open_brackets: Array<Char> = arrayOf('[','(','<')
        val array_close_brackets: Array<Char> = arrayOf(']',')','>')
        var open_bracket : Char = ' '
        var close_bracket : Char
        var start_word_index: Int = 0
        var brackets_counter: Int = 0
        var bracket_pair_number: Int = 0

        do{
            finded_bracket = false

            for (i in start_index until inputString.length){

                if (!finded_bracket && (inputString[i] in array_open_brackets)){
                    finded_bracket = true
                    open_bracket = inputString[i]
                    start_index = i
                    for (n in 0 until array_open_brackets.size){
                        if (open_bracket == array_open_brackets[n]){
                            bracket_pair_number = n
                            break
                            }
                    }
                }
                if (inputString[i] in array_open_brackets){
                    if (inputString[i] == open_bracket)
                        brackets_counter++
                }
                if (finded_bracket && (inputString[i] == array_close_brackets[bracket_pair_number])){
                    brackets_counter--
                    if (brackets_counter == 0 && (i-start_index > 1) ){
                        strArray.add(inputString.subSequence(start_index+1,i) as String)
                        break
                    }


                }

            }
            start_index++
            if (start_index >= inputString.length - 1)
                stop = true
        }
            while (!stop)


        /*
        inputString.forEachIndexed{index, char ->{
            if (char == '(' || char == '[' || char == '<'){
                start_index = index
                start_char = char
            }
            if (char == ')' || char == ']' || char == '>'){
                if ((start_char == '(' && char == ')') ||
                    (start_char == '[' && char == ']') ||
                    (start_char == '<' && char == '>')) {


                }

            }
        }
        }
        */

        return strArray.toTypedArray();

    }
}
