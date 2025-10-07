package za.co.studysync.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import za.co.studysync.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // We'll wire actual Google SSO in Step 2
        binding.btnGoogle.setOnClickListener {
            // TODO: Implement Credential Manager Google Sign-In
        }

        binding.btnEmail.setOnClickListener {
            // TODO: Optional: email/password fallback
        }
    }
}
