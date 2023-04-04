package com.theghanaapi.Services

import com.theghanaapi.models.Presidents

class PresidentsService {
    var presidentList = listOf(
        Presidents(
            "Kwame Nkrumah",
            "1960-1966",
            "Nkrumah was Ghana's first president and led the country to independence. He was a prominent Pan-Africanist and socialist who believed in a united Africa."
        ),
        Presidents(
            "Joseph Arthur Ankrah",
            "1966-1969",
            "Ankrah came to power through a military coup that overthrew Nkrumah's government. He led a military government until he was overthrown in a countercoup."
        ),
        Presidents(
            "Akwasi Afrifa",
            "1969-1970",
            "Afrifa was a general in the Ghanaian Army who took power in the countercoup that overthrew Ankrah. He ruled briefly before being overthrown in another coup."
        ),
        Presidents(
            "Nii Amaa Ollennu",
            "1970",
            "Ollennu was the Speaker of the Ghanaian Parliament who served as acting president for a few months before a new government was established."
        ),
        Presidents(
            "Edward Akufo-Addo",
            "1970-1972",
            "Akufo-Addo was a prominent lawyer and politician who was elected president in 1970. He was overthrown in a military coup led by Ignatius Kutu Acheampong in 1972."
        ),
        Presidents(
            "Ignatius Kutu Acheampong",
            "1972-1978",
            "Acheampong was a general in the Ghanaian Army who overthrew Akufo-Addo's government and established a military government. He ruled until he was overthrown in a palace coup."
        ),
        Presidents(
            "Fred Akuffo",
            "1978-1979",
            "Akuffo was a general in the Ghanaian Army who came to power in the palace coup that overthrew Acheampong. He ruled until he was overthrown in another coup led by Jerry Rawlings."
        ),
        Presidents(
            "Jerry Rawlings",
            "1979-2001",
            "Rawlings was a flight lieutenant in the Ghanaian Air Force who came to power in a coup in 1979. He established a military government but later transitioned to a democratic government in 1992. Rawlings was elected president in democratic elections in 1992 and 1996 and served until 2001."
        ),
        Presidents(
            "John Agyekum Kufuor",
            "2001-2009",
            "Kufuor was a prominent politician who was elected president in 2000, becoming the first president of Ghana's fourth republic. He was re-elected in 2004 and served until 2009."
        ),
        Presidents(
            "John Evans Atta Mills",
            "2009-2012",
            "Mills was a law professor and politician who was elected president in 2008. He served until his death in 2012."
        ),
        Presidents(
            "John Dramani Mahama",
            "2012-2017",
            "Mahama was the vice president of Ghana who became president after Mills' death in 2012. He was elected to a full term in 2012 and served until he was defeated in the 2016 elections."
        ),
        Presidents(
            "Nana Akufo-Addo",
            "2017-present",
            "Akufo-Addo is a lawyer and politician who was elected president in 2016. He was re-elected in 2020 and is currently serving as Ghana's president."
        )
    )

    fun getPresidents(): List<Presidents> {
        return presidentList
    }

}