/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.eclipse.texlipse.texparser.node;

import org.eclipse.texlipse.texparser.analysis.*;

@SuppressWarnings("nls")
public final class TCpindex extends Token
{
    public TCpindex()
    {
        super.setText("\\printindex");
    }

    public TCpindex(int line, int pos)
    {
        super.setText("\\printindex");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCpindex(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCpindex(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCpindex text.");
    }
}
