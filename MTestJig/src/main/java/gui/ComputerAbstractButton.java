package gui;

import Foundation.Utils;
import main.Command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class ComputerAbstractButton extends AbstractButton implements ActionListener {

  protected JButtonGroup group;
  protected Command command;
  protected int xPos;
  protected int yPos;
  protected boolean autoDeselect;

  public ComputerAbstractButton(Command cmd, int xpos, int ypos, boolean autoDeselect) {
    super();
    this.xPos = xpos;
    this.yPos = ypos;
    addActionListener(this);
    command = cmd;
    this.autoDeselect = autoDeselect;
  }

  public JButtonGroup getGroup() {
    return group;
  }

  public void setGroup(JButtonGroup group) {
    this.group = group;
  }

  public void doClick() {
    //this.setSelected(!this.isSelected());
    super.doClick();
  }

  public void actionPerformed(ActionEvent arg0) {
    if (command != null) {
      if (group != null) {
        group.handleButtonClick(this);
      }
      if (isSelected()) {
        command.execute();
        if(this.autoDeselect) {
          new Thread(new DeselectThread()).start();
        }
      } else {
        command.cancel();
      }

    }
  }

  private class DeselectThread implements Runnable {
    @Override
    public void run() {
      Utils.sleep(300);
      ComputerAbstractButton.this.setSelected(false);
    }
  }
}
