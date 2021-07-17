package personal.ryogenesis.hiphopgeenius

data class Album(
    var id: Int = 0,
    var albumName: String = "",
    var albumImg: Int = 0,
    var artistName: String = "",
    var releaseYear: String = "",
    var labelName: String = "",
    var description: String = "",
    var songList: List<String> = arrayListOf(),
    var infoLink: String = ""
)
