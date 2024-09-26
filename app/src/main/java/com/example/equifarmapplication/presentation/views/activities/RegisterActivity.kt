package com.example.equifarmapplication.presentation.views.activities

import android.content.Intent
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.equifarmapplication.R
import com.example.equifarmapplication.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        setupSigninPrompt()
    }

    private fun setupSigninPrompt() {
        val loginPromptText = getString(R.string.loginPrompt)
        val  spannableString = SpannableString(loginPromptText)

        val startIndex = loginPromptText.indexOf("Sign In")
        val endIndex = startIndex + "Sign In".length

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(view: View) {
                // Show ProgressBar when Register is clicked
                binding.progressBar.visibility = View.VISIBLE

                // Start RegisterAgentActivity
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false // Remove underline
                ds.color = resources.getColor(R.color.primaryColor, null)
            }
        }

        spannableString.setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.loginPrompt.text = spannableString
        binding.loginPrompt.movementMethod = LinkMovementMethod.getInstance()
    }
}