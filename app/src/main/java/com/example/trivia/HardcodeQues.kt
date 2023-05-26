package com.example.trivia

object HardcodeQues {
    fun getQuestions(): ArrayList<QuestionVar>
    {
        val quesList= ArrayList<QuestionVar>()

        val ques1= QuestionVar(1,"How many Chaos Emeralds can you collect in the first Sonic The Hedgehog?",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            1)
        quesList.add(ques1)
        val ques2= QuestionVar(2,"What is the name of the former country that was succeeded by countries such as Serbia, Croatia and Slovenia?","Abkhazia",
            "Czechoslovakia",
            "Yugoslavia",
            "South Ossetia",
        3)
        quesList.add(ques2)
        val ques3= QuestionVar(3,"What was the original name of Crash Bandicoot?",
            "Coco Bandicoot",
            "Willie Wombat",
            "Wally Wombat",
            "Marvelous Mole",
            2)
        quesList.add(ques3)
        val ques4= QuestionVar(4,"The Ottoman Empire was dissolved after their loss in which war?",
            "Crimean War","Serbian Revolution","Second Balkan War","World War I",4)
        quesList.add(ques4)

        val ques5= QuestionVar(5,"When did the website Facebook launch?","2005","2004","2003","2006",2)
        quesList.add(ques5)

        val ques6= QuestionVar(6,"In the original DOOM (1993) which of the following is NOT a cheat code?","IDFA","IDCLIP","IDDQD","IDSPISPOPD",2)
        quesList.add(ques6)
        val ques7= QuestionVar(7,"The eccentric natural philosopher Tycho Brahe kept what as a pet?","Dog","Bear","Goat","Moose",4)
        quesList.add(ques7)
        val ques8= QuestionVar(8,"What is the capital of Scotland?","Edinburgh","Glasgow","Dundee","London",1)
        quesList.add(ques8)
        val ques9= QuestionVar(9,"What is the atomic number of the element Strontium?","73","47","38","11",3)
        quesList.add(ques9)
        val ques10= QuestionVar(10,"Satella in Re:Zero is the witch of what?","Envy","Pride","Sloth","Wrath",1)
        quesList.add(ques10)
        return quesList





    }
}