package personal.ryogenesis.hiphopgeenius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class AboutPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)
        supportActionBar?.title = "About"
        // show back button in action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun finish() {
        super.finish()
        //making a slide out transition from about page to home activity
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
}