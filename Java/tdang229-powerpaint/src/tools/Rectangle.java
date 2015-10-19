/**
 * 
 */
package tools;

import gui.DrawingPanel;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

/**
 * @author Trung
 *
 */
public class Rectangle extends AbstractAction {

    /***/
    private final DrawingPanel myPanel;
    /**
     * 
     */
    public Rectangle(final DrawingPanel thePanel) {
        super("Rectangle");
        myPanel = thePanel;
        putValue(Action.SELECTED_KEY, true);
    }

    /* (non-Javadoc)
     * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
     */
    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }

}