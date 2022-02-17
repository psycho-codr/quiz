package com.example.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,

            "In which decade was the American Institute of Electrical Engineers (AIEE) founded?",
            "1850s",
            "1880s",
            "1930s",
            "1950s",
            2
        )
        questionsList.add(question1)

        val question2 = Question(
            1,
            "What is part of a database that holds only one type of information?",
            "Report",
            "Field",
            "Record",
            "File",
            2
        )
        questionsList.add(question2)

        val question3 = Question(
            1,

            "'OS' computer abbreviation usually means ?",
            "Order of Significance",
            "Open Software",
            "Operating System",
            "Optical Sensor",
            3
        )
        questionsList.add(question3)

        val question4 = Question(
            1,
            "What does the term GPU stand for?",
            "Graphite Producing Unit",
            "Gaming Processor Unit",
            "Graphical Proprietary Unit",
            "Graphics Processing Unit",
            4
        )
        questionsList.add(question4)

        val question5 = Question(
            1,
            "Moore's law originally stated that the number of transistors on a microprocessor chip would double every...",
            "Year",
            "Four Years",
            "Two Years",
            "Eight Years",
            1
        )
        questionsList.add(question5)

        val question6 = Question(
            1,
            "What five letter word is the motto of the IBM Computer company?",
            "Click",
            "Logic",
            "Pixel",
            "Think",
            4
        )
        questionsList.add(question6)

        val question7 = Question(
            1,
            "In programming, the ternary operator is mostly defined with what symbol(s)?",
            "??",
            "if then",
            "?:",
            "?",
            3
        )
        questionsList.add(question7)

        val question8 = Question(
            1,
            "On which computer hardware device is the BIOS chip located?",
            "Motherboard",
            "Hard Disk Drive",
            "Central Processing Unit",
            "Graphics Processing Unit",
            1
        )
        questionsList.add(question8)

        val question9 = Question(
            1,
            "What did the name of the Tor Anonymity Network orignially stand for?",
            "The Only Router",
            "The Orange Router",
            "The Ominous Router",
            "The Onion Router",
            4
        )
        questionsList.add(question9)

        val question10 = Question(
            1,
            "What was the first Android version specifically optimized for tablets?",
            "Eclair",
            "Honeycomb",
            "Marshmellow",
            "Froyo",
            2
        )
        questionsList.add(question10)
        return questionsList
    }
}