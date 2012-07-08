package roguelike.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel

trait Screen {
  def displayOutput(terminal: AsciiPanel)
  def respondToUserInput(key: KeyEvent): Screen
}

