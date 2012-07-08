package roguelike.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel

class LoseScreen extends Screen {
  def displayOutput(terminal: AsciiPanel) {
    terminal.write("You lost", 1, 1)
    terminal.writeCenter("-- press [enter] to restart --", 22)
  }

  def respondToUserInput(key: KeyEvent): Screen = {
    if (key.getKeyCode == KeyEvent.VK_ENTER) {
      new PlayScreen
    } else {
      this
    }
  }
}

