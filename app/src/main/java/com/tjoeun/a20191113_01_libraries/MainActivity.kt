package com.tjoeun.a20191113_01_libraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

    }

    override fun setValues() {

        var url = "https://pbs.twimg.com/profile_images/1153500695506460672/U9lK1j6K_400x400.jpg"

        Glide.with(mContext).load(url).into(profileImg)

    }


}
