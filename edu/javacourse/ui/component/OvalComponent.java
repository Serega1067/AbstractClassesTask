package edu.javacourse.ui.component;

import java.awt.Graphics;

public class OvalComponent extends AbstractShape
{
    @Override
    public void paintShape(Graphics g)
    {
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}
