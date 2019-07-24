package com.ltmiller.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.ltmiller.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // use explicit intent to switch actions we KNOW we want to go to
        // as opposed to implicit intents, which go to apps that have the same type of action
        getStartedBtn.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
