package roguelike.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel

class StartScreen extends Screen {
  def displayOutput(terminal: AsciiPanel) {
    terminal.write("roguelike tutorial", 1, 1)
    terminal.writeCenter("-- press [enter] to start --", 22)
  }

  def respondToUserInput(key: KeyEvent): Screen = {
    if (key.getKeyCode == KeyEvent.VK_ENTER) {
      return new PlayScreen
    } else {
      return this
    }
  }
}

