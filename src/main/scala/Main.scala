package roguelike

import javax.swing.JFrame
import asciiPanel.AsciiPanel
import java.awt.event.KeyEvent
import java.awt.event.KeyListener
import roguelike.screens.Screen
import roguelike.screens.StartScreen

class Main extends JFrame with KeyListener {
  val terminal = new AsciiPanel
  terminal.write("roguelike tut", 1, 1)
  add(terminal)
  pack
  var screen: Screen = new StartScreen
  addKeyListener(this)
  repaint

  override def repaint() {
    terminal.clear
    screen.displayOutput(terminal)
    super.repaint
  }

  def keyPressed(e: KeyEvent) {
    screen = screen.respondToUserInput(e)
    repaint
  }

  def keyReleased(e: KeyEvent)
  def keyTyped(e: KeyEvent)
}

object Main {
  private val serialVersionUID = 1060623638149583738L

  def main(args: Array[String]) {
    var app = new Main
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    app.setVisible(true)
  }
}

