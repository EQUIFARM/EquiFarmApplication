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
import com.example.equifarmapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            var  intent = Intent(this@LoginActivity,MainActivity::class.java)
            startActivity(intent)
        }

       setupRegisterPrompt()
    }

    private fun setupRegisterPrompt() {
        val registerPromptText = getString(R.string.register_prompt)
        val spannableString = SpannableString(registerPromptText)

        val startIndex = registerPromptText.indexOf("Register")
        val endIndex = startIndex + "Register".length

        val clickableSpan = object : ClickableSpan() {
            override fun onClick(view: View) {
                // Show ProgressBar when Register is clicked
                binding.progressBar.visibility = View.VISIBLE

                // Start RegisterAgentActivity
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.isUnderlineText = false // Remove underline
                ds.color = resources.getColor(R.color.primaryColor, null)
            }
        }

        spannableString.setSpan(clickableSpan, startIndex, endIndex, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        binding.tvRegisterPrompt.text = spannableString
        binding.tvRegisterPrompt.movementMethod = LinkMovementMethod.getInstance()
    }

    override fun onResume() {
        super.onResume()
        // Hide ProgressBar when returning to the activity
        binding.progressBar.visibility = View.GONE
    }
}