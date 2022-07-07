package dev.jane.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter {
    class ContactsRvAdapter(var twitterList:List<Twitter>):
        RecyclerView.Adapter<contactViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactViewHolder {
            var itemView=LayoutInflater.from(parent.context)
                .inflate(R.layout.twitter_list_item,parent,false)
            return contactViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: contactViewHolder, position: Int) {
            var currentContact=twitterList.get(position)
            holder.tvname.text=currentTwitter.name
            holder.tvpost.text=currentTwitter.phone
            holder.tvmessage.text=currentTwitter.address
            holder.tvtweet.text=currentTwitter.email



        }

        override fun getItemCount(): Int {
            return twitterList.size
        }
    }
    class contactViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var tvName=itemView.findViewById<TextView>(R.id.tvname)
        var tvNumber=itemView.findViewById<TextView>(R.id.tvpost)
        var tvEmail=itemView.findViewById<TextView>(R.id.tvmessage)
        var tvAdress=itemView.findViewById<TextView>(R.id.tvtweet)
        var imgImage=itemView.findViewById<ImageView>(R.id.imgphoto)
}