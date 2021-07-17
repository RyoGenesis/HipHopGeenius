package personal.ryogenesis.hiphopgeenius
//Credit for data sources : genius.com
object AlbumData {
    private val albumNames =
        arrayOf("CALL ME IF YOU GET LOST",
            "Please Excuse Me for Being Antisocial",
            "IGOR",
            "No Pressure",
            "Circles",
            "The Sailor",
            "ASTROWORLD",
            "Goodbye & Good Riddance",
            "DAMN.",
            "The Incredible True Story",
            "2014 Forest Hills Drive",
            "Because the Internet")

    private val albumDescription =
        arrayOf(
            "CALL ME IF YOU GET LOST is the seventh studio album by Tyler, The Creator. It is the follow-up to his May 2019 LP, IGOR.\n\n" +
                    "The album was first teased by a tag on a trunk that accompanied Tyler at the 2020 Grammy Awards. However, CMIYGL wasn’t teased as an album until a billboard was found in Los Angeles in June 2021, " +
                    "which read the album’s title along with a phone number. Over the following days, calling the number played snippets of several tracks on the album.\n\n" +
                    "The album pays homage to 2000-era mixtapes that were hosted by DJ Drama, who is also the host of this record. It brings full circle a late 2010 tweet in which Tyler declared that he wanted a Gangsta Grillz mixtape.",
            "Please Excuse Me For Being Antisocial is the debut studio album by Compton rapper Roddy Ricch. It was released on December 6, 2019.\n\n" +
                    "On October 11, 2019, Roddy released the album’s first single, the triumphant “Big Stepper.” He followed that up two weeks later with the Gunna assisted, “Start wit Me.” On November 25, 2019, he released the third and final single, “Tip Toe,” which featured the efforts of A Boogie Wit da Hoodie.\n\n" +
                    "On December 1, 2019, Roddy revealed the tracklist for Please Excuse Me for Being Antisocial, where he unveiled the song titles and majority of the features via Twitter.\n\n" + "The track “Antisocial” was noticeably missing in the album’s final release on December 6, 2019.",
            "IGOR (pronounced EEE-GORE), released on May 17, 2019, is Tyler, the Creator’s sixth studio album. " +
                    "The announcement of the album came after some speculations the week before, followed by the release of four snippets on " +
                    "Tyler, The Creator’s social media platforms.\n\n" +
                    "Thematically, the album’s arc describes the feeling of falling into love with someone and starting a relationship with them, becoming somewhat obsessed with them, " +
                    "the relationship failing, falling out of love and attempting to remain friends.\n\n" +
                    "It also received a Grammy Award for “Best Rap Album”.",
            "No Pressure is the sixth studio album and seventh professional project by Maryland rapper Logic, and serves as a sequel to his 2014 debut, Under Pressure." +
                    "In a similar fashion to how his 2018 project YSIV was teased, Logic released a “No Pressure Freestyle” in August 2019 that served as the first mention of this album and included lines found in songs on the project.\n\n" +
                    "Much like Under Pressure and the album that followed in 2015, The Incredible True Story, No Pressure features the ‘AI assistant’ Thalia in a narrative role similar to that of Under Pressure.",
            "Circles is Mac Miller’s sixth and final studio album and first posthumous album after his passing on September 7, 2018, due to an accidental drug overdose. This album is also meant to be a follow-up to Mac’s previous effort on Swimming, which detailed his struggles in life, and learning to move past his problems in order to become a better person, " +
                    "as he showed a strong desire to develop psychological growth and healing throughout the project. The two albums put together were meant to convey the phrase “Swimming in Circles”.\n\n" +
                    "There was no news until January 8, 2020, when Mac’s Instagram posted for the first time since his death. The post announced the along with the cover art and that the album would be coming out on January 17, 2020. " +
                    "A brief note from Malcolm’s family was attached about how much this album meant to him, and how grateful they are to the fans for keeping his memory alive.",
            "The Sailor is Indonesian rapper, producer and singer-songwriter Rich Brian’s sophomore album. It follows his debut full length project, 2018’s Amen. The album was executively produced by Brian, Bekon, Rappy and Sean Miyashiro, founder of record label 88rising.\n\n" +
                    "Citing inspirations as diverse as JAY-Z or The Beatles, the album’s production is cinematic, and a stark contrast from his previous record. " +
                    "Brian takes a step back from production here, as he helmed most of it on his debut. Instead, he showcases a more melodic flow and his singing abilities, that are uplifting and thematically different, as well as more insight on his Indonesian culture.",
            "ASTROWORLD is Travis Scott’s long-awaited third studio album, following his 2016 release Birds in the Trap Sing McKnight. The album is titled after Six Flags AstroWorld, a popular Houston amusement park. The park was demolished in 2005." +
                    " Despite several developers staking claims to develop the large vacant lot into use, nothing has been done with the space since.\n\n" +
                    "Scott confirmed that the album is a sequel to his 2015 album Rodeo, saying:\n" +
                    "\n" +
                    "'My whole idea was, if you locked into Rodeo, you definitely locked into ASTROWORLD. I’m just finishing the saga I started on my first album. This is supposed to be my second album. I had to go quick, because like I said, I had all these ideas, I just had to get off real quick, but now I’m finally back home with ASTROWORLD.'\n\n" +
                    "On December 7th, 2018, the album was nominated for the GRAMMY’s best rap album of 2018. Additionally, the hit “SICKO MODE” was nominated for both the best rap song and the best rap performance.",
            "Goodbye & Good Riddance is Juice WRLD’s debut album, released on May 23, 2018 through his label, Interscope Records. It features 15 tracks and is available for streaming on SoundCloud, Apple Music, Spotify, and Tidal.\n\n" +
                    "The album is supported by three singles, “All Girls Are the Same,” “Lucid Dreams” and “Lean Wit Me.”\n\n" +
                    "Goodbye & Good Riddance explores Juice WRLD’s current relationship and the struggles he endures. The subject matter of the album varies throughout the tracklist, from discussion of past love interests in songs like “All Girls Are the Same” and “Lucid Dreams,” to details of his overpowering drug addiction in songs like “Lean Wit Me” and “Black & White.” " +
                    "The album also touches upon feelings of invincibility and delusion in songs like “Hurt Me,” where his frequent abuse of opioids and other drugs has driven him to recklessness.",
            "DAMN., Kendrick Lamar’s third major studio album, was expected to be released on April 7, 2017, after he rapped these lines on “The Heart Part 4”:\n\n" +
                    "Y'all got ‘til April the 7th to get y'all shit together\n\n" +
                    "However, when the pre-order was released, it was announced that it would appear on Good Friday—April 14, 2017.\n\n" +
                    "This is Kendrick’s first full-length project since 2015’s To Pimp A Butterfly. In between the albums, Kendrick released the 8-track EP untitled unmastered.\n\n" +
                    "At the time of its release, DAMN. was the most critically acclaimed hip-hop album of the year, holding a 97/100 average rating on Metacritic. All 14 songs charted on the Billboard Hot 100 after the first week of tracking, dated May 6, 2017; with “HUMBLE.” and “DNA.” charting at #1 and #4 respectively.\n\n" +
                    "On May 4, DAMN. was certified platinum, making it Kendrick’s third straight platinum album and 2017’s first platinum-selling rap album. On July 10, 2017, the album was certified double platinum. Rolling Stone named it the Best Album of 2017 and it won Rap Album of the Year at the 2018 Grammy Awards held on January 28, 2018.",
            "The Incredible True Story is Logic’s sophomore studio album, released on November 13, 2015 through Def Jam Recordings and Visionary Music Group. The Incredible True Story debuted at number three on the US Billboard 200 with 135,000 album-equivalent units, of which 118,000 were pure album sales. On February 2, 2017, the album was certified gold by the Recording Industry Association of America (RIAA), for combined sales and album-equivalent units of over 500,000 units in the United States. " +
                    "The Incredible True Story is considered one of the best rap albums of 2015 and one of the best projects from Logic.\n\n" +
                    "The project is subtitled “…And the Transformation of the Man Who Saved the World,” and Logic planned to release a film – a “sci-fi epic” – along with the album that he wrote himself.",
            "In an interview with Complex, Cole spoke about the concept of the album:\n\n" +
                    "That’s exactly what it is. It’s crazy that I chose to record it in Hollywood because it’s such a “fuck Hollywood” album. Being out there maybe contributed to [me thinking], “I’m bugging. There’s some shit that’s way more important than how many albums I sell and if I’m the best.”\n" +
                    "\n" +
                    "On March 31st, 2015, it became the first hip-hop album in 25 years to be certified platinum without any features.",
            "Because the Internet is the second studio album from musician and TV star, Childish Gambino, which was inspired by his observations on how technology has changed social interactions.\n\n" +
                    "In an interview with MTV, Gambino revealed that singer, Beck gave him the idea for the title of the album and explained what the title meant:\n\n" +
                    "I was like, ‘Well, actually…because the Internet — and I hate starting sentences that way,’ and [Beck’s] like, ‘that should be your album title.’ It was a joke, but I just kept thinking about it. I was like, it really works, so Beck gave it to me."
        )

    private val albumCover =
        intArrayOf(R.drawable.album_cmiygl_cover,
                R.drawable.album_pemfba_cover,
                R.drawable.album_igor_cover,
                R.drawable.album_no_pressure_cover,
                R.drawable.album_circles_cover,
                R.drawable.album_sailor_cover,
                R.drawable.album_astroworld_cover,
                R.drawable.album_goodbye_cover,
                R.drawable.album_damn_cover,
                R.drawable.album_titslogic_cover,
                R.drawable.album_fhd_cover,
                R.drawable.album_becauseinternet_cover)

    private val artistNames =
        arrayOf("Tyler, The Creator",
            "Roddy Ricch",
            "Tyler, The Creator",
            "Logic",
            "Mac Miller",
            "Rich Brian",
            "Travis Scott",
            "Juice WRLD",
            "Kendrick Lamar",
            "Logic",
            "J. Cole",
            "Childish Gambino")

    private val albumYears =
        arrayOf("2021","2019","2019","2020","2020","2019","2018","2018","2017","2015","2014","2013")

    private val labelNames =
        arrayOf("Columbia Records & Sony Music Entertainment",
            "Atlantic Records & Warner Music Group",
            "RCA Records, Columbia Records & Sony Music Entertainment",
            "Def Jam Recordings & Visionary Music Group",
            "Warner Records",
            "12Tone Music & 88rising",
            "Cactus Jack Records, Epic Records & Grand Hustle Records",
            "Grade A Productions & Interscope Records",
            "Top Dawg Entertainment. Interscope Records & Aftermath Entertainment",
            "Def Jam Recordings & Visionary Music Group",
            "Columbia Records, Dreamville & Roc Nation",
            "Glassnote Records & Universal Music Group")

    private val moreInfoLinks =
        arrayOf("https://genius.com/albums/Tyler-the-creator/Call-me-if-you-get-lost",
            "https://genius.com/albums/Roddy-ricch/Please-excuse-me-for-being-antisocial",
            "https://genius.com/albums/Tyler-the-creator/Igor",
            "https://genius.com/albums/Logic/No-pressure",
            "https://genius.com/albums/Mac-miller/Circles",
            "https://genius.com/albums/Rich-brian/The-sailor",
            "https://genius.com/albums/Travis-scott/Astroworld",
            "https://genius.com/albums/Juice-wrld/Goodbye-good-riddance",
            "https://genius.com/albums/Kendrick-lamar/Damn",
            "https://genius.com/albums/Logic/The-incredible-true-story",
            "https://genius.com/albums/J-cole/2014-forest-hills-drive",
            "https://genius.com/albums/Childish-gambino/Because-the-internet")

    private val trackLists =
        arrayOf(
            arrayListOf("SIR BAUDELAIRE (Ft. DJ Drama","CORSO","LEMONHEAD (Ft. 42 Dugg)","WUSYANAME (Ft. Ty Dolla \$ign & YoungBoy Never Broke Again)","LUMBERJACK", "HOT WIND BLOWS (Ft. Lil Wayne)", "MASSA", "RUNITUP (Ft. Teezo Touchdown)", "MANIFESTO (Ft. Domo Genesis)", "SWEET / I THOUGHT YOU WANTED TO DANCE (Ft. Brent Faiyaz & Fana Hues)", "MOMMA TALK", "RISE! (Ft. DAISY WORLD)", "BLESSED", "JUGGERNAUT (Ft. Lil Uzi Vert & Pharrell Williams)", "WILSHIRE", "SAFARI"),
            arrayListOf("Intro","The Box","Start wit Me (Ft. Gunna)","Perfect Time","Moonwalkin (Ft. Lil Durk)","Big Stepper","Gods Eyes","Peta (Ft. Meek Mill)","Boom Boom Boom","Elyse's Skit","High Fashion (Ft. Mustard)","Bacc Seat (Ft. Ty Dolla \$ign)","Roll Dice","Prayers to the Trap God","Tip Toe (Ft. A Boogie wit da Hoodie)","War Baby"),
            arrayListOf("IGOR'S THEME", "EARFQUAKE", "I THINK", "EXACTLY WHAT YOU RUN FROM YOU END UP CHASING", "RUNNING OUT OF TIME", "NEW MAGIC WAND", "A BOY IS A GUN*", "PUPPET", "WHAT'S GOOD", "GONE, GONE / THANK YOU", "I DON'T LOVE YOU ANYMORE", "ARE WE STILL FRIENDS?"),
            arrayListOf("No Pressure", "Hit My Line", "GP4", "Celebration (Ft. Silas)", "Open Mic\\\\Aquarius III", "Soul Food II", "Perfect", "man i is", "DadBod", "5 Hooks", "Dark Place", "A2Z", "Heard Em Say", "Amen", "Obediently Yours"),
            arrayListOf("Circles","Complicated","Blue World","Good News","I Can See","Everybody","Woods","Hand Me Downs (Ft. Baro Sura)","That's on Me","Hands","Surf","Once a Day"),
            arrayListOf("The Sailor","Rapapapa (Ft. RZA)","Yellow (Ft. Bēkon)","Kids","Drive Safe","Confetti","Vacant","No Worries","100 Degrees","Slow Down Turbo","Curious","Where Does the Time Go (Ft. Joji)"),
            arrayListOf("STARGAZING", "CAROUSEL (Ft. Frank Ocean)", "SICKO MODE (Ft. Drake)", "R.I.P SCREW (Ft. Swae Lee)","STOP TRYING TO BE GOD (Ft. James Blake, Kid Cudi, Philip Bailey & Stevie Wonder)","NO BYSTANDERS (Ft. Juice WRLD & Sheck Wes)","SKELETONS (Ft. Pharrell Williams, Tame Impala & The Weeknd)", "WAKE UP (Ft. The Weeknd)", "5% TINT", "NC-17 (Ft. 21 Savage)", "ASTROTHUNDER", "YOSEMITE (Ft. Gunna & NAV)", "CAN'T SAY (Ft. Don Toliver)", "WHO? WHAT! (Ft. Quavo & Takeoff)", "BUTTERFLY EFFECT", "HOUSTONFORNICATION","COFFEE BEAN"),
            arrayListOf("Intro","All Girls Are the Same","Lucid Dreams","Lean wit Me","Wasted (Ft. Lil Uzi Vert)","Armed and Dangerous","I'm Still","Betrayal (Skit)","Candles","Scared of Love","Used To","Karma (Skit)","Hurt Me","Black & White","Long Gone","End of the Road","I'll Be Fine"),
            arrayListOf("BLOOD.","DNA.","YAH.","ELEMENT.","FEEL.","LOYALTY. (Ft. Rihanna)","PRIDE.","HUMBLE.","LUST.","LOVE. (Ft. Zacari)","XXX. (Ft. U2)","FEAR.","GOD.","DUCKWORTH."),
            arrayListOf("Contact","Fade Away","Upgrade","White People (Scene)","Like Woah","Young Jesus (Ft. Big Lenbo)","Innermission (Ft. Lucy Rose)","I Am the Greatest","The Cube (Scene)","Lord Willin'","City of Stars","Stainless (Ft. Dria)","Babel (Scene)","Paradise (Ft. Jesse Boykins III","Never Been","Run It","Lucidity (Scene)","The Incredible True Story"),
            arrayListOf("Intro (2014 Forest Hills Drive)","January 28th","Wet Dreamz","03' Adolescence","A Tale of 2 Citiez","Fire Squad","St. Tropez","G.O.M.D.","No Role Modelz","Hello","Apparently","Love Yourz","Note to Self"),
            arrayListOf("The Library (Intro)","I. Crawl","II. Worldstar","Dial Up","I. The Worst Guys (Ft. Chance the Rapper)","II. Shadows","III. Telegraph Ave. (\"Oakland\" by Lloyd)","IV. Sweatpants","V. 3005","Playing Around Before the Party Starts","I. The Party","II. No Exit","Death By Numbers","I. Flight of the Navigator","II. Zealots of Stockholm [Free Information]","III. Urn","I. Pink Toes (Ft. Jhené Aiko)","II. Earth: The Oldest Computer (The Last Night) (Ft. Azealia Banks)","III. Life: The Biggest Troll [Andrew Auernheimer]"))

    val listData: ArrayList<Album> get() {
        val list = arrayListOf<Album>()
        for (position in albumNames.indices){
            val album = Album()
            album.id = position
            album.albumName = albumNames[position]
            album.description = albumDescription[position]
            album.albumImg = albumCover[position]
            album.artistName = artistNames[position]
            album.releaseYear = albumYears[position]
            album.labelName = labelNames[position]
            album.infoLink = moreInfoLinks[position]
            album.songList = trackLists[position]
            list.add(album)
        }
        return list
    }
}

