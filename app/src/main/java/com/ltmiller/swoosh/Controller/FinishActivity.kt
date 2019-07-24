package com.ltmiller.swoosh.Controller

import android.os.Bundle
import com.ltmiller.swoosh.Model.Player
import com.ltmiller.swoosh.R
import com.ltmiller.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        searchLeaguesTxt.text = "Looking for ${player.league} ${player.skill} league near you ..."
    }
}
