package personal.ryogenesis.hiphopgeenius

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

//adapter for list of albums that will be used in recycler view
class ListAlbumAdapter(private val albumList: ArrayList<Album>) : RecyclerView.Adapter<ListAlbumAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    //setter for onClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(vwgroup: ViewGroup, viewType: Int): ListViewHolder {
        //inflate view layout to a view group (in this case the recycler view)
        val view: View = LayoutInflater.from(vwgroup.context).inflate(R.layout.item_album, vwgroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val album = albumList[position]
        //insert image using Glide lib
        Glide.with(holder.itemView.context)
            .load(album.albumImg)
            .apply(RequestOptions().override(100,100))
            .into(holder.imgPhoto)

        //insert data to text layout elements
        holder.tvAlbumName.text = album.albumName
        holder.tvArtist.text = album.artistName
        holder.tvYear.text = album.releaseYear

        //call onItemClicked when itemView is clicked
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked((albumList[position]))}
    }

    override fun getItemCount(): Int {
        return albumList.size
    }

    //class that hold references from layout
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvAlbumName: TextView = itemView.findViewById(R.id.tv_album_name)
        var tvArtist: TextView = itemView.findViewById(R.id.tv_artist_name)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_album_cover)
        var tvYear: TextView = itemView.findViewById(R.id.tv_release_year)
    }

    //interface to handle click behavior
    interface OnItemClickCallback{
        fun onItemClicked(data: Album)
    }

}
