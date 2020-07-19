package com.example.demo0102_audioplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jean.jcplayer.model.JcAudio
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //初始化播放列表
        val jcAudios: ArrayList<JcAudio> = ArrayList()

        //在播放列表中添加音频资源
        jcAudios.add(JcAudio.createFromRaw("darktown_strutters_ball", R.raw.darktown_strutters_ball))

        //将播放列表绑定到播放器
        jcplayer.initPlaylist(jcAudios, null)

    }

    override fun onDestroy() {
        super.onDestroy()
        jcplayer.kill()
    }
}
