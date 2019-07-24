package com.ltmiller.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ltmiller.swoosh.Utilities.EXTRA_LEAGUE
import com.ltmiller.swoosh.R
import com.ltmiller.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)

    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false
        selectedSkill = "beginner"
    }

    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false
        selectedSkill = "baller"
    }

    fun onSkillFinishClicked(view: View){

        if(selectedSkill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            startActivity(finishActivity)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkill) // add extra info to intent to past forward
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show() // toast
        }
    }


}
