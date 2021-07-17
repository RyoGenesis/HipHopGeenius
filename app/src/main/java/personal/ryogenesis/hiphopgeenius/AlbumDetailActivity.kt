package personal.ryogenesis.hiphopgeenius

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class AlbumDetailActivity : AppCompatActivity() {

    companion object {
        //constants for items transferred using intent
        const val ALBUM_ID = "album_id"
        const val INFO_LINK = "info_link"
    }

    //set the reference variables
    private lateinit var tvAlbumName: TextView
    private lateinit var imgCover: ImageView
    private lateinit var tvArtistName: TextView
    private lateinit var tvRelease: TextView
    private lateinit var tvAboutAlbum: TextView
    private lateinit var tvAlbumDesc: TextView
    private lateinit var tvLabelName: TextView
    private lateinit var btnMoreInfo: Button
    private lateinit var rvTrackList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album_detail)

        // show back button in action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //get textView and imgView references
        tvAlbumName = findViewById(R.id.tv_album_name)
        imgCover = findViewById(R.id.img_album_cover)
        tvArtistName = findViewById(R.id.tv_artist_name)
        tvRelease = findViewById(R.id.tv_release_year)
        tvAboutAlbum = findViewById(R.id.tv_about_album)
        tvAlbumDesc = findViewById(R.id.tv_album_info)
        tvLabelName = findViewById(R.id.tv_label_name)
        btnMoreInfo = findViewById(R.id.btn_more_info)
        rvTrackList = findViewById(R.id.rv_track_list)
        rvTrackList.setHasFixedSize(true)

        //add divider (hr line) for each items in recycler view
        rvTrackList.addItemDecoration(
            DividerItemDecoration(
                rvTrackList.context,
                DividerItemDecoration.VERTICAL
            )
        )

        insertAndSetupValues()
    }

    private fun insertAndSetupValues(){
        //setup variables to get intent values
        val id = intent.getIntExtra(ALBUM_ID,0)
        val album = AlbumData.listData[id]

        supportActionBar?.title = album.albumName

        //insert the album cover
        Glide.with(this)
            .load(album.albumImg)
            .into(imgCover)

        //fill out the data to references
        tvAlbumName.text = album.albumName
        tvArtistName.text = album.artistName
        tvRelease.append(album.releaseYear)
        val label = "\u00a9 ${album.labelName}"
        tvLabelName.text = label
        val aboutText = "About \"${album.albumName}\" : "
        tvAboutAlbum.text = aboutText
        tvAlbumDesc.text = album.description

        //setting up adapter to show track list
        rvTrackList.layoutManager = LinearLayoutManager(this)
        val listTrackAdapter = ListTrackAdapter(album.songList as ArrayList<String>)
        rvTrackList.adapter = listTrackAdapter
    }

    override fun finish() {
        super.finish()
        //making a slide out transition from album detail to home activity
        overridePendingTransition(android.R.anim.fade_in,android.R.anim.slide_out_right)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                //go back button
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun moreInfoGeniusPage(view: View){
        val url = intent.getStringExtra(INFO_LINK)
        val uri: Uri = Uri.parse(url ?: "https://genius.com") // missing 'http://' will cause crashed
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}