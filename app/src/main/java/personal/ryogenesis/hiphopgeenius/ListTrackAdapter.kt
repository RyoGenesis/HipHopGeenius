package personal.ryogenesis.hiphopgeenius

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListTrackAdapter (private val trackList: ArrayList<String>) : RecyclerView.Adapter<ListTrackAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(vwgroup: ViewGroup, viewType: Int): ListViewHolder {
        //inflate view layout to a view group (in this case the recycler view)
        val view: View = LayoutInflater.from(vwgroup.context).inflate(R.layout.track_names, vwgroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val trackNum = "${position+1}. "

        //insert data to text layout elements
        holder.tvTrackNum.text = trackNum
        holder.tvTrackName.text = trackList[position]
    }

    override fun getItemCount(): Int {
        return trackList.size
    }

    //class that hold references from layout
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTrackName: TextView = itemView.findViewById(R.id.tv_track_name)
        var tvTrackNum: TextView = itemView.findViewById(R.id.tv_track_number)
    }
}