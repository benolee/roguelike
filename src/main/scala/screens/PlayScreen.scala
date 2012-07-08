package roguelike.screens

import java.awt.event.KeyEvent
import asciiPanel.AsciiPanel

class PlayScreen extends Screen {
  def displayOutput(terminal: AsciiPanel) {
    terminal.write("You are having fun.", 1, 1)
    terminal.writeCenter("-- press [escape] to lose or [enter] to win --", 22)
  }

  def respondToUserInput(key: KeyEvent): Screen = {
    key.getKeyCode match {
      case KeyEvent.VK_ESCAPE => new LoseScreen
      case KeyEvent.VK_ENTER  => new WinScreen
      case _                  => this
    }
  }
}

