package personal.ryogenesis.hiphopgeenius

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    //set reference variables
    private lateinit var rvAlbums: RecyclerView
    private var list: ArrayList<Album> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //change action bar title
        supportActionBar?.title = "Hip Hop Geenius"

        //get reference from layout
        rvAlbums = findViewById(R.id.rv_albums)
        rvAlbums.setHasFixedSize(true)

        //add divider (hr line) for each items in recycler view
        rvAlbums.addItemDecoration(
            DividerItemDecoration(
                rvAlbums.context,
                DividerItemDecoration.VERTICAL
            )
        )

        //set data in album list
        list.addAll(AlbumData.listData)
        showRecyclerList()
    }

    private fun activityTransition(intent: Intent){
        startActivity(intent)
        //make slide in animation when moving to album detail activity
        overridePendingTransition(R.anim.slide_in_right, android.R.anim.fade_out)
    }

    private fun showRecyclerList(){
        //set recycler layout and set the adapter
        rvAlbums.layoutManager = LinearLayoutManager(this)
        val listAlbumAdapter = ListAlbumAdapter(list)
        rvAlbums.adapter = listAlbumAdapter

        //set on click listener command for each recycler view items
        listAlbumAdapter.setOnItemClickCallback(object: ListAlbumAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Album) {
                //set up data to be sent through intent to AlbumDetailActivity
                val albumDataIntent = Intent(this@MainActivity, AlbumDetailActivity::class.java)
                putIntentExtras(albumDataIntent, data)
                activityTransition(albumDataIntent)
            }
        })
    }

    private fun putIntentExtras(albumDataIntent: Intent, data: Album){
        albumDataIntent.putExtra(AlbumDetailActivity.ALBUM_ID, data.id)
        albumDataIntent.putExtra(AlbumDetailActivity.INFO_LINK, data.infoLink)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.action_bar_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_profile -> {
                val aboutIntent = Intent(this@MainActivity, AboutPageActivity::class.java)
                activityTransition(aboutIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}