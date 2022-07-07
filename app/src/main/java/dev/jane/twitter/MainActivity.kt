package dev.jane.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jane.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun displayTweets() {
        var tweet = Tweet("jane", "07123647565", "jane@gmail.com", "nakuru way", "")
        var tweet1 = Tweet("sha", "07354665857", "sha@gmail.com", "korongo road", "")
        var tweet2 = Tweet("rehema", "0724343254", "rehema@gmail.cim", "uhuru way", "")
        var tweet3 = Tweet("joan", "07030937736", "joan@gmail.com", "nyayo way", "")
        var tweet4 = Tweet("nyakwar", "07342156537", "nyakwar@gmail.com", "highway", "")

        var contactList = listOf(tweet, tweet1, tweet2, tweet3, tweet4)
        var contactsAdapter = TweetRvAdapter(contactList)
        binding.rvTweet.layoutManager = LinearLayoutManager(this)
        binding.rvTweet.adapter = contactsAdapter

    }
}