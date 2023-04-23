package mako.application.itunesearcher

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import mako.application.itunesearcher.databinding.ActivityDetailspageBinding
import mako.application.itunesearcher.units.Utils

class DetailsPageActivity : AppCompatActivity() {
    private var detailTitle: String? = ""
    private var detailDesc: String? = ""
    private var detailImage: String? = ""

    private lateinit var binding: ActivityDetailspageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setSupportActionBar(findViewById(R.id.toolbar))

        intent?.apply {
            detailTitle = getStringExtra(Utils.KEY_DETAIL_TITLE)
            detailDesc = getStringExtra(Utils.KEY_DETAIL_DESC)
            detailImage = getStringExtra(Utils.KEY_DETAIL_IMAGE)
        }

        binding = ActivityDetailspageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            toolbarLayout.title = detailTitle

            if(!TextUtils.isEmpty(detailImage)) {
                Picasso.get().load(detailImage).into(detailsImage)
            }

            detailsSummary.text = detailDesc
        }
    }
}