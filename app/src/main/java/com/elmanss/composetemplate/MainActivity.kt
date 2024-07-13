package com.elmanss.composetemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.elmanss.composetemplate.ui.screens.home.NavGraphs
import com.elmanss.composetemplate.ui.theme.ComposeTemplateTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent { ComposeTemplateTheme { DestinationsNavHost(navGraph = NavGraphs.root) } }
  }
}
