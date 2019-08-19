/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.texparser.node;

import org.eclipse.texlipse.texparser.analysis.*;

@SuppressWarnings("nls")
public final class TCend extends Token
{
    public TCend()
    {
        super.setText("\\end");
    }

    public TCend(int line, int pos)
    {
        super.setText("\\end");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCend(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCend(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCend text.");
    }
}
